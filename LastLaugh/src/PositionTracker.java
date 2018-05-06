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

  //the PositionTracher class has 4 member fields/properties
  private int maxRows;
  private int maxColumns;
  private Space[][] map;
  private boolean[][] position;

  //default constructor
  public PositionTracker(){

    //assigns the indicated value to the maxColumns field
    this.maxColumns = 0;

    //assigns the indicated value to the maxRows field
    this.maxRows = 0;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = 0;

    //assigns the indicated value to the exactRow field
    this.exactRow = 0;

    //creates a new array and assigns it to the map field
    this.map = new Space[this.maxRows][this.maxColumns];

    //creates a new array and assigns it to the position field
    this.position = new boolean[this.maxRows][this.maxColumns];
  }


  //implicit constructor
  public PositionTracker(int rows, int columns, int startRow, int startColumn){

    //assigns the indicated value to the maxRows field
    this.maxRows = rows;

    //assigns the indicated value to the maxColumns field
    this.maxColumns = columns;

    //assigns the indicated value to the exactRow field
    this.exactRow = startRow;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = startColumn;

    //creates a new array and assigns it to the map field
    this.map = new Space[this.maxRows][this.maxColumns];

    //invokes the fillMap method to fill the map with Room objects
    this.fillMap(this.maxRows, this.maxColumns);

    //creates a new array and assigns it to the position field
    this.position = new boolean[this.maxRows][this.maxColumns];

    //invokes the setPosition method to set player's location inside of map
    this.setPosition(this.maxRows, this.maxColumns, this.exactRow, this.exactColumn);
  }//end constructor


  //method to fill the map field with Room objects
  public void fillMap(){

    for(int i = 0; i < this.maxRows; i++){ //initiate for loop

      for(int j = 0; j < this.maxColums; j++){ //initiate for loop

        //instatiate a Room object in the given index of the table array
        this.map[i][j] = new Room();
      }//end for
    }//end for
  }//end fillMap


  //method to fill the array located in the position field
  public void setPosition(int maxRows, int maxColumns, int exactRow, int exactColumn){

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
  }//end setPosition

}//end class
