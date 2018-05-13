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
  private int doorId;
  private String lockStatus;
  private String keyName;
  private String doorName;
  private String description;


  //default constructor
  public Door(){

    //assigns the indicated value to the doorId field
    this.doorId = 0;

    //assigns the indicated String to the lockStatus field
    this.lockStatus = "Locked";

    //assigns the indicated string to the keyName field
    this.keyName = "";

    //assigns the indicated string to the description field
    this.description = "";

  }//end constructor


  //method to get the value of the doorId field
  public int getDoorId(){

    //returns the value of the doorId field
    return this.doorId;
  }//end getDoorId


  //method to set the value of the doorId field
  public void setDoorId(double newId){

    //assigns the value of newId to the doorId field
    this.connectionId = newId;
  }//end setConnectionId


  //method to get the value of the lockStatus field
  public String getLockStatus(){

    //returns the value of the lockStatus field
    return this.lockStatus;
  }//end getLockStatus


  //method to set the value of the lockStatus field
  public void setLockStatus(String newStatus){

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
  public String toString(){

    return this.doorName + " -\n"
            + "Lock Status: " + this.lockStatus + "\n"
            + "Description: " + this.description + "\n";

  }//end toString

}//end class
