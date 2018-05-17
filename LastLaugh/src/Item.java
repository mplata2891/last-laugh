/*
  Mike Plata
  CoSci 290

  The Item class is an abstract class to be inherited by other concrete
	subclasses. The Item class is the super-class for the Key, Puzzle,
	PuzzlePiece, Clue, and Note subclasses.

  The Item class is a subclass of the GamePiece class.
*/

//begin new class
public class Item extends GamePiece{

	//the Item class has 4 class members/properties
	private String name;
	private String type;
	private String description;
	private boolean combinesWithOtherItem;


	//default constructor
	public Item(){

		//assigns the indicated String to the name property
		this.name = "None";

		//assigns the indicated string to the type property
		this.type = "None";

		//assigns the indicated string to the description property
		this.description = "None";

		//assigns the indicated value to the combinesWithOtherItem
		this.combinesWithOtherItem = false;
	}	//end constructor


	//method to return the value of the name property
	public String getName(){

		//returns the value of the name property
		return this.name;
	}


	//method to set the name property
	public void setName(String name){

		//assigns the indicated String to the name property
		this.name = name;
	}


	//method to return the value of the type property
	public String getType(){

		//returns the value of the type property
		return this.type;
	}


	//method to set the type property
	public void setType(String newType){

		//assigns the value of newType to the type property
		this.type = newType;
	}


	//method to return the value of the description property
  public String getDescription(){

    //returns the value of the description property
    return this.description;
  }


  //method to assigns a value to the description proptery
  public void setDescription(String newDescription){

    //assigns the value of newDescription to the description property
    this.description = newDescription;
  }


	//method to return the value of the combinesWithOtherItem property
	public boolean getCombinesWithOtherItem(){

		//returns the value of the combinesWithOtherItem property
		return this.combinesWithOtherItem;
	}


	//method to set the combinesWithOtherItem property
	public void setCombinesWithOtherItem(boolean newBool){

		//assigns the value of newBool to the combinesWithOtherItem property
		this.combinesWithOtherItem = newBool;
	}


	//method to return class members that are not hidden from the player
	//as a string with appropriate labels for each class member
	public String toString(){

		//returns class members as a string
		return this.type + " - \n"
						+ "Name: " + this.name + "\n"
						+ "Description: " + this.description + "\n\n";
	}//end toString

}//end of class
