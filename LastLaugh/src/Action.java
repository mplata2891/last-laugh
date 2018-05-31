/*
  Mike Plata
  CoSci 290

*/

//begin new class
public class Action{

	//method to print out all puzzle pieces in the current room
	public void displayPuzzlePieces(Room room){

		//initiate for loop to iterate through list
		for(int i = 0; i < room.getNumberOfPuzzlePieces(); i++){

			//print out list of puzzle pieces
			System.out.println("Puzzle Piece " + (i + 1) + ": "
						+ room.getPuzzlePiece(i).getName());
		}//end for
		
		System.out.println();
	}//end diaplayPuzzlePieces



	//method to select a puzzle piece
	public void selectPuzzlePiece(Room room){

		//instantiate and initialize objects
		InputUtility ioTool = new InputUtility();
		
		//declare and initialize variables
		int selection = 0;

		//prompt user for selection
		ioTool.menuPrompt();

		//take user's selection
		selection = ioTool.takeSelection(room.getNumberOfPuzzlePieces());

		//invoke setSelectedPuzzlePiece method
		room.setSelectedPuzzlePiece(room.getPuzzlePiece(selection - 1));
		
		//invoke confirmSelectedPuzzlePiece
		this.confirmSelectedPuzzlePiece(room.getSelectedPuzzlePiece());
	}//end selectPuzzlePiece
	
	
	
	//method to confirm user's selction
	private void confirmSelectedPuzzlePiece(PuzzlePiece piece) {
		
		System.out.println("You selected " + piece.getName() + "\n");
	}//end confirmSelectedPuzzlePiece



	//method to either manipulate a puzzle piece or see its clue
	public void performAction(Player player, PuzzlePiece piece, int selection){
		
		//initiate if-else statement (1)
		if(selection != 6) {
			
			if(piece.getStatus().equalsIgnoreCase("Active"))
				//invoke interpretSelection method
				this.manipulatePuzzlePiece(player, piece, selection);			
			else
				//invoke puzzlePieceInactiveMsg
				this.puzzlePieceInactiveMsg(player);				
			
		} else {
			
				if(piece.getClueStatus().equalsIgnoreCase("Unlocked"))
					//invokes revealClue method
					this.revealClue(piece);
				else
					//invoke clueLockedMsg
					this.clueLockedMsg(player);
				
		}//end if-else (1)
	}//end performAction
	
	
	
	//method to manipulate a PuzzlePiece
	private void manipulatePuzzlePiece(Player player, PuzzlePiece piece, int selection) {
		
		//instantiate and initialize objects
		GeneralUtility tool = new GeneralUtility();
				
		//declare and initialize variables
		String manipulation = "";
		
		//invoke interpretSelection method
		manipulation = this.interpretSelection(selection);
		
		//initiate if-else statement (1)
		if(manipulationIsCorrect(piece, manipulation) == true){
			
			if(this.thereAreMoreManipulations(piece) == true)
				//invoke informOfMoreManipulations method
				this.informOfMoreManipulations(player, piece);
			else
				//invoke unlockClue method
				this.informClueHasBeenUnlocked(player, piece);
				
		} else {
			
			//update attempts by invoking incrementAttempts method
			player.incrementAttempts();
			
			//initiate if-else statement
			if(tool.playerIsDead(player.getAttempts()) == true)
				//invokes gameOver method
				tool.gameOver();	
			else
				//invokes method
				this.theArchitectWarns(player);
			
		}//end if-else (1)
	}//end manipulatePuzzlePiece
	
	
	
	//method to alert the user that the puzzle piece is inactive
	private void puzzlePieceInactiveMsg(Player player) {
		
		//print message to the user
		System.out.println("The Architect informs you -\n"
				+ "	" + player.getName() + ", this Puzzle Piece is no longer active.\n"
				+ "Please, stop wasting your time, and my time.\n");
	}//end puzzlePieceInactiveMsg
	
	
	
	//method to reveal the puzzle piece's clue to the user
	private void revealClue(PuzzlePiece piece) {
		
		//prints out clue to the user
		System.out.println("Clue: " + piece.getClue() + "\n");
	}//end revealClue
	
	
	
	//method to alert the user that the clue is locked
	private void clueLockedMsg(Player player) {
		
		//prints message to the user
		System.out.println("The Architect informs you -\n"
				+ "	" + player.getName() + ", this Clue is still locked.\n"
				+ "Manipulate the Puzzle in the correct order to unlock its clue.\n");
	}//end clueLockedMsg



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
		if(piece.getManipulation(piece.getCurrentLayer()).equalsIgnoreCase(manip))
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
	private void informClueHasBeenUnlocked(Player player, PuzzlePiece piece) {
		
		//invokes unlockClue method
		piece.setClueStatus("Unlocked");
		
		//invokes setStatua method
		piece.setStatus("Inactive");
		
		//prints message to the user
		System.out.println("The Architect informs you -\n"
				+ "	" + player.getName() + ", you've unlocked the Clue.\n"
				+ "It's about time, I was starting to get worried.\n"); 
	}//end informClueHasBeenUnlocked
	
	
	
	//method to print out a message to the user when they fail a task
	private void theArchitectWarns(Player player) {
		
		//prints message to the user
		System.out.println("The Architect informs you -\n"
				+ "	" + player.getName() + ", you've unlocked the Clue.\n"
				+ "It's about time, I was starting to get worried.\n"); 
	}//end theArchitectWarns
	
}//end class
