/*
  Mike Plata
  CoSci 290

  The PositionTracker class acts a grid to track the user's
  location within the game. The PositionTracker class
  contains a multidimensional array of Room objecs.

  The PositionTracker class is a subclass of GamePiece
*/

//package LastLaugh.src;

//begining of new class
public class PositionTracker extends GamePiece{

  //the PositionTracker class has 6 member fields/properties
  private int maxRows;
  private int maxColumns;
  private int exactRow;
  private int exactColumn;
  private Room[][] map;
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
    this.map = new Room[this.maxRows][this.maxColumns];

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
    this.map = new Room[this.maxRows][this.maxColumns];

    //invokes the fillMap method to fill the map with Room objects
    this.fillMap();

    //creates a new array and assigns it to the position field
    this.position = new boolean[this.maxRows][this.maxColumns];

    //invokes the setPosition method to set player's location inside of map
    this.setPosition(this.maxRows, this.maxColumns, this.exactRow, this.exactColumn);
  }//end constructor


  //method to return the value of the maxRows field
  public int getMaxRows(){

    //returns the value ot the maxRows field
    return this.maxRows;
  }//end getMaxRows


  //method to set the value of the maxRows field
  public void setMaxRows(int newMax){

    //assigns the value of newMax to the maxRows field
    this.maxRows = newMax;
  }//end setMaxRows


  //method to return the value of the maxColumns field
  public int getMaxColumns(){

    //returns the value of the maxColumns field
    return this.maxColumns;
  }//end getMaxColumns


  //method to set the value of the maxColumns field
  public void setMaxColumns(int newMax){

    //assigns the value of newMax to the maxColumns field
    this.maxColumns = newMax;
  }//end setMaxColumns


  //method to return the value of the exactRow field
  public int getExactRow(){

    //returns the value of the exactRow field
    return this.exactRow;
  }//end getExactRow


  //method to set the value of the exactRow field
  public void setExactRow(int newRow){

    //assigns the value of newRow to the exactRow field
    this.exactRow = newRow;
  }//end setExactRow


  //method to return the value of the exactColumn field
  public int getExactColumn(){

    //returns the value of the exactColumn field
    return this.exactColumn;
  }//end getExactColumn

  public void setExactColumn(int i){
    this.exactColumn = i;
  }
  //method to return the object in the given index of the map field
  public Room getRoom(int row, int column){

    //returns the object in the given index of the map field
    return this.map[row][column];
  }//end getSpace


  //method to set an object in the given index of the map field
  public void setRoom(Room newRoom, int row, int column){

    //places spaceType in the given index of the map field
    this.map[row][column] = newRoom;
  }//end setSpace


  //method to fill the map field with Space objects
  public void fillMap(){

    for(int i = 0; i < this.maxRows; i++){ //initiate for loop (1)

      for(int j = 0; j < this.maxColumns; j++){ //initiate for loop (2)

        //instatiate a Room object in the given index of the table array
        this.map[i][j] = new Room();
      }//end for (2)
    }//end for (1)
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
