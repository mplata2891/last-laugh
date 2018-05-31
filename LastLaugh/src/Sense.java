/*
  Mike Plata
  CoSci 290

*/

//begin new class
public class Sense{

  //method that prints the name of the door, and names of the Items
  //located in the room that the player is currently in
  public void senseSurroundings(Room currentRoom){

	//prints information about the current room
	System.out.println("\n" + currentRoom.toString());
	  
	//prints message to the user
    System.out.println("In the room you're in, you notice. . .\n");
    
    //prints a description of the current room
    System.out.println(currentRoom.getDescription());

    //invokes the identifyDoor method
    this.identifyDoor(currentRoom.getDoor());
    
    //invokes the identifyCaretaker method
    this.identifyCaretaker(currentRoom.getCaretaker());

    //invokes the identifyContents method
    this.identifyPuzzlePieces(currentRoom);
    
    //go to next line
    System.out.println();
    
  }//end SenseSurroundings

  

  //method to print the name of the Door in the current Room
  private void identifyDoor(Door door){

    //prints the name of the Door with label
    System.out.println("Door: " + door.getName() + "\n");
    
  }//end identifyDoor
  
  
  
  //method to print the name of the Caretaker in the current Room
  private void identifyCaretaker(Caretaker caretaker) {
	  
	  //prints the name of the Caretaker with label
	  System.out.println("Caretaker: " + caretaker.getName() + "\n");
	  
  }//end identifyCaretaker
  


  //method to print the name of every PuzzlePiece in the current Room
  private void identifyPuzzlePieces(Room currentRoom){

    //prints Item label
    System.out.print("Puzzle Pieces: ");

    //initiate for loop to iterate through ArrayList
    for(int i = 0; i < currentRoom.getNumberOfPuzzlePieces(); i++) {
      
    	if(i == 0)
    		System.out.println(currentRoom.getPuzzlePiece(i).getName());
    	else
    		System.out.println("				 " + currentRoom.getPuzzlePiece(i).getName());
    }//end for
    
  }//end identifyPuzzlePieces

}//end class
