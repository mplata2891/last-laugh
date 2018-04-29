/*
  Mike Plata
  CoSci 290

  The Item class is an abstract class to be inherited by other concrete
	subclasses. The Item class is the super-class for the Key, Puzzle,
	PuzzlePiece, and Clue subclasses.

  The Item class is a sublass of the GamePiece class.
*/

//begining of new class
public class Item extends GamePiece{

	//the Item class has 4 class members/properties
	private String name;
	private String type;
	public String description;
	private String location;
	private boolean combines;


	//defualt constructor
	public Item(){

		//assigns the indicated String to the name property
		this.name = "None";

		//assigns the value of zero (0) to the strMod property
		this.type = "None";

		//assigns the indicated string to the type property
    this.description = "None";

    //assigns the indicated string to the location property
    this.location = "Unknown";

		//assigns the value of zero (0) to the tufMod property
		this.combines = false;
	}	//end constructor

	//method to set the name property
	public void setName(String name){

		//assigns the indicated String to the name property
		this.name = name;
	}

	//method to return the value of the name property
	public String getName(){

		//returns the value of the name property
		return this.name;
	}

	//method to set the type property
	public void setType(String newType){

		//assigns the value of newType to the type property
		this.type = newType;
	}

	//method to return the value of the type property
	public int getType(){

		//returns the value of the type property
		return this.type;
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

	//method to set the location property
	public void setLocation(String newLocation){

		//assigns the value of newLocation to the location property
		this.location = newLocation;
	}

	//method to return the value of the location property
	public String getLocation(){

		//returns the value of the location property
		return this.location;
	}

	//method to set the combines property
	public void setCombines(boolean newBool){

		//assigns the value of newBool to the combines property
		this.combines = newBool;
	}

	//method to return the value of the combines property
	public int getCombines(){

		//returns the value of the combines property
		return this.combines;
	}

	//method to return class members that are not hidden
	//from the player, as a string with appropriate labels
	//for each class member
	public String knownInfo(){

		//returns class members as a string
		return "ITEM - \n"
						+ "    Name: " + this.name "\n"
						+ "    Type: " + this.type + "\n\n";
	}//end knownInfo method

	//method to return class members as a string with
	//appropriate labels for each class member
	public String toString() {

		//returns class members as a string
		return "ITEM - \n"
						+ "       Name: " + this.name "\n"
						+ "       Type: " + this.type + "\n"
						+ "Description: " + this.description + "\n"
						+ "   Location: " + this.location + "\n"
						+ "   Combines: " + this.combines + "\n\n";
	}//end of toString
}//end of class
