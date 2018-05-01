/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room is comprised
  of square spaces that form a grid
*/

public class Room extends GamePiece{

  private String name;
  private int maxColumns;
  private int maxRows;
  private int exactColumn;
  private int exactRow;
  private boolean[][] position;

  //default constructor
  public Room(){

    //assigns the indicated String to the name field
    this.name = "";

    //assigns the indicated value to the maxColumns field
    this.maxColumns = 0;

    //assigns the indicated value to the maxRows field
    this.maxRows = 0;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = 0;

    //assigns the indicated value to the exactRow field
    this.exactRow = 0;

    //creates a new array and assigns it to the position field
    this.position = new boolean[this.maxRows][this.maxColumns];
  }

  //implicit constructor
  public Room(String name, int rows, int columns, int startRow, int startColumn){

    //assigns the value of name to the name field
    this.name = name;

    //assigns the indicated value to the maxRows field
    this.maxRows = rows;

    //assigns the indicated value to the maxColumns field
    this.maxColumns = columns;

    //assigns the indicated value to the exactRow field
    this.exactRow = startRow;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = startColumn;

    //creates a new array and assigns it to the position field
    this.position = new boolean[this.maxRows][this.maxColumns];

    //initiate for loop to iterate through the multi-dimensional array
    //located in the position field, in order to place a marker to represent
    //the player's initial location inside the room
    for(int i = 0; i < this.maxRows; i++){

      //initiate if statement
      if(i == this.exactRow){

        //inititate for loop to iterate through columns
        for(int j = 0; j < this.maxColumns; j++){

          //initiatie if statement
          if(j == this.exactColumn){

            //assigns the value true to the indicated index
            position[i][j] = true;
          }//begin else
          else{

            //assigns the value false to the indicated index
            position[i][j] = false;
          }//end if-else
        }//end for
      }//begin else
      else{

        //inititate for loop to iterate through columns
        for(int j = 0; j < this.maxColumns; j++){

            //assigns the value true to the indicated index
            position[i][j] = false;
        }//end for
      }//end else
    }//end for
  }//end constructor

  //method to return the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }

  //method to set the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
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
  public void setExactRow(int row){

    //assigns the value of row to the exacctRow field
    this.exactRow = row;
  }

  //method to return the value of the position field
  public void getPosition(){

    //returns the value of the position field
    //return this.position[][];
  }
}
