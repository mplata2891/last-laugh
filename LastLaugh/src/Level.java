/*
  Mike Plata
  CoSci 290

  Level
*/

import java.util.ArrayList;
public class Level extends GamePiece{

  private String name;
  private int numberOfRooms;
  private ArrayList<Room> rooms;

  public Level(){

    //sets the value of the name field to an empty string
    this.name = "";

    //sets the value of the numberOfRooms field to the indicated value
    this.numberOfRooms = 0;

    //creates a new array of type room and sets it to the room field
    this.rooms = new ArrayList<>[];
  }

  //method to return the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }

  //method to set the value of the name field
  public void setName(String newName){

    //sets the value of newName to the name field
    this.name = newName;
  }

  //method to return the value of the numberOfRooms field
  public int getNumberOfRooms(){

    //returns the value of the numberOfRooms field
    return this.numberOfRooms;
  }

  //method to set the value of the numberOfRooms field
  public void setNumberOfRooms(int newNumberOfRooms){

    //assigns the value of newNumberOfRooms to the numberOfRooms field
    this.numberOfRooms = newNumberOfRooms;
  }

  //method to return the values in the rooms field
  public Room getRooms(){

    //returns the value of the rooms fields
    return this.rooms;
  }

  //method to set the value of the rooms field
  public void setRooms(Room newRoom){

    //adds newRoom as an element in the rooms field
    this.rooms.add(newRoom);
  }
}
