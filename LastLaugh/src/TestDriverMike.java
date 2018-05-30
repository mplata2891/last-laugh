//import java.util.*;

public class TestDriverMike{

  public static void main(String[] args){

      //instantiate and initialize objects
	  LoadGame gameTool = new LoadGame();
	  CoreObjects gameStructure = new CoreObjects();
	  
	  
	  //invoke loadObjects method to instantiate all needed objects
	  gameTool.createAndPopulateAllObjects(gameStructure);
	  
	  
	  //for(int i = 0; i < gameStructure.getNavigator().getNumberOfMenus(); i++)
		  //gameStructure.getNavigator().getMenu(i).displayMenu();
	  
	  //System.out.println(gameStructure.getPositionTracker().toString());
	  
	  for(int i = 0; i < gameStructure.getPositionTracker().getMaxRows(); i++) {
		  for(int j = 0; j < gameStructure.getPositionTracker().getMaxColumns(); j++) {
			  
			  //System.out.println(gameStructure.getPositionTracker().getRoom(i, j).toString());
			  
			  //System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getDoor().toString());
			  
			  //System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getDoor().getNote().toString());
			  
			  //System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().toString());
			  
			  //System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getCaretaker().getKey().toString());
			  
			  for(int k = 0; k < gameStructure.getPositionTracker().getRoom(i, j).getNumberOfPuzzlePieces(); k++)
				  System.out.println(gameStructure.getPositionTracker().getRoom(i, j).getPuzzlePiece(k).toString());
		  }
	  }

  }//end main

}//end class
