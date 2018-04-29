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

		//assigns the value of the firstName field to the indicated string
		super.firstName = "";

		//assigns the value of the lastNae field to the indicated string
		super.lastName = "";

		//creates a new ArrayList and assigns it to the inventory field
		this.inventory = new ArrayList<>[];

		//creates a new ArrayList and assigns it to the notebook field
		this.notebook = new ArrayList<>[];
	}//end constructor

	public void addInventory(Item newItem){

		//adds newItem as an element in the ArrayList
		inventory.add(newItem);
	}

	//method to convert the manipulatedBy ArrayList to a string
  public String getInventory(){

    //declare and initialize variables
    String inventoryList = "Inventory:\n";

    //initiate for loop to iterate through the ArrayList
    for(int i = 0; i < inventory.size(); i++){

      //concatonates indicated String to manipulations
      inventoryList = "   " + i + ". " + inventory.get(i) + "\n";
    }

    //returns the value of manipulations
    return inventoryList;
  }



	//method to return object fields as a string
	public String toString() {

		//returns object fields as a string
		return "First Name: " + super.getFirstName() + "\n"
						+ "Last Name: " + super.getLastName() + "\n"
						+ "Inventory: "
	}//end toString
}//end of class
