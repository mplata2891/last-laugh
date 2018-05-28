/*
  Mike Plata
  CoSci 290

  The Examine class represents an action that the player can take druing
  gameplay. If the Player chooses to take this action, the Player examines
  a specific Item in the current room they are in. Examining an Item will tell
  the player the name of the item, the type of item it is, and a description
  of the Item.
*/

//begin new class
public class Examine{

  //method to print the details of a specific Item in a Room
  public void examineItem(Room currentRoom, int selection){

    switch(selection) {
    
    	//enter case 1
	    case 1: this.examineDoor(currentRoom.getDoor());//invoke inspectDoor method
	    		break;//break out of switch
	    
	    //enter case 2
	    case 2:	this.examineCaretaker(currentRoom.getCaretaker());//invoke inspectCaretaker method
	    		break;//break out of switch
	    
	    //enter case 3
	    case 3:	this.examinePuzzlePiece(currentRoom);//invoke inspectPuzzlePiece method
	    		break;//break out of switch
    		
    }//end switch 
  }//end examineItem
  
  
  
  //method to print out the description of the door in the current room
  private void examineDoor(Door door) {
	  
	  //prints out description of door
	  System.out.println(door.toString());
  }//end inspectDoor
  
  
  
  //method to print out the description of the caretaker in the current room
  private void examineCaretaker(Caretaker caretaker) {
	  
	  //prints out description of caretaker
	  System.out.println(caretaker.toString());
  }//end inspectCaretaker
  
  
  
  //method to print out the description of a puzzlepiece in the current room
  private void examinePuzzlePiece(Room currentRoom) {
	  
	  //instantiate and initialize objects
	  InputUtility ioTool = new InputUtility();
	  
	  //declare and initialize variables
	  String choice = "";
	  boolean choiceExists = false;
	  
	  //prompt user for input
	  ioTool.itemPrompt();
	  
	  //take user input
	  choice = ioTool.takeName();
	  
	  choiceExists = this.checkChoice(currentRoom, choice);
	  
	  if(choiceExists == true)
		  this.printChoiceDescription(currentRoom, choice);
	  else
		  this.displayNoItemMsg();
			  
  }//end inspectPuzzlePiece
	  

  
  //method to check if the user's choice exists in the current room
  private boolean checkChoice(Room currentRoom, String choice) {

	//declare and initialize variables
	boolean validFlag = false;
	  
	//initiate for loop to iterate through list
    for(int i = 0; i < currentRoom.getNumberOfPuzzlePieces(); i++){

      //initiate if-else statement
      if(currentRoom.getPuzzlePiece(i).getName().equalsIgnoreCase(choice) == true)
        validFlag = true;//assigns a boolean value of true to validFlag
      else
    	  validFlag = false;//assigns a boolean value of false to validFlag
    }//end for
    
    return validFlag;//returns the value of validFlag
  }//end checkChoice
  
  
  
  //method to print out the description of the user's choice
  private void printChoiceDescription(Room currentRoom, String choice) {
	  
	//initiate for loop to iterate through list
	for(int i = 0; i < currentRoom.getNumberOfPuzzlePieces(); i++){

	  //initiate if-else statement
	  if(currentRoom.getPuzzlePiece(i).getName().equalsIgnoreCase(choice) == true)
	    System.out.println("Description: " + currentRoom.getPuzzlePiece(i).toString());
	}//end for
  }//end printChoiceDescription
  
  
  
  //method to alert user that the item they entered doesn't exist
  private void displayNoItemMsg() {
	  
	  //print error message to user
	  System.out.println("The Item you entered does not exist in this Room.\n");
  }//end displayNotItemMsg

}//end class

