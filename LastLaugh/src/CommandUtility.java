/*
  Mike Plata
  CoSci 290

  The CommandUtility class is a list of methods that help
  interpret and carry out the commands given by the player
  during game play.
*/

//begin new class
public class CommandUtility{

  //method to move a player object from their current location in the map
  //to a new location
  public PositionTracker movePlayer(PositionTracker tracker, int direction){

    //instantiate and initialize objects
    PositionTracker tempTracker = new PositionTracker();

    //declare and initialize variables
    boolean moveIsValid = false;

    tempTracker = tracker;//assign the value of tracker to tempTracker

  	moveIsValid = this.checkMove(direction, tracker);//invoke the checkMove method

  	if(moveIsValid == true)//initiate if statement
  		tempTracker = this.makeMove(tracker);//invoke the makeMove method

  	return tempTracker;//return the value(s) of tempTraccker
  }//end movePlayer


  //method to check if the desired player move is a valid one
  public boolean checkMove(int direction, PositionTracker tracker){

    //declare and initialize variables
    boolean validFlag = false;
  	boolean roomExists = false;
    boolean doorExistsAndUnlocked = false;

    //invoke the checkDirection method
    roomExists = this.checkDirection(tracker, direction);

    if(roomExists == true)//initiate if statement
      doorExists = this.checkDoor();//invoke the checkDoor method

    if(doorExists == true)//initiate if statement
      doorIsUnlocked = this.checkLock();//invoke the checkLock method

    //initiate if statement
  	if(roomExists == true && doorExists == true && doorIsUnlocked == true)
  		validFlag = true;//assigns the value of true to validFlag

  	return validFlag;//returns the value of validFlag
  }//end checkMove


  //method to check if a particular direction is a valid move
  public boolean checkDirection(PositionTracker tracker, int direction){

    switch(direction){//initiate switch statement, checking the value of direction

      //enter case 1 and invoke the checkNorth method
      case 1:	return this.checkNorth(tracker);

      //enter case 2 and invoke the checkSouth method
      case 2:	return this.checkSouth(tracker)

      //enter case 3 and invoke the checkEast method
      case 3:	return this.checkEast(tracker);

      //enter case 4 and invoke the checkWest method
      case 4:	return this.checkWest(tracker);
  	}//end switch
  }//end checkDirection


  //method to check if moving north in the map is a valid move
  public boolean checkNorth(PositionTracker tracker){

    //instantiate and initialize objects
    EmptySpace notRoom = new EmptySpace();

  	if(tracker.getExactRow() == 0){//initiate if statement
      return false;//return a value of false

    //initiate if statement
    if(tracker.getSpace((tracker.getExactRow() - 1), tracker.getExactColumn()) == notRoom){
  		return false;//return a value of false

  	return true;//return a value of true
  }//end checkNorth


  //method to check if moving south in the map is a valid move
  public boolean checkSouth(PositionTracker tracker){

    //instnatiate and initialize objects
    EmptySpace notRoom = new EmptySpace();

  	if(tracker.getExactRow() == (tracker.getMaxRows() - 1))//initiate if statment
  		return false;//return a value of false

    //initiate if statement
    if(tracker.getSpace((tracker.getExactRow() + 1), tracker.getExactColumn() == notRoom)
  		return false;//return a value of false

  	return true;//return a value of true
  }//end checkSouth


  //method to check if moving east in the map is a valid move
  public boolean checkEast(PositionTracker tracker){

    //instantiate and initialize objects
    EmptySpace notRoom = new EmptySpace();

  	if(tracker.getExactColumn() == (tracker.getMaxColumns() - 1))//initiate if statement
      return false;//return a value of false

    //initiate if statement
    if(tracker.getSpace(tracker.getExactRow(), (tracker.getExactColumn() + 1) == notRoom){
  		return false;//return a value of false

  	return true;//return a value of true
  }//end checkEast


  //method to check if moving west is the map is a valid move
  public boolean checkWest(PositionTracker tracker){

    //instantiate and initialize objects
    EmptySpace notRoom = new EmptySpace();

  	if(tracker.getExactColumn() == 0)//initiate if statement
  		return false;//return a value of false

    //initiate if statement
    if(tracker.getSpace(tracker.getExactRow(), (tracker.getExactColumn() - 1) == notRoom)
  		return false;//return a value of false

  	return true;//return a value of true
  }//end checkWest


  //method to check if a door is unlocked
  public boolean checkDoor(PositionTracker tracker, int direction)

    //declare and initialize variables
    double fromConnection = 0.0;
    double toConnection = 0.0;
    boolean connectionExistsAndOpen = false;

    fromConnection = this.getFromConnection(tracker, direction);

    toConnection = this.getToConnection(tracker, direction);

    if(fromConnection == toConnection)
      connectionExistsAndOpen = true;

    return connectionExistsAndOpen;
  }//end checkDoor


  //method to validate that there is a door to move to the desired room
  public double getFromConnection(PositionTracker tracker, int direction){

    //instantiate and initialize objects
    Room tempRoom = new Room();
    Door tempDoor = new Door();

    //invoke the getSpace method and assign its return value to tempRoom
    tempRoom = tracker.getSpace(tracker.getExactRow(), tracker.getExactColumn());

    //invoke the getDoor method and assign its return value to tempDoor
    tempDoor = tempRoom.getDoor(direction - 1);

    //invoke the getConnectionId method and return its value
    return tempDoor.getConnectionId();

  }//end getFromConnection


  //method to move a player from one room to another adjacent room
  public PositionTracker makeMove(PositionTracker tracker, int direction){

    //instantiate and initialize objects
    PositionTracker tempTracker = new PositionTracker();

    tempTracker = tracker;

  	switch(direction){//initiate switch statment checking the value of direction

      //enter case 1 and invoke the setExactRow method,
      //wraped around the moveNorth method
      case 1:	tempTracker.setExactRow(this.moveNorth(tracker));
  						return tempTracker;//return the value(s) of tempTracker

      //enter case 2 and invoke the setExactRow method
      //wraped around the moveSout method
      case 2:	tempTracker.setExactRow(this.moveSouth(tracker));
  						return tempTracker;//return the value(s) of tempTracker

      //enter case 3 and invoke the setExactRow method
      //wraped around the moveEast method
      case 3:	tempTracker.setExactColumn(this.moveEast(tracker));
  						return tempTracker;//return the value(s) of tempTracker

      //enter case 4 and invoke the setExactRow method
      //wraped around the moveWest method
      case 4:	tempTracker.setExactColumn(this.moveWest(tracker));
  						return tempTracker;//return the value(s) of tempTracker
  	}//end switch
  }//end makeMove


  //method to move the player north 1 space
  public int moveNorth(PositionTracker tracker){

    //invokes the getExactRow method and returns the value of the calculation
    return tracker.getExactRow() - 1;
  }//end moveNorth


  //method to move the player north 1 space
  public int moveSouth(PositionTracker tracker){

    //invokes the getExactRow method and returns the value of the calculation
    return tracker.getExactRow() + 1;
  }//end moveSouth


  //method to move the player north 1 space
  public int moveEast(PositionTracker tracker){

    //invokes the getExactColumn method and returns the value of the calculation
    return tracker.getExactColumn() + 1;
  }//end moveEast


  //method to move the player north 1 space
  public int moveNorth(PositionTracker tracker){

    //invokes the getExactColumn method and returns the value of the calculation
    return tracker.getExactColumn() - 1;
  }//end moveNorth

}//end class
