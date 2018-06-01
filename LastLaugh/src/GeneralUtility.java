import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GeneralUtility{

	public void saveGame(Player player, PositionTracker tracker){
    
		FileUtility fileTool = new FileUtility();
		
		String contents = "";
		
		contents = tracker.getExactRow() + "\n" + tracker.getExactColumn();
		
		fileTool.writeFile("src/TextFiles/SavedGame/PositionTracker/Position.txt", contents);
		
		contents = player.getName();
		
		fileTool.writeFile("src/TextFiles/SavedGame/Player/Name.txt", contents);
		
		System.out.println("\nYour game has been Saved.\n");
		
	}
	
	
	
	//method to update game objects
	public void runUpdateGameObjects(CoreObjects gameStructure) {
		
		//invoke updatePositionTracker method
		this.updatePosition(gameStructure.getPositionTracker());
		
		this.updateRooms(gameStructure.getPositionTracker());
		
		this.updatePlayerName(gameStructure.getPlayer());
		
		this.updatePlayer(gameStructure.getPositionTracker(), gameStructure.getPlayer());
	}//end updateGameObjects
	
	
	
	//method to read exactRow and exactColumn from a file
		private void updatePosition(PositionTracker tracker) {
			
			//declare and initialize variables
			int dimension = 0;
		    String currentLine = "";

		    //trying to open a file to read from
		    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/SavedGame/PositionTracker/Position.txt"))){

		      //read each line in the file until EOF
		      while((currentLine = br.readLine()) != null){

			      //increment dimension
		    	  dimension++;
		    	  
		    	  //initiate switch statement
		    	  switch(dimension) {
		    	  
			    	  //enter case 1
			    	  case 1:	tracker.setExactRow(Integer.parseInt(currentLine));
			    	  			break;//breaks out of switch
			    	  			
			    	  //enter case 2
			    	  case 2:	tracker.setExactColumn(Integer.parseInt(currentLine));
			  					break;//breaks out of switch
		    	  }//end switch
		        
		      }//end while

		    //if there is no file to open, the exception will be caught
		    }catch(IOException e){
		      e.printStackTrace();
		    }//end catch
		}//end updatePosition
		
		
		
	//method to update status of Items and Doors
	private void updateRooms(PositionTracker tracker) {
		
		for(int i = 0; i < tracker.getExactRow(); i++) {
			for(int j = 0; j < tracker.getExactColumn(); j++) {
				tracker.getRoom(i, j).getDoor().setStatus("Unlocked");
				tracker.getRoom(i, j).getCaretaker().setStatus("Inactive");
				for(int k = 0; k < tracker.getRoom(i, j).getNumberOfPuzzlePieces(); k++)
					tracker.getRoom(i, j).getPuzzlePiece(k).setStatus("Inactive");
			}//end for
		}//end for	
	}//end updateRooms
	
	
	
	//method to update player's name from a file
	private void updatePlayerName(Player player) {
			
		//declare and initialize variables
	    String currentLine = "";
	
	    //trying to open a file to read from
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/SavedGame/Player/Name.txt"))){
	
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
	
		      //prints the value of currentLine to the screen
		      player.setName(currentLine);
		        
	      }//end while
	
	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch	
	}//end updatePlayerName
	
	
	
	//method to update player's inventory and notebook
	private void updatePlayer(PositionTracker tracker, Player player) {
		
		for(int i = 0; i < tracker.getExactRow(); i++) {
			for(int j = 0; j < tracker.getExactColumn(); j++) {
				player.addKey(tracker.getRoom(i, j).getCaretaker().getKey());
				player.addNote(tracker.getRoom(i, j).getDoor().getNote());
			}
		}
	}//end updatePlayer
	
	

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
  
  
  
  public void beatGame() {
    
    //instantiate and initialize objects
	  FileUtility fileTool = new FileUtility();
    
    fileTool.splashPage("beatGame");
       
    //terminates program
	  System.exit(0);
    
  }//end of beatGame
  
}//end class
