/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room is comprised
  of square spaces that form a grid
*/

public class Room extends GamePiece{

  private String name;

  

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

  //method to return the value of the position field
  public void getPosition(){

    //returns the value of the position field
    //return this.position[][];
  }
}
