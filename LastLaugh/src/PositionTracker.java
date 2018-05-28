/*FINALIZED*/

/*
  Mike Plata
  CoSci 290

  The PositionTracker class acts a grid to track the user's
  location within the game. The PositionTracker class
  contains a multidimensional array of Room objecs.

  The PositionTracker class is a subclass of GamePiece
*/

//begin new class
public class PositionTracker extends GamePiece{

  //the PositionTracker class has 5 member fields/properties
  private int maxRows;
  private int maxColumns;
  private int exactRow;
  private int exactColumn;
  private Room[][] map;



  //default constructor
  public PositionTracker(){

    //assigns the indicated value to the maxColumns field
    this.maxColumns = 3;

    //assigns the indicated value to the maxRows field
    this.maxRows = 3;

    //assigns the indicated value to the exactColumn field
    this.exactColumn = 0;

    //assigns the indicated value to the exactRow field
    this.exactRow = 0;

    //creates a new array and assigns it to the map field
    this.map = new Room[this.maxRows][this.maxColumns];
  }//end constructor
  


  //method to return the value of the maxRows field
  public int getMaxRows(){

    //returns the value of the maxRows field
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
  
  
  
  //method to set the value of the exactColumn field
  public void setExactColumn(int newColumn){
	  
	//assigns the value of newColumn to the exactColumn field
    this.exactColumn = newColumn;
  }//end setExactColumn
  
  
  
  //method to get the array stored in the map field
  public Room[][] getMap(){
	  
	  //returns the array stored in the map field
	  return this.map;
  }//end getMap
  
  
  
  //method to return the Room object in the given index of the map field
  public Room getRoom(int row, int column){

    //returns the object in the given index of the map field
    return this.map[row][column];
  }//end getSpace
  
  
  
  //method to return the Room object the Player object is currently in
  public Room getCurrentRoom() {
	  
	  //returns the object in the given index of the map field
	  return this.map[this.exactRow][this.exactColumn];
  }//end getCurrentRoom

}//end class
