/*
  Mike Plata
  CoSci 290
*/

public class Player extends Person{

	//the Player class has 2 class members/properties
	private ArrayList<Item> inventory;
	private ArrayList<Note> notebook;

	//default constructor
	public Player(){

		//creates a new ArrayList and assigns it to the inventory field
		this.inventory = new ArrayList<>[];

		//creates a new ArrayList and assigns it to the notebook field
		this.notebook = new ArrayList<>[];
	}//end constructor

	public getInventoryItem(){

		return
	}



	//method to return object fields as a string
	public String toString() {

		//returns object fields as a string
		return "First Name: " + super.getFirstName() + "\n"
						+ "Last Name: " + super.getLastName() + "\n"
						+ "Inventory: "
	}//end toString
}//end of class
