/*
  Mike Plata
  CoSci 290

*/

//begin new class
public class Action extends Command{

	//method to print out all puzzle pieces in the current room
	public void displayPuzzlePieces(Room room){

		//initiate for loop to iterate through list
		for(int i = 0; i < room.getNumberOfPuzzlePieces(); i++){

			//print out list of puzzlepieces
			System.out.println("Puzzle Piece " + (i + 1) + ": "
						+ room.getPuzzlePiece(i).getName());
		}//end for
	}//end diaplayPuzzlePieces



	//method to select a puzzlepiece
	public void selectPuzzlePiece(Room room){

		//declare and initialize variables
		int selection = 0;

		//prompt user for selection

		//take user's selection

		room.setSelectedPuzzlePiece(room.getPuzzlePiece(selection));
	}//end selectPuzzlePiece



	//method to manipulate a puzzlepiece
	public void manipulatePuzzlePiece(Player player, PuzzlePiece piece, int selection){

		//declare and initialize variables
		String manipulation = "";
		boolean manipulationIsCorrect = false;
		boolean thereAreMoreManipulations = false;
		

		//invoke interpretSelection method
		manipulation = this.interpretSelection(selection);
		
		//invoke checkManipulation method
		manipulationIsCorrect = checkManipulation(piece, manipulation);
		
		//initiate if-else statement
		if(manipulationIsCorrect == true){
			
			thereAreMoreManipulations = this.checkForMoreManipulations(piece);
			
			if(thereAreMoreManipulations == false)
				this.revealClue(piece);
			else
				//informed to keep manipulating;
				
		} else {
			
			//update attempts
			
			//check for death
			
			//if not dead, try again message
			
			//if dead, game over
		}
	}//end manipulatePuzzlePiece



	//method interprets the integer selection into a string
	private String interpretSelection(int selection){

		//declare and initialize variables
		String interpretation = "";

		//initiate switch statement
		switch(selection){

			//enter case 1
			case 1:	interpretation = "Press";//assigns string to interpretation
							break;//breaks from switch

			//enter case 2
			case 2: interpretation = "Pull";//assigns string to interpretation
							break;//breaks from switch

			//enter case 3
			case 3: interpretation = "Turn";//assigns string to interpretation
							break;//breaks from switch
							
			//enter case 4
			case 4:	interpretation = "Slide";//assigns string to interpretation
							break;//breaks from switch
							
			//enter case 5
			case 5:	interpretation = "Push";//assigns string to interpretation
							break;//breaks from switch
		}//end switch
		
		return interpretation;//returns the value of interpretation
	}//end interpretSelection
	
	
	
	//method to check if the selected manipulation is correct
	private boolean checkManipulation(String manip) {
		
		//initiate if-else statement
		if(manip == )
	}
	
}//end class
