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
  	boolean roomExists = false;
    boolean doorExistsAndUnlocked = false;

    //invoke the checkDirection method
    roomExists = this.checkDirection(tracker, direction);

    if(roomExists == true)//initiate if statement
      doorExistsAndUnlocked = this.checkDoor();//invoke the checkDoor method

    if(doorExistsAndUnlocked == true)//initiate if statement
      return true;//returns the value true

  	return false;//returns the value false
  }//end checkMove


  //method to check if a particular direction is a valid move
  public boolean checkDirection(PositionTracker tracker, int direction){

    switch(direction){//initiate switch statement, checking the value of direction

      //enter case 1 and invoke the checkMoveNorth method
      case 1:	return this.checkMoveNorth(tracker);

      //enter case 2 and invoke the checkMoveSouth method
      case 2:	return this.checkMoveSouth(tracker)

      //enter case 3 and invoke the checkMoveEast method
      case 3:	return this.checkMoveEast(tracker);

      //enter case 4 and invoke the checkMoveWest method
      case 4:	return this.checkMoveWest(tracker);
  	}//end switch
  }//end checkDirection


  //method to check if moving north in the map is a valid move
  public boolean checkMoveNorth(PositionTracker tracker){

    //instantiate and initialize objects
    Room tempRoom = new Room();

    //invoke getSpace method and assigns return value to tempRoom
    tempRoom = tracker.getSpace((tracker.getExactRow() - 1),
                                  tracker.getExactColumn());

  	if(tracker.getExactRow() == 0)//initiate if statement
      return false;//return a value of false

    if(tempRoom.getRoomId() == 0)//initiate if-else statement
      return false;//return a value of false
    else
      return true;//return a value of true
  }//end checkNorth


  //method to check if moving south in the map is a valid move
  public boolean checkMoveSouth(PositionTracker tracker){

    //instantiate and initialize objects
    Room tempRoom = new Room();

    //invoke getSpace method and assigns return value to tempRoom
    tempRoom = tracker.getSpace((tracker.getExactRow() + 1),
                                  tracker.getExactColumn());

  	if(tracker.getExactRow() == (tracker.getMaxRows() - 1))//initiate if statment
  		return false;//return a value of false

    if(tempRoom.getRoomId() == 0)//initiate if-else statement
      return false;//return a value of false
    else
      return true;//return a value of true
  }//end checkSouth


  //method to check if moving east in the map is a valid move
  public boolean checkMoveEast(PositionTracker tracker){

    //instantiate and initialize objects
    Room tempRoom = new Room();

    //invoke getSpace method and assigns return value to tempRoom
    tempRoom = tracker.getSpace(tracker.getExactRow(), (tracker.getExactColumn() + 1));

  	if(tracker.getExactColumn() == (tracker.getMaxColumns() - 1))//initiate if statement
      return false;//return a value of false

    if(tempRoom.getRoomId() == 0)//initiate if-else statement
      return false;//return a value of false
    else
      return true;//return a value of true
  }//end checkEast


  //method to check if moving west is the map is a valid move
  public boolean checkMoveWest(PositionTracker tracker){

    //instantiate and initialize objects
    Room tempRoom = new Room();

    //invoke getSpace method and assigns return value to tempRoom
    tempRoom = tracker.getSpace(tracker.getExactRow(), (tracker.getExactColumn() - 1));

  	if(tracker.getExactColumn() == 0)//initiate if statement
  		return false;//return a value of false

    if(tempRoom.getRoomId() == 0)//initiate if-else statement
      return false;//return a value of false
    else
      return true;//return a value of true
  }//end checkWest


  //method that checks whether a door exists and is unlocked
  public boolean checkDoor(PositionTracker tracker, int direction){

    //instantiate and initialize objects
    Room tempRoom = new Room();
  	Door tempDoor = new Door();

    //declare and initialize variables
    boolean doorExists = false;
  	boolean doorIsUnlocked = false;

    //invoke getSpace method and assign its return value in tempRoom
    tempRoom = tracker.getSpace(tracker.getExactRow(), tracker.getExactColumn());

    //invoke getDoor method and assign its return value in tempDoor
    tempDoor = tempRoom.getDoor(direction - 1);

    //invoke checkForPath method and assign its return value in doorExists
    doorExists = this.checkForPath(tempDoor);

    if(doorExists == true)//initiate if statement
  		doorIsUnlocked = this.isPathClear(tempDoor);//invoke isPathClear method

  	if(doorExists == true && doorIsUnlocked == true);//initiate if-else statement
  		return true;//returns the value true
    else
  	 return false;//returns the value false
  }//end checkDoor


  //method to check if a door (in a certain direction) exists in a room
  public boolean checkForPath(Door door){

  	if(door.getConnectionId() != 0.0)//initiate if-else statement
  		return true;//returns the value true
  	else
  		return false;//returns the value false
  }//end checkForPath


  //method to check if a door is unlocked
  public boolean isPathClear(Door door){

  	if(tempDoor.getLockStatus == false)//initiate if-else statement
  		return true;//returns the value true
  	else
  		return false;//returns the value false
  }//end isPathClear


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
  public int moveWest(PositionTracker tracker){

    //invokes the getExactColumn method and returns the value of the calculation
    return tracker.getExactColumn() - 1;
  }//end moveNorth


  public void senseSurroundings(Room currentRoom){

  	identifyDoors(currentRoom.getContents());

  	identifyContents(currentRoom);
  }

  public void identifyDoors(ArrayList<Item> list){


  }

}//end class
