/*Checked*/

/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room has its own
  name, description, contains a variety of PuzzlePieces,
  a caretaker and a door.
*/

//declare imports
import java.util.ArrayList;

//begin new class
public class Room extends GamePiece{

	//the Room class has 7 member fields/properties
	private String name;
	private String description;
	private int numberOfPuzzlePieces;
	private ArrayList<PuzzlePiece> pieces;
	private PuzzlePiece selectedPuzzlePiece;
	private Caretaker caretaker;
	private Door door;
	
	
	
  //default constructor
  public Room(){
	
	//assigns the value of the indicated string to the name field
    this.name = "Default Room Name";
    
    //assigns the given string to the description field
    this.description = "Default Room Description";

    //assigns the given value to the numberOfPuzzlePieces field
    this.numberOfPuzzlePieces = 0;

    //instantiates an ArrayList of type PuzzlePiece and stores it in the pieces field
    this.pieces = new ArrayList<>();
    
    //instantiates a new object of type PuzzlePiece and stores it in the selectedPuzzlePiece field
    this.selectedPuzzlePiece = new PuzzlePiece();
    
    //instantiates an object of type caretaker and stores it in the caretaker field
    this.caretaker = new Caretaker();
    
    //instantiates an object of type Door and stores it in the door field
    this.door = new Door();
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

  

  //method to get the number of puzzle pieces that are in the room
  public int getNumberOfPuzzlePieces(){

	//returns the number of puzzle pieces stored in the pieces field
    return this.numberOfPuzzlePieces;
  }//end getNumberOfPuzzlePieces
  
  
  
  //method to set the value of the numberOfPuzzlePieces field
  public void setNumberOfPuzzlePieces(int newSize) {
	  
	  //assigns the value of newSize to the numberOfPuzzlePieces field
	  this.numberOfPuzzlePieces = newSize;
  }//end setNumberOfPuzzlePieces


  
  //method to add elements to the pieces member field
  public void addPuzzlePiece(PuzzlePiece PuzzlePiece){

    //adds PuzzlePiece to an element in the ArrayList
    this.pieces.add(PuzzlePiece);
  }//end addPuzzlePiece
  
  
  
  //method to return an PuzzlePiece in the list
  public PuzzlePiece getPuzzlePiece(int index){

    //returns PuzzlePiece located in specific index
    return this.pieces.get(index);
  }//end getPuzzlePiece

  
  
  //method to return the object stored in the slectedPuzzlePiece field
  public PuzzlePiece getSelectedPuzzlePiece() {
	  
	  //returns the object in the selectedPuzzlePiece field
	  return this.selectedPuzzlePiece;
  }//end getSelectedPuzzlePiece
  
  
  
  //method to assigns as object to the selectedPuzzlePiece field
  public void setSelectedPuzzlePiece(PuzzlePiece piece) {
	  
	  //stores the piece object in the slectedPuzzlePiece field
	  this.selectedPuzzlePiece = piece;
  }//end setSelectedPuzzlePiece
  
  
  
  //method to get the caretaker object in the caretaker field
  public Caretaker getCaretaker() {
	  
	  //returns the Caretaker object that is stored in the caretaker field
	  return this.caretaker;
  }//end getCaretaker
  
  
  
  //method to set the Caretaker object in to the caretaker field
  public void setCaretaker(Caretaker newCaretaker) {
	  
	  //assigns the newCaretaker object into the caretaker field
	  this.caretaker = newCaretaker;
  }//end setCaretaker


  
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



  //method to return the Room object as a String
  public String toString() {
	  
	  //returns the indicated String
	  return "Room Name: " + this.name + "\n"
			  + "Description: " + this.getDescription() + "\n"
			  + "Puzzle Pieces: " + this.getNumberOfPuzzlePieces() + "\n"
			  + "Caretaker: 1\n"
			  + "Doors: 1\n\n";        
  }//end toString
  
}//end class
