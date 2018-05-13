/*
  Mike Plata
  CoSci 290

	The Player class is the in-game representation of the real life
	player. In other words, it acts as the user's avatar, in the game.

	The Player class inherits the firstName member field from the Person
	class, but also adds two member fields of its own. The member fields
	provide the real player, ways for it to collect in-game items that
	will aid in completing the game.

	The Player class is a sub-class of the Person class.
*/
//package LastLaugh.src;

import java.util.*;
//import src.Items.*;

public class Player extends Person implements Sense, Inspect{

	//the Player class has 2 class members/properties
	private ArrayList<Item> inventory;
	private ArrayList<Note> notebook;

	//default constructor
	public Player(){

		//invoke the Person class constructor
		super();

		//creates a new ArrayList and assigns it to the inventory field
		this.inventory = new ArrayList<>();

		//creates a new ArrayList and assigns it to the notebook field
		this.notebook = new ArrayList<>();
	}//end constructor


	public void addItem(Item newItem){

		//adds newItem as an element in the ArrayList
		inventory.add(newItem);
	}

	//method to return an inventory item as a String
  public String getItem(int index){

		//returns the known information of the item as a String
		return inventory.get(index).knownInfo();
  }

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

			//removes the final inde of the inventory ArrayList
			inventory.remove(inventory.size() - 1);
		}//end of else
	}//end of method

	//method to convert the inventory ArrayList to a string
  public String getFullInventory(){

    //declare and initialize variables
    String inventoryList = "Inventory:\n";

    //initiate for loop to iterate through the ArrayList
    for(int i = 0; i < inventory.size(); i++){

      //concatonates indicated String to inventoryList
      inventoryList = "   " + i + ". " + inventory.get(i).toString() + "\n";
    }

    //returns the value of inventoryList
    return inventoryList;
  }

	//method to return object fields as a string
	public String toString() {

		//returns object fields as a string
		return "First Name: " + super.getFirstName() + "\n"
		+ this.getFullInventory();
					//	+ "Last Name: " + super.getLastName() + "\n"

	}//end toString
}//end of class
