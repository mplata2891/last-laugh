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

		//instantiate and initialize objects
		Utility tool = new Utility();
		
		//declare and initialize variables
		String manipulation = "";
		boolean manipulationIsCorrect = false;
		boolean thereAreMoreManipulations = false;
		

		//invoke interpretSelection method
		manipulation = this.interpretSelection(selection);
		
		//initiate if-else statement (1)
		if(manipulationIsCorrect(piece, manipulation) == true){
			
			if(this.thereAreMoreManipulations(piece) == true)
				//invoke informOfMoreManipulations method
				this.informOfMoreManipulations(player, piece);
			else
				//invoke revealClue method
				this.unlockClue(piece);
				
		} else {
			
			//update attempts by invoking incrementAttempts method
			player.incrementAttempts();
			
			//initiate if-else statement
			if(tool.playerIsDead(player.getAttempts()) == true)
				//invokes gameOver method
				tool.gameOver();	
			else
				//invokes method
				this.caretakerAdmonishes(player, caretaker);
			
		}//end if-else (1)
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
	private boolean manipulationIsCorrect(PuzzlePiece piece, String manip) {
		
		//initiate if-else statement
		if(manip == piece.getManipulation(piece.getCurrentLayer()))
			return true;//returns boolean value true
		else
			return false;//returns boolean value false
	}//end manipulationIsCorrect
	
	
	
	//method to check if their are more manipulations needed before clue is given
	private boolean thereAreMoreManipulations(PuzzlePiece piece) {
		
		//initiate if-else statement
		if((piece.getCurrentLayer() + 1) == piece.getLayers())
			return false;//return boolean value false
		else
			return true;//returns boolean value true
	}//end thereAreMoreManipulations
	
	
	
	//method to inform the player that there are more manipulations needed
	private void informOfMoreManipulations(Player player, PuzzlePiece piece) {
		
		//invokes setCurrentLayer method
		piece.incrementCurrentLayer();
		
		//prints message to the user
		System.out.println("The Architect informs you -\n"
				+ "	" + player.getName() + ", good job, but not so fast.\n"
				+ "Keep manipulating this Puzzle Piece to get the Clue.\n");
	}//end infromOfMoreManipulations
	
	
	
	//method to reveal the hidden clue
	private void revealClue() {
		
		//prints clue to 
	}
	
}//end class
