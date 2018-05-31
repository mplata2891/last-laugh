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

	//method to move a player from their current room in the map to a new room
	  public void movePlayer(PositionTracker tracker, int direction){

	    //declare and initialize variables
		boolean moveIsValid = false;
	    boolean doorIsUnlocked = false;
	    
	    switch(direction){//initiate switch statement, checking the value of direction

	      //enter case 1
	      case 1:	//invoke the checkDoor method
			    	doorIsUnlocked = this.checkDoor(tracker.getCurrentRoom().getDoor());
			    	
			    	//initiate if-else statement
			    	if(doorIsUnlocked == true) {
			    		
			    		//initiate if-else statement
			    		if(moveIsValid == true) {
			    			
				    		this.makeMove(tracker, direction);//invoke the makeMove method
				    		
				    		tracker.updateCurrentRoom();
			    		}
				    	else
				    		this.displayNoRoomMsg();
			    		
			    	}else
			    		this.displayLockedDoorMsg();
			    	
	      			break;//break from switch

	      //enter case 2
	      case 2:	//invoke the checkMove method
			    	moveIsValid = this.checkMove(tracker, direction);
			    	
			    	if(moveIsValid == true) {//initiate if-else statement
			    		
			    		this.makeMove(tracker, direction);//invoke the makeMove method
			    		
			    		tracker.updateCurrentRoom();
			    		
			    	}
			    	else
			    		this.displayNoRoomMsg();
			    	
	      			break;//break from switch

	  	}//end switch    
	  }//end movePlayer
	  
	  
	  
	//method to check if the desired player move is a valid one
	  private boolean checkMove(PositionTracker tracker, int direction){

	    //declare and initialize variables
	  	boolean roomExists = false;

	    //invoke the checkDirection method
	    roomExists = this.checkDirection(tracker, direction);

	    //initiate if-else statement
	    if(roomExists == true)
	    	return true;//returns the boolean value true
	    else
	    	return false;//returns the boolean value false
	  }//end checkMove
	  
	  
	  
	//method to check if a particular direction is a valid move
	  private boolean checkDirection(PositionTracker tracker, int direction){

	    boolean validFlag = false;

	    switch(direction){//initiate switch statement, checking the value of direction

	      //enter case 1 and invoke the checkMoveNext method
	      case 1:	validFlag =  this.checkMoveNext(tracker);
	      			break;

	      //enter case 2 and invoke the checkMovePrevious method
	      case 2:	validFlag = this.checkMovePrevious(tracker);
	      			break;

	  	}//end switch

	    return validFlag;
	  }//end checkDirection
	  
	  
	  
	  //method to check if moving to the next room is a valid move
	  private boolean checkMoveNext(PositionTracker tracker) {
		  
		  if((tracker.getExactRow() + 1) == tracker.getMaxRows()) { //initiate if statement
			  if((tracker.getExactColumn() + 1) == tracker.getMaxColumns()) //initiate if statement
				  return false; //returns the boolean value false
		  }
		 
		  return true; //returns the value true	
	  }//end checkMoveNext
	  
	  
	  
	//method to check if moving to the previous room is a valid move
	  private boolean checkMovePrevious(PositionTracker tracker) {
		  
		  if(tracker.getExactRow() == 0) { //initiate if statement
			  if(tracker.getExactColumn() == 0) //initiate if statement
				  return false; //returns the value false
		  }
		 
		  return true; //returns the boolean value true
	  }//end checkMoveNext
	  
	  
	  
	//method that checks whether a door exists and is unlocked
	  private boolean checkDoor(Door door){

	  	if(door.getStatus().equalsIgnoreCase("Unlocked"))//initiate if-else statement
	  		return true;//returns the value true
	    else
	  	 return false;//returns the value false
	  }//end checkDoor
	   
	  
	  
	//method to move a player from one room to another adjacent room
	  private void makeMove(PositionTracker tracker, int direction){

	  	switch(direction){//initiate switch statement checking the value of direction

	      //enter case 1 and invoke the moveNext method
	      case 1:	this.moveNext(tracker);
	      			break;

	      //enter case 2 and invoke the movePrevious method
	      case 2:	this.movePrevious(tracker);
	      			break;

	  	}//end switch
	  }//end makeMove
	  
	  
	  
	  //method to move a player to the next room
	  private void moveNext(PositionTracker tracker) {
		  
		  //initiate if-else statement
		  if(tracker.getExactColumn() == (tracker.getMaxColumns() - 1)) {
			  
			  //invoke the setExactRow method
			  tracker.setExactRow(tracker.getExactRow() + 1);
			  
			  //invoke the setExactColumn method
			  tracker.setExactColumn(0);
			  
		  }else {
			  
			  //invoke the setExactColumn method
			  tracker.setExactColumn(tracker.getExactColumn() + 1);
		  }//end if-else
	  }//end moveNext
	  
	  
	  
	  //method to move a player to the previous room
	  private void movePrevious(PositionTracker tracker) {
		  
		  //initiate if-else statement
		  if(tracker.getExactColumn() == 0) {
			  
			  //invoke the setExactRow method
			  tracker.setExactRow(tracker.getExactRow() - 1);
			  
			  //invoke the setExactColumn method
			  tracker.setExactColumn(tracker.getMaxColumns() - 1);
			  
		  }else {
			  
			  //invoke the setExactColumn method
			  tracker.setExactColumn(tracker.getExactColumn() - 1);
		  }//end if-else
	  }//end moveNext
	  
	  
	  
	  //method to alert user that there is no room to move to
	  private void displayNoRoomMsg() {
		  
		  //displays error message to user
		  System.out.println("Unable to move in that direction.\n"
				  				+ "There is no Room in that direction.\n");
	  }
	  
	  
	  
	//method to alert user that a door is locked
	  private void displayLockedDoorMsg() {
		  
		  //displays error message to user
		  System.out.println("Unable to move in that direction.\n"
				  				+ "There Door is Locked.\n");
	  }

}//end class
