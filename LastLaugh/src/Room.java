/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room has its own
  name, Id number, contains a variety of PuzzlePieces and doors.
*/

//declare imports
import java.util.ArrayList;

//begin new class
public class Room extends GamePiece{

  //the Room class has 4 member fields/properties
	private int roomId;
	private String name;
  private Door door;
  private Caretaker caretaker;
  private ArrayList<PuzzlePiece> contents;
  private String description;
  


  //default constructor
  public Room(){

	//assigns the indicated value to the roomId field
	this.roomId = 0;
	
	//assigns the value of the indicated string to the name field
    this.name = "";

    //instantiates an object of type Door and stores it in the door field
    this.door = new Door();
    
    //instantiates an object of type caretaker and stores it in the caretaker field
    this.caretaker = new Caretaker();

    //instantiates an ArrayList of type PuzzlePiece and stores it in the contents field
    this.contents = new ArrayList<>();
    
    //assigns the given string to the description field
    this.description = "";
  }//end constructor
  


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


  
  //method to get the Door object located in the door field
  public Door getDoor(){

    //returns the Door object located in the door field
    return this.door;
  }//end getDoor
  


  //method to assign a door object in the door field
  public void setDoor(Door newDoor){

	//stores the newDoor object in the door field
    this.door = newDoor;
  }//end setDoor
  
  
  
  //method to get the caretaker object in the caretaker field
  public Caretaker getCaretaker() {
	  
	  //returns the Caretaker object that is stored in the caretaker field
	  return this.caretaker;
  }
  
  
  
  //method to set the Caretaker object in to the caretaker field
  public void setCaretaker(Caretaker newCaretaker) {
	  
	  //assigns the newCaretaker object into the caretaker field
	  this.caretaker = newCaretaker;
  }//end setCaretaker
  
  
  
  //method to return an PuzzlePiece in the list
  public PuzzlePiece getPuzzlePiece(int index){

    //returns PuzzlePiece located in specific index
    return this.contents.get(index);
  }//end getPuzzlePiece


  
  //method to add elements to the contents member field
  public void addPuzzlePiece(PuzzlePiece PuzzlePiece){

    //adds PuzzlePiece to an element in the ArrayList
    this.contents.add(PuzzlePiece);
  }//end addPuzzlePiece

  

  //method to get the number of puzzle pieces that are in the room
  public int getNumberOfPuzzlePieces(){

	//returns the number of puzzle pieces stored in the contents field
    return this.contents.size();
  }//end getNumberOfPuzzlePieces
  
  
  
  //method to get the value of the description field
  public String getDescription() {
	  
	  //returns the value of the description field
	  return this.description;
  }//end getDescription
  
  
  
  //method to set the value of the description field
  public void setDescription(String newDescription) {
	  
	  //assigns the value of newDescription to the description field
	  this.description = newDescription;
  }//end setDescription



  //method to return the Room object as a String
  public String toString() {
	  
	  //returns the indicated String
	  return "Room " + this.roomId + "-\n"
			  + "Room Name: " + this.name + "\n"
			  + "Doors: 1\n"
			  + "Caretaker: 1\n"
			  + "Puzzle Pieces: " + this.getNumberOfPuzzlePieces() + "\n\n";
  }//end toString
  
}//end class
