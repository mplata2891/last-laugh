/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class Interact extends Command{
	
	//method to interact with the caretaker of the current room
	public void interactWithCaretaker(Player player, Caretaker caretaker, int selection) {
		
		if(caretaker.getStatus() == "Active") {
			
			//initiate switch statement
			switch(selection) {
			
			case 1:	this.hearGreeting(caretaker);
					break;
					
			case 2:	this.hearRiddle(player, caretaker);
					break;
					
			case 3: this.solveRiddle(player, caretaker);
					break;
					
			}//end switch
			
		}else
			/*display error message*/;
		
	}//end interactWithCaretaker
	
	
	
	//method to print the caretaker's greeting to the player
	private void hearGreeting(Caretaker caretaker) {
		
		//prints out caretaker's greeting
		System.out.println(caretaker.getName() + " speaks to you:\n"
							+ caretaker.getGreeting() + "\n");		
	}//end hearGreeting
	
	
	
	//method to print out the caretaker's riddle
	private void hearRiddle(Player player, Caretaker caretaker) {
		
		//prints out caretaker's current riddle
		System.out.println("Listen carefully " + player.getName() + ", here is my riddle:\n"
							+ caretaker.getPuzzle(caretaker.getCurrentLayer()));
	}//end hearRiddle
	
	
	
	//method that allows the player to atempt solving the caretaker's riddle
	private void solveRiddle(Player player, Caretaker caretaker) {
		
		//declare and initialize variables
		String solution;
		boolean solutionIsCorrect;
		boolean thereAreMoreRiddles;
		
		//prompt user to enter a their solution
		
		//take String from user
		
		solutionIsCorrect = checkSolution(solution);
		
		if(solutionIsCorrect == true) {
			thereAreMoreRiddles = checkForMoreRiddles(caretaker);
			
			if(thereAreMoreRiddles == false)
				caretakerCongratulates(caretaker);
			else
				caretakerInformsOfMoreRiddles(caretaker);
		}else {
			//update attempts
			
			//check for death
			
			//if not dead, caretaker admonishes
			
			//if dead, game over
		}
			
	}//end solveRiddle
	
}//end class