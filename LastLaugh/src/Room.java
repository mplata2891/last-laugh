/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room has its own
  name, Id number, contains a variety of items and doors.
*/

public class Room extends GamePiece{

  //the Room class has 4 member fields/properties
  private String name;
  private int roomId;
  private ArrayList<Item> contents;
  private ArrayList<Door> connections;

  //default constructor
  public Room(){

    //assigns the value of the indicated string to the name field
    this.name = "";

    //assigns the given value to the roomId field
    this.roomId = 0;//leaving this value a zero means the room is an empty space

    //instantiates a new ArrayList of type Item and stores it to the contents field
    this.contents = new ArrayList<>();

    //instantiates a new ArrayList of type Door and stores it to the connections field
    this.connections = new ArrayList<>();
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


  //method to add elements to the contents member field
  public void addItem(Item item){

    //adds item to an element in the ArrayList
    this.contents.add(item);
  }//end addItem


  //method to return an Item in the list
  public Item getItem(int index, Item object){

    //returns Item located in specific indexe
    this.contents.get(index, object);
  }//end getItem


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


  //method to get the Door object in the ArrayList located in the connections field
  public Door getDoor(int index){

    //returns the Door object located in the given index
    return this.connections.get(index);
  }//end getDoor

}//end class
