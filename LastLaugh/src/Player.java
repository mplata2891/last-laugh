/*
  Mike Plata
  CoSci 290

	The Player class is the in-game representation of the real life
	player. In other words, it acts as the user's avatar, in the game.

	The Player class inherits the firstName member field from the Person
	class, but also adds two member fields of its own. The member fields
	provide the real player, ways for it to collect in-game Keys that
	will aid in completing the game.

	The Player class is a sub-class of the Person class.
*/

//declare imports
import java.util.ArrayList;

//begin new class
public class Player extends Person{
	
	//the Player class has 3 class members/fields/properties
	private ArrayList<Key> inventory;
	private ArrayList<Note> notebook;
	private int currentPage;
	private ArrayList<Command> command;
	private int attempts;
	
	
	//default constructor
	public Player(){
		
		//invokes the Person parent class constructor
		super();
		
		//instantiates a new ArrayList and stores it in the inventory field
		this.inventory = new ArrayList<>();
		
		//instantiates a new ArrayList and stores it in the notebook field
		this.notebook = new ArrayList<>();
		
		//assigns given value to the currentPage field
		this.currentPage = 0;
		
		//instantiates a newArrayList and stores it in the command field
		this.command = new ArrayList<>();
		
		//invokes the fillCommandList method
		
		//assigns the given value to the attempts field
		this.attempts = 0;
	}//end constructor
	
	
	
	//method to get an Key object stored in the inventory field
	public Key getKey(int index){
		
		//returns the Key object in the indicated index of the inventory field
		return this.inventory.get(index);
	}//end getKey
	
	
	
	//method to add a Key object into the inventory field
	public  void addKey(Key  newKey){
		
		//stores newKey in the inventory field
		this.inventory.add(newKey);
	}//end addKey
	
	
	
	//method to get the number of Key objects stored in the inventory field
	public int getNumberOfKeys(){
		
		//returns the number of Keys stored in the inventory field
		return this.inventory.size();
	}//end getNumberOfKeys



	//method to get a Note object stored in the notebook field
	public Note getNote(int index){

		//returns the Note object in the indicated index of the notebook field
		return this.notebook.get(index);
	}//end getNote



	//method to add a Note object into the notebook field
	public void addNote(Note newNote){

		//stores newNote in the notebook field
		this.notebook.add(newNote);
	}//end addNote
	
	
	
	//method to get the number of Note objects stored in the notebook field
	public int getNumberOfNotes(){
		
		//returns the number of Notes stored in the notebook field
		return this.notebook.size();
	}//end getNumberOfNotes
	
	
	
	//method to get the value of the currentPage field
	public int getCurrentPage() {
		
		//returns the value of the currentPage field
		return this.currentPage;
	}//end gerCurrentPage
	
	
	
	//method to set a note in the currentPage field
	public void setCurrentPage(int newPage) {
		
		//assigns the value of newPage to the currentPage field
		this.currentPage = newPage;
	}//end setCurrentPage



	//method  to get a Command object stored in the command field
	public Command getCommand(int index){
		
		//returns the Command object in the indicated index of the command field
		return this.command.get(index);
	}//end getCommand
	
	
	
	//method to get the value of the attempts field
	public int getAttempts() {
		
		//returns the value of the attempts field
		return this.attempts;
	}//end getAttempts
	
	
	
	//method to reset the value of the attempts field
	public void resetAttempts() {
		
		//assigns a value of 0 to the attempts field
		this.attempts = 0;
	}//end resetAttmepts
	
	
	
	//method to increase the value of the attempts field by 1
	public void incrementAttempts() {
		
		//increments the value of the attempts field by 1
		this.attempts++;
	}//end incrementAttempts
	
	
	
	//method to return Player object represented as a String
	public String toString(){
		
		//returns the following String
		return "Player -\n"
					+ "Name: " + super.getName() + "\n"
					+ "Number of Keys : " + this.getNumberOfKeys() + "\n"
					+ "Number of Notes: " + this.getNumberOfNotes() + "\n"
					+ "Number of Attempts: " + this.attempts + "\n\n";
	}//end toString
	
}//end class