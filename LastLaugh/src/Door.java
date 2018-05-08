/*
  Mike Plata
  CoSci 290

  The Door class represents a physical door inside the text adventure.
  The Door class also represents a connection between two room objects
  and is what allows players to traverse from one room to the next.

  Most of the doors in the game will start off locked, and it is the
  challenge of the player for them to unlock them, in order to advance
  through the game.
*/

//begin new class
public class Door extends GamePiece{

  //the Door class has 4 member fields/properties
  private int connectionId; //identifies which two Rooms it connects
  private boolean lockStatus; //true means locked; false means unlocked
  private String keyName; //name of the key needed to unlock the door
  private String doorName;
  private String description;


  //default constructor
  public Door(){

    //assigns the indicated value to the connectionId field
    this.connectionId = 0;

    //assigns the indicated value to the lockStatus field
    this.lockStatus = true;

    //assigns the indicated string to the keyName field
    this.keyName = "";

    //assigns the indicated string to the description field
    this.description = "";
  }//end constructor


  //implicit constructor
  public Door(int id, boolean status, String name, String desc){

    //assigns the value of id to the connectionID field
    this.connectionId = id;

    //assigns the value of status to the lockStatus field
    this.lockStatus = status;

    //assigns the value of name to the keyName field
    this.keyName = name;

    //assigns the value of desc to the description field
    this.description = desc;
  }//end constructor


  //method to get the value of the connectionId field
  public int getConnectionId(){

    //returns the value of the connectionId field
    return this.connectionId;
  }//end getConnectionId


  //method to set the value of the connectionId field
  public void setConnectionId(int newId){

    //assigns the value of newId to the connectionId field
    this.connectionId = newId;
  }//end setConnectionId


  //method to get the value of the lockStatus field
  public boolean getLockStatus(){

    //returns the value of the lockStatus field
    return this.lockStatus;
  }//end getLockStatus


  //method to set the value of the lockStatus field
  public void setLockStatus(boolean newStatus){

    //assigns the value of newStatus to the lockStatus field
    this.lockStatus = newStatus;
  }//end setLockStatus


  //method to get the value of the keyName field
  public String getKeyName(){

    //returns the valud of the keyName field
    return this.keyName;
  }//end getKeyName


  //method to set the value of the keyName field
  public void setKeyName(String newName){

    //assigns the value newName to the keyName field
    this.keyName = newName;
  }//end setKeyName


  //method to get the value of the doorName field
  public String getDoorName(){

    //returns the value of the doorName field
    return this.doorName;
  }//end getKeyName


  //method to set the value of the doorName field
  public void setDoorName(String newName){

    //assigns the value newName to the doorName field
    this.doorName = newName;
  }//end setKeyName


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


  //method to print a String representation of the in-game door
  public void printDoor(){

    //prints the name of the door and a description of the door
    System.out.println(this.doorName + ":\n"
                        + this.description + "\n");
  }//end printDoor

}//end class
