public class GeneralUtility{

  
	
	/*public String newGame{//will not compile
    FileUtility fileTool = new FileUtility();
    
    //access the splashPage member of the tool object to display the game's title
    fileTool.readFile("TextFiles/SplashScreens/Title.txt");
    
    //access the readFile member of the tool object to display the story's Prologue
    fileTool.readFile("TextFiles/Story/Intro1.txt");
    
    //ask for user input (name)
    

    //access the readFile member of the tool object to display the story's
    //first part of the intro
    fileTool.readFile("TextFiles/Story/Intro2.txt");
  }*/

  //gives random int in a given interval
  public int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
    }
  
  //method to check if a player died
  public boolean playerIsDead(int fromOneToTen) {
	  
	  //initiate if-else statement
	  if(fromOneToTen >= this.chance(1, 10))
		  return true;//return boolean value true
	  else
		  return false;//return boolean value false
  }//end checkIfPlayerIsDead
  
  //method to end the game
  public void gameOver() {
	  
	  //instantiate and initialize objects
	  FileUtility fileTool = new FileUtility();
	  
	  //invokes splashPage method
	  fileTool.splashPage("gameover");
	  
	  //terminates program
	  System.exit(0);
  }//end gameOver
  
}//end class
