/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class Interact{
	
	//method to interact with the caretaker of the current room
	public void interactWithCaretaker(Player player, Caretaker caretaker, int selection) {
		
		if(caretaker.getStatus().equalsIgnoreCase("Active")) {
			
			//initiate switch statement
			switch(selection) {
			
			//enters case 1
			case 1:	this.hearGreeting(caretaker);//invoke hearGreeting method
					break;//breaks out of switch
			
			//enters case 2
			case 2:	this.hearRiddle(player, caretaker);//invoke hearRiddle method
					break;//breaks out of switch
					
			//enters case 3
			case 3: this.solveRiddle(player, caretaker);//invoke solveRiddle method
					break;//breaks out of switch
					
			}//end switch
			
		}else
			this.caretakerInactiveMsg(player, caretaker);//invokes method
		
	}//end interactWithCaretaker
	
	
	
	//method to print the caretaker's greeting to the player
	private void hearGreeting(Caretaker caretaker) {
		
		//prints out caretaker's greeting
		System.out.println(caretaker.getName() + " speaks to you:\n"
							+ caretaker.getGreeting());		
	}//end hearGreeting
	
	
	
	//method to print out the caretaker's riddle
	private void hearRiddle(Player player, Caretaker caretaker) {
		
		//prints out caretaker's current riddle
		System.out.println("\nListen carefully " + player.getName() + ", here is my riddle:\n"
							+ caretaker.getPuzzle(caretaker.getCurrentLayer()) + "\n");
	}//end hearRiddle
	
	
	
	//method that allows the player to attempt solving the caretaker's riddle
	private void solveRiddle(Player player, Caretaker caretaker) {
		
		//instantiate and initialize objects
		GeneralUtility generalTool = new GeneralUtility();
		InputUtility ioTool = new InputUtility();
		
		//declare and initialize variables
		String solution = "";
		
		//prompt user to enter a their solution
		ioTool.promptForSolution();
		
		//take String from user
		solution = ioTool.getString();
		
		//initiate if-else statement (1)
		if(this.solutionIsCorrect(caretaker, solution) == true) {
			
			if(this.thereAreMoreRiddles(caretaker) == true)				
				//invoke caretakerInformsOfMoreRiddles method
				this.caretakerInformsOfMoreRiddles(player, caretaker);
			
			else {				
				//invokes caretakerCongratulates method
				this.caretakerCongratulates(player, caretaker);
			
				//invokes playerReceivesKey method
				this.playerReceivesKey(player, caretaker);
				
				//invokes playerInfomedOfNewKey
				this.playerInformedOfNewKey();
			}
		}else {
			
			//update attempts by invoking incrementAttempts method
			player.incrementAttempts();
			
			//initiate if-else statement
			if(generalTool.playerIsDead(player.getAttempts()) == true)
				//invokes gameOver method	
				generalTool.gameOver();
			else
				//invokes caretakerAdmonishes method	
				this.caretakerAdmonishes(player, caretaker);
			
		}//end if-else (1)
	}//end solveRiddle
	
	
	
	//method to check if player's solution is correct
	private boolean solutionIsCorrect(Caretaker caretaker, String solution) {
		
		//initiate if-else statement
		return(caretaker.getAnswer(caretaker.getCurrentLayer()).equalsIgnoreCase(solution));
			//return true;//returns boolean value of true
		//else
			//return false;//returns boolean value of false
	}//end solutionIsCorrect
	
	
	
	//method to check if the caretaker has more riddles
	private boolean thereAreMoreRiddles(Caretaker caretaker) {
		
		//initiate if-else statement
		if((caretaker.getCurrentLayer() + 1) == caretaker.getLayers())
			return false;//return boolean value false
		else
			return true;//return boolean value true
	}//end thereAreMoreRiddles
	
	
	
	//method to inform the player that there are more riddles to solve
		private void caretakerInformsOfMoreRiddles(Player player, Caretaker caretaker) {
			
			//invokes setCurrentLayer method
			caretaker.incrementCurrentLayer();
			
			//prints message to the user
			System.out.println(caretaker.getName() + " informs you -\n"
					+ "	" + player.getName() + ", good job, but not so fast.\n"
					+ "There is still another riddle to answer.\n");
		}//end caretakerInformsOfMoreRiddles
	
	
	
	//method to print a congratulation from the caretaker
	private void caretakerCongratulates(Player player, Caretaker caretaker) {
		
		//invokes the setStatus method
		caretaker.setStatus("Inactive");
		
		//prints congratulations from caretaker
		System.out.println("\n" + caretaker.getName() + " congratulates you -\n"
				+ "	" + player.getName() + caretaker.getFelicitation());
	}//end caretakerCongratulates
	
	
	
	//method to give player a key
	private void playerReceivesKey(Player player, Caretaker caretaker) {
		
		//invokes addKey method
		player.addKey(caretaker.getKey());
	}//end playerReceivesKey
	
	
	
	//method to alert the user that they have received a new key
	private void playerInformedOfNewKey() {
		
		//prints message to the user
		System.out.println("A new Key has been added to your Inventory\n");
	}//end playerInformedOfNewKey
	
	
	
	//method to print an admonishment from the caretaker
	private void caretakerAdmonishes(Player player, Caretaker caretaker) {
		
		//prints an admonishment to the player
		System.out.println("\n" + caretaker.getName() + " admonsihes you -\n"
				+ "	" + player.getName() + caretaker.getAdmonishment() + "\n");
	}//end caretakerAdmonishes
	
	
	
	//method to display a message that the caretaker is no longer active
	private void caretakerInactiveMsg(Player player, Caretaker caretaker) {
		
		//prints message to the user
		System.out.println("\nI'm sorry " + player.getName() + ", but. . .\n"
				+ caretaker.getName() + " is no longer active.\n");
	}//end caretakerInactiveMsg
	
}//end class