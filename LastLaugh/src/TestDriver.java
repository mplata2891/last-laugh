//import java.util.*;

public class TestDriverMike{

  public static void main(String[] args){

      //instantiate and initialize objects
	  LoadGame gameTool = new LoadGame();
	  CoreObjects gameStructure = new CoreObjects();
	  
	  
	  //invoke loadObjects method to instantiate all needed objects
	  gameTool.createAndPopulateAllObjects(gameStructure);
	  
	  						/*Navigator and Menus*/
	  /*
	  System.out.println("# of Menus: " + gameStructure.getNavigator().getNumberOfMenus() + "\n");
	  
	  for(int i = 0; i < gameStructure.getNavigator().getNumberOfMenus(); i++)
		  gameStructure.getNavigator().getMenu(i).displayMenu();
	  */
	  
	  
	  						/*Position Tracker*/
	  
	  //System.out.println(gameStructure.getPositionTracker().toString());
	  
	  
	  
	  for(int i = 0; i < gameStructure.getPositionTracker().getMaxRows(); i++) {
		  for(int j = 0; j < gameStructure.getPositionTracker().getMaxColumns(); j++) {
			  
			  								/*Rooms*/
			  /*
			  System.out.println(gameStructure.getPositionTracker().getRoom(i, j).toString());
			  
			  System.out.println("Description: " + gameStructure.getPositionTracker().getRoom(i, j).getDescription() + "\n");
			  */
			  
			  
			  								/*Doors*/
			  /*
			  System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getDoor().toString());
			   
			  System.out.println("Key Name: " + gameStructure.getPositionTracker().getRoom(i, j).getDoor().getKeyName() + "\n");
			 */
			  
			  
			  								/*Caretaker*/
			  /*
			  System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().toString());
			  
			  System.out.println("Layers: " + gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getLayers());
			  
			  System.out.println("Greeting: " + gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getGreeting());
			  
			  System.out.println("Felicitation: " + gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getFelicitation());
			  
			  System.out.println("Admonishment: " + gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getAdmonishment());
			  
			  for(int k = 0; k < gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getLayers(); k++) {
			  
				System.out.println("Puzzles:");
			  
				System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getPuzzle(k));
			  }
			  
			  for(int k = 0; k < gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getLayers(); k++) {
			  
				System.out.println("Answers:");

				System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getAnswer(k));
			  }
			  */
			  
			  
			  						/*Puzzle Pieces*/
			 /*
			   for(int k = 0; k < gameStructure.getPositionTracker().getRoom(i, j).getNumberOfPuzzlePieces(); k++) {
				  System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).toString() + "\n"
						  			+ "Layers: " + gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).getLayers() + "\n"
						  			+ "Clues: " + gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).getClue() + "\n");
				
				  for(int l = 0; l < gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).getLayers(); l++)
						System.out.println("Manipulation: " + gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).getManipulation(l));
			   }
			  */
			  
			  
			//System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getDoor().getNote().toString());
			  
			//System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getKey().toString());
			  
			  
		  }
	  }

  }//end main

}//end class
