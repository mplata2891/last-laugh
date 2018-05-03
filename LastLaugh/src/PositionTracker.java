/*
  Mike Plata
  CoSci 290

  The PositionTracker class acts a grid to track the user's
  location within the game. The PositionTracker class
  contains a multidimensional array of Room objecs.

  The PositionTracker class is a subclass of GamePiece
*/

//begining of new class
public class PositionTracker extends GamePiece{

  private int maxRows;
  private int maxColumns;
  private Space[][] map;
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
}
