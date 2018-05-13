/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room has its own
  name, Id number, contains a variety of items and doors.
*/
import java.util.*;

public class Room extends GamePiece{

  //the Room class has 4 member fields/properties
  private String name;
  private int roomId;
  private Door door;
  private ArrayList<Item> contents;


  //default constructor
  public Room(){

    //assigns the value of the indicated string to the name field
    this.name = "";

    //assigns the indicated value to the roomId field
    this.roomId = 0;

    //instantiates an object of type Door and stores it in the door field
    this.door = new Door();

    //instantiates an ArrayList of type Item and stores it in the contents field
    this.contents = new ArrayList<>();

  }//end constructor


  //method to return the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }//end getName


  //method to set the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
  }//end setName


  //method to get the value of the roomId field
  public int getRoomId(){

    //returns the value of the roomId field
    return this.roomId;
  }//end getRoomId


  //method to set the value of the roomId field
  public void setRoomId(int newId){

    //assigns the value of newId to the roomId field
    this.roomId = newId;
  }//end setRoomId


  //method to get the Door object located in the door field
  public Door getDoor(){

    //returns the Door object located in the door field
    return this.door;
  }//end getDoor


  //method to add elements to the contents member field
  public void addItem(Item item){

    //adds item to an element in the ArrayList
    this.contents.add(item);
  }//end addItem


  //method to return an Item in the list
  public String getItem(int index){

    //returns Item located in specific indexe
    return this.contents.get(index).getName();
  }//end getItem


  public int getNumberOfItems(){

    return this.contents.size();
  }




}//end class
