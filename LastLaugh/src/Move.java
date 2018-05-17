/*
 * 	Mike Plata
 * 	CoSci 290
 * 
 * 	The Move class is an action that the player can take during game-play.
 * 	The player can Move to the next room or previous room if the door is
 *	unlocked.
 */

//begin new class
public class Move {

	//method to move a player object from their current location in the map
	//to a new location
	  public /*PositionTracker*/ void movePlayer(PositionTracker tracker, int direction){

	    //instantiate and initialize objects
	    //PositionTracker tempTracker = new PositionTracker();

	    //declare and initialize variables
	    boolean moveIsValid = false;

	    //tempTracker = tracker;//assign the value of tracker to tempTracker

	  	moveIsValid = checkMove(tracker, direction);//invoke the checkMove method

	  	if(moveIsValid == true)//initiate if statement
	  		tracker = makeMove(tracker, direction);//invoke the makeMove method

	  	//return tempTracker;//return the value(s) of tempTraccker
	  }//end movePlayer
	  
	  
	  
	//method to check if the desired player move is a valid one
	  public boolean checkMove(PositionTracker tracker, int direction){

	    //declare and initialize variables
	  	boolean roomExists = false;
	    boolean doorIsUnlocked = false;

	    //invoke the checkDirection method
	    roomExists = checkDirection(tracker, direction);

	    if(roomExists == true)//initiate if statement
	      doorIsUnlocked = checkDoor(tracker), direction);//invoke the checkDoor method

	    if(doorIsUnlocked == true)//initiate if statement
	      return true;//returns the value true

	  	return false;//returns the value false
	  }//end checkMove
	  
	  
	  
	//method to check if a particular direction is a valid move
	  public boolean checkDirection(PositionTracker tracker, int direction){

	    boolean validFlag = false;

	    switch(direction){//initiate switch statement, checking the value of direction

	      //enter case 1 and invoke the checkMoveNext method
	      case 1:	validFlag =  checkMoveNext(tracker);
	      			break;

	      //enter case 2 and invoke the checkMovePrevious method
	      case 2:	validFlag = checkMovePrevious(tracker);
	      			break;

	  	}//end switch

	    return validFlag;
	  }//end checkDirection
	  
	  
	  
	  //method to check if moving to the next room is a valid move
	  public boolean checkMoveNext(PositionTracker tracker) {
		  
		  if((tracker.getExactRow() + 1) == tracker.getMaxRows()) { //initiate if statement
			  if((tracker.getExactColumn() + 1) == tracker.getMaxColumns()) //initiate if statement
				  return false; //returns the value false
		  }
		 
		  return true; //returns the value true
		
	  }//end checkMoveNext
	  
	  
	  
	//method to check if moving to the previous room is a valid move
	  public boolean checkMovePrevious(PositionTracker tracker) {
		  
		  if(tracker.getExactRow() == 0) { //initiate if statement
			  if(tracker.getExactColumn() == 0) //initiate if statement
				  return false; //returns the value false
		  }
		 
		  return true; //returns the value true
		
	  }//end checkMoveNext
	  
	  
	  
	//method that checks whether a door exists and is unlocked
	  public boolean checkDoor(PositionTracker tracker, int direction){

	    //instantiate and initialize objects
	  	Door tempDoor = new Door();

	    //declare and initialize variables
	  	boolean doorIsUnlocked = false;

	    //invoke getSpace method and assign its return value in tempRoom
	    tempDoor = tracker.getRoom(tracker.getExactRow(), tracker.getExactColumn())
	    			.getDoor();

	    doorIsUnlocked = checkLock(tempDoor);//invoke checkDoor method

	  	if(doorIsUnlocked == true)//initiate if-else statement
	  		return true;//returns the value true
	    else
	  	 return false;//returns the value false
	  }//end checkDoor
	  
	  
	  
	//method to check if a door is unlocked
	  public boolean checkLock(Door door){

	  	if(door.getLockStatus() == "Unlocked")//initiate if-else statement
	  		return true;//returns the value true
	  	else
	  		return false;//returns the value false
	  }//end isPathClear
	  
	  
	  
	//method to move a player from one room to another adjacent room
	  public PositionTracker makeMove(PositionTracker tracker, int direction){

	    //instantiate and initialize objects
	    PositionTracker tempTracker = new PositionTracker();

	    tempTracker = tracker;

	  	switch(direction){//initiate switch statement checking the value of direction

	      //enter case 1 and invoke the setExactRow method,
	      //wraped around the moveNorth method
	      case 1:	tempTracker = moveNext();
	      			break;

	      //enter case 2 and invoke the setExactRow method
	      //wraped around the moveSout method
	      case 2:	tempTracker = movePrevious();
	      			break;

	  	}//end switch

	    return tempTracker;
	  }//end makeMove

}//end class
