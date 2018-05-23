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
	private ArrayList<Command> command;
	
	
	//default constructor
	public Player(){
		
		//invokes the Person parent class constructor
		super();
		
		//instantiates a new ArrayList and stores it in the inventory field
		this.inventory = new ArrayList<>();
		
		//instantiates a new ArrayList and stores it in the notebook field
		this.notebook = new ArrayList<>();
		
		//instantiates a newArrayList and stores it in the command field
		this.command = new ArrayList<>();
		
		//invokes the fillCommandList method
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



	//method  to get a Command object stored in the command field
	public Command getCommand(int index){
		
		//returns the Command object in the indicated index of the command field
		return this.command.get(index);
	}//end getCommand
	
	
	
	//method to return Player object represented as a String
	public String toString(){
		
		//returns the following String
		return "Player -\n"
					+ "Name: " + super.getName() + "\n"
					+ "Number of Keys : " + this.getNumberOfKeys() + "\n"
					+ "Number of Notes: " + this.getNumberOfKeys() + "\n\n";
	}//end toString
	
}//end class

/*
	//method to remove an item from the inventory ArrayList member field
	public void removeItem(Item item, int index){

		//initiate if-else statement
		if(index < (inventory.size() - 1)){

			//removes a specific object from the inventory ArrayList
			inventory.remove(item);

			//initiate for loop to iterate through ArrayList
			for(index = 0; index < inventory.size(); index++){

				//sets the current index of the inventory ArrayList equal to the index
				//that follows it.
				inventory.set(index, inventory.get(index + 1));
			}//end of for loop

			//removes the final index of the inventory ArrayList
			inventory.remove(inventory.size() - 1);
		}//end of if
		else{

			//removes a specific object from the inventory ArrayList
			inventory.remove(item);

			//removes the final index of the inventory ArrayList
			inventory.remove(inventory.size() - 1);
		}//end of else
	}//end of method
*/