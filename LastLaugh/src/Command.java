/*FINALIZED*/

/*
	Mike Plata
	CoSci 290
	
	The Command class is the parent class for all other 'commands'.
	'Commands' are the in-game options available to the user and 
	the Player class.
*/

//begin new class
public class Command extends GamePiece{
	
	//the Command class has 7 class member/field/property
	private Move move;
	private Sense sense;
	private Examine examine;
	private Interact interact;
	private Action action;
	private Inventory inventory;
	private Notebook notebook;
	
	
	//default constructor
	public Command(){
		
		//instantiates object of type Move and stores it in the move property
		this.move = new Move();
		
		//instantiate an object of type Sense and stores it in the sense property
		this.sense = new Sense();
		
		//instantiate an object of type Examine and stores it in the examine property
		this.interact = new Interact();
		
		//instantiate an object of type Action and stores it in the action property
		this.action = new Action();
		
		//instantiates an object of type Inventory and stores it in the inventory property
		this.inventory = new Inventory();
		
		//instantiates an object of type Notebook and stores it in the notebook property
		this.notebook = new Notebook();
	}//end constructor
	
	
	
	//method to get the object stored in the move property
	public Move getMove() {
		
		//returns the object stored in the move property
		return this.move;
	}//end getMove
	
	
	
	//method to get the object stored in the sense property
	public Sense getSense() {
			
		//returns the object stored in the sense property
		return this.sense;
	}//end getSense
		
		
		
	//method to get the object stored in the examine property
	public Examine getExamine() {
			
		//returns the object stored in the examine property
		return this.examine;
	}//end getExamine
		
		
		
	//method to get the object stored in the interact property
	public Interact getInteract() {
			
		//returns the object stored in the Interact property
		return this.interact;
	}//end getInteract
		
		
		
	//method to get the object stored in the action property
	public Action getAction() {
			
		//returns the object stored in the action property
		return this.action;
	}//end getAction
		
		
		
	//method to get the object stored in the inventory property
	public Inventory getInventory() {
			
		//returns the object stored in the inventory property
		return this.inventory;
	}//end getInventory
		
		
		
	//method to get the object stored in the notebook property
	public Notebook getNotebook() {
			
		//returns the object stored in the notebook property
		return this.notebook;
	}//end getNotebook
	
	
	
	//method to return the class represented as a string
	public String toString() {
		
		//returns the following string
		return "Command - \n"
				+ "List of Commands: Move\n"
				+ "					 Sense\n"
				+ "					 Examine\n"
				+ "					 Interact\n"
				+ "					 Action\n"
				+ "					 Inventory\n"
				+ "					 Notebook\n\n";
	}//end toString
	
}//end class