/*
  Mike Plata
  CoSci 290
*/

public class Player extends Person{

	//the Player class has 2 class members/properties
	private ArrayList<Item> inventory;
	private ArrayList<String> notebook;

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
						+ "  Age: " + super.getAge() + "\n"
						+ "Class: " + this.playerType + "\n"
						+ "Level: " + this.level + "\n"
						+ "  Exp: " + this.experiencePoints + "\n"
						+ "   SP: " + this.skillPoints + "\n"
						+ "   HP: " + this.hitPoints + "\n"
						+ "  Str: " + this.strength + "\n"
						+ "  Tuf: " + this.toughness + "\n"
						+ "  Int: " + this.intelligence + "\n\n";
	}//end toString

}//end of class
