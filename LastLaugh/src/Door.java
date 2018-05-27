/*
  Mike Plata
  CoSci 290

  The Door class represents a physical door inside the text adventure.
  The Door class also represents a connection between two room objects
  and is what allows players to traverse from one room to the next.

  The doors in the game will start off locked, and it is the
  challenge of the player for them to unlock them, in order to advance
  through the game.
*/

//begin new class
public class Door extends GamePiece{

  //the Door class has 5 member fields/properties
  private int doorId;
  private String name;
  private String description;
  private String status;
  private String keyName;
  private Note note;
  
  
  
  //default constructor
  public Door(){

    //assigns the indicated value to the doorId field
    this.doorId = 0;
    
    //assigns the indicated strong to the name field
    this.name = "";
    
    //assigns the indicated string to the description field
    this.description = "";

    //assigns the indicated String to the lockStatus field
    this.status = "Locked";
    
    //assigns the indicated string to the keyName field
    this.keyName = "";
    
    //instantiates and initializes an object of type Note
    this.note = new Note();
  }//end constructor


  
  //method to get the value of the doorId field
  public int getDoorId(){

    //returns the value of the doorId field
    return this.doorId;
  }//end getDoorId


  
  //method to set the value of the doorId field
  public void setDoorId(int newId){

    //assigns the value of newId to the doorId field
    this.doorId = newId;
  }//end setConnectionId
  
  
  
  //method to get the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }//end getName


  
  //method to set the value of the name field
  public void setName(String newName){

    //assigns the value newName to the name field
    this.name = newName;
  }//end setName

  

  //method to get the value of the description field
  public String getDescription(){

    //returns the value of the description field
    return this.description;
  }//end getDescription
  


  //method to set the value of the description field
  public void setDescription(String newDesc){

    //assigns the value of newDesc to the description field
    this.description = newDesc;
  }//end setDescription
  
  
  
  //method to get the value of the status field
  public String getStatus(){

    //returns the value of the status field
    return this.status;
  }//end getStatus
  


  //method to set the value of the status field
  public void setStatus(String newStatus){

    //assigns the value of newStatus to the status field
    this.status = newStatus;
  }//end setStatus
  


  //method to get the value of the keyName field
  public String getKeyName(){

    //returns the value of the keyName field
    return this.keyName;
  }//end getKeyName
  


  //method to set the value of the keyName field
  public void setKeyName(String newName){

    //assigns the value newName to the keyName field
    this.keyName = newName;
  }//end setKeyName
  
  
  
  //method to get the note object stored in the note field
  public Note getNote() {
	  
	  //returns the objected stored in the note field
	  return this.note;
  }//end getNote
  
  
  
  //method to set the a note object in the note field
  public void setNote(Note newNote) {
	  
	  //stores newNote in the note field
	  this.note = newNote;
  }//end setNote

  

  //method to print a String representation of the in-game door
  public String toString(){

    //returns the concatonated string
	 return this.name + " -\n"
            + "Lock Status: " + this.status + "\n"
            + "Description: " + this.description + "\n";

  }//end toString

}//end class
