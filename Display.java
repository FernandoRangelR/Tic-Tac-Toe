class Display{
  void print(int ROWS, int COLUMNS, Values[][] SPACE) {
    int row, column;
    System.out.println("    1   2   3 ");
    for (row = 0; row < ROWS; row++)
    {
      System.out.print(" " + (char)('a' + row) + " ");
      for (column = 0; column < COLUMNS; column++)
      {
        if(SPACE[row][column].equals(Values.Cross))
        {
          System.out.print(" X ");
        }
        if(SPACE[row][column].equals(Values.Nought))
        {
          System.out.print(" O ");
        }
        if(SPACE[row][column].equals(Values.Blank))
        {
          System.out.print("   ");
        }
        if (column < COLUMNS - 1) System.out.print("|");
      }
      System.out.println();
      if (row < ROWS - 1) {
        System.out.println("   -----------");
      }
    }
  }
}
