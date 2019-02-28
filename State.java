class State {
  public boolean Draw(int ROWS, int COLUMNS, Values[][] SPACE) {
    for (int row = 0; row < ROWS; row++)
    {
      for(int column = 0; column < COLUMNS; column++)
      {
        if(SPACE[row][column] == Values.Blank)
        {
          return false;
        }
      }
    }
    return true;
  }
  public boolean Won(Values Value, Values[][] SPACE, int currentRow, int currentColumn)
  {
    /*Row*/
    if(SPACE[currentRow][0] == Value
    && SPACE[currentRow][1] == Value
    && SPACE[currentRow][2] == Value)
    {
      return true;
    }
    /*Column*/
    if(SPACE[0][currentColumn] == Value
    && SPACE[1][currentColumn] == Value
    && SPACE[2][currentColumn] == Value)
    {
      return true;
    }
    /*Diagonal */
    if(currentRow == currentColumn
    && SPACE[0][0] == Value
    && SPACE[1][1] == Value
    && SPACE[2][2] == Value)
    {
      return true;
    }
    /*Opposite Diagonal*/
    if(currentRow + currentColumn == 2
    && SPACE[0][2] == Value
    && SPACE[1][1] == Value
    && SPACE[2][0] == Value)
    {
      return true;
    }
    return false;
  }
}
