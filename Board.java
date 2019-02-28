 class Board{
   private Grid grid;
   private State state;

   public Board(int ROWS, int COLUMNS, Values[][] SPACE)
   {
     grid = new Grid(ROWS, COLUMNS, SPACE);
     state = new State();
   }
   boolean StateWon(Values Value, Values[][] SPACE, int currentRow, int currentColumn){
     if(state.Won(Value, SPACE, currentRow, currentColumn)){
       return true;
     }
     return false;
   }

   boolean StateDraw(int ROWS, int COLUMNS, Values[][] SPACE){
     if(state.Draw(ROWS, COLUMNS, SPACE)){
       return true;
     }
     return false;
   }
 }
