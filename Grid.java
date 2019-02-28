class Grid
{
  public Grid(int ROWS, int COLUMNS, Values[][] SPACE) {
    int row, column;
    for (row = 0; row < ROWS; row++) {
      for (column = 0; column < COLUMNS; column++) {
        SPACE[row][column] = Values.Blank;
      }
    }
  }
}
