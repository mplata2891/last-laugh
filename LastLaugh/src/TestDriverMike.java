//import java.util.*;

public class TestDriverMike{

  public static void main(String[] args){

      //instantiate and initialize objects
	  //GeneralUtility generalTool = new GeneralUtility();
	  FileUtility fileTool = new FileUtility();
	  InputUtility ioTool = new InputUtility();
	  LoadGame gameTool = new LoadGame();
	  CoreObjects gameStructure = new CoreObjects();
	  GameDriver gameDriver = new GameDriver();
	  
	  
	  //invoke loadObjects method to instantiate all needed objects
	  gameTool.createAndPopulateAllObjects(gameStructure);
	  
	  
	  for(int i = 0; i < gameStructure.getNavigator().getNumberOfMenus(); i++)
		  gameStructure.getNavigator().getMenu(i).toString();

  }//end main

}//end class
