import java.util.Scanner;

class Oxo {
  private int ROWS = 3;
  private int COLUMNS = 3;
  private Values[][] SPACE;
  private Display display;
  private Board board;
  private GameState State;
  private Values Player;
  private int currentRow, currentColumn;
  private Scanner Input = new Scanner (System.in);

  public static void main(String[] args)
  {
    new Oxo();
  }

  public Oxo()
  {
    SPACE = new Values[ROWS][COLUMNS];
    display = new Display();
    board = new Board(ROWS, COLUMNS, SPACE);
    Player = Values.Nought;
    State = GameState.Playing;

    display.print(ROWS, COLUMNS, SPACE);
    while(State.equals(GameState.Playing))
    {
      Move(Player);
      display.print(ROWS, COLUMNS, SPACE);
      gameState(Player, ROWS, COLUMNS, SPACE);
      if(State.equals(GameState.Cross_Won)) {
        System.out.println("Player X has won");
      }
      if(State.equals(GameState.Nought_Won)) {
        System.out.println("Player O has won");
      }
      if(State.equals(GameState.Draw)) {
        System.out.println("It is a Draw");
      }
      if(Player.equals(Values.Cross))
      {
        Player =  Values.Nought;
      }
      else{
        Player = Values.Cross;
      }
    }
  }

  private void Move(Values Player)
  {
    boolean validInput = false;
    while(!validInput){
      if (Player == Values.Cross)
      {
        System.out.print("Player 'X', enter your move (for example:'a 1'): ");
      }
      else
      {
        System.out.print("Player 'O', enter your move (for example:'a 1'): ");
      }
      int row = Input.next().charAt(0) - 'a';
      int column = Input.nextInt() - 1;
      if (row >= 0 && row < ROWS && column >= 0 && column < COLUMNS
      && SPACE[row][column].equals(Values.Blank))
      {
        SPACE[row][column] = Player;
        currentRow = row;
        currentColumn = column;
        validInput = true;
      }
      else
      {
        System.out.println("Invalid move at (" + (char)(row + 'a') + "," + (column + 1)
        + ").");
      }
    }
  }

  private void gameState(Values Player,int ROWS, int COLUMNS, Values[][] SPACE)
  {
    if(board.StateWon(Player, SPACE, currentRow, currentColumn))
    {
      if(Player.equals(Values.Cross)){
        State = GameState.Cross_Won;
      }
      else
      {
        State = GameState.Nought_Won;
      }
    }
    if(board.StateDraw(ROWS, COLUMNS, SPACE))
    {
      State = GameState.Draw;
    }
  }
}
