/*
  Mike Plata
  CoSci 290

  Room
*/

public class Room extends GamePiece{

  private int maxColumns;
  private int maxRows;
  private int exactColumn;
  private int exactRow;
  private int[][] position;

  //default constructor
  public Room(){

    //assigns the indicated value to the maxColumns field
    this.maxColumns = 0;

    //assigns the indicated value to the maxRows field
    this.maxRows = 0;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = 0;

    //assigns the indicated value to the exactRow field
    this.exactRow = 0;

    //creates a new array and assigns it to the position field
    this.position = new int[columns][rows];
  }

  //method to return the value of the columns field
  public int getColumns(){

    //returns the value of the columns field
    return this.maxColumns;
  }

  //method to set the value of teh columns field
  public void setColumns(int newSize){

    //assigns the value of newSize to the columns field
    this.maxColumns = newSize;
  }

  //method to return the value of the rows field
  public int getRows(){

    //returns the value of the rows field
    return this.maxRows;
  }

  //method to set the value of the rows field
  public void setRows(int newSize){

    //assigns the value of newSize to the rows field
    this.maxRows = newSize;
  }

  //method to return the value of the exactColumn field
  public int getExactColumn(){

    //returns the value of the exactColumn field
    return this.exactColumn;
  }

  //method to set the value of the exactColumn field
  public void setExactColumn(int column){

    //assigns the value of column to the exactColumn field
    this.exactColumn = column;
  }

  //method to return the value of the exactRow field
  public int getExactRow(){

    //returns the value of the exactRow field
    return this.exactRow;
  }

  //method to set the value of the exactRow field
  public void setExacctRow(int row){

    //assigns the value of row to the exacctRow field
    this.exactRow = row;
  }

  //method to return the value of the position field
  public int[][] getPosition(){

    //returns the value of the position field
    return this.position[][];
  }
}
