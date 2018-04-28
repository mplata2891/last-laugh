/*
  Mike Plata
  CoSci 290

  Key Class, represents physical in-game keys used to
  unlock doors inside the text adventure

  Some keys are found through out the game by searching,
  solving in-game puzzles, or by combining other items.

  The Key Class is a sub-class of Item.
*/

//begining of new Class
public class Key extends Item{

  //the Key class has 1 member field/property
  public String description;

  //default constructor
  public Key(){

    //assigns the indicated string to the name property
    super.name = "None";

    //assigns the indicated string to the type property
    super.type = "Key";

    //assigns the indicated string to the type property
    this.description = "None";

    //assigns the indicated string to the location property
    super.location = "Unknown";

    //assigns the indicated boolean value to the combines property
    super.combines = false;
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

  //method to return class members that are not hidden
	//from the player, as a string with appropriate labels
	//for each class member
	public String knownInfo(){

		//returns class members as a string
		return "KEY - \n"
						+ "       Name: " + super.name "\n"
						+ "       Type: " + super.type + "\n"
            + "Description: " + this.description + "\n\n";
	}//end knownInfo method

	//method to return class members as a string with
	//appropriate labels for each class member
  public String toString(){

    //returns class members as a string
		return "KEY - \n"
						+ "       Name: " + super.name "\n"
						+ "       Type: " + super.type + "\n"
            + "Description: " + this.description + "\n"
						+ "   Location: " + super.location + "\n"
						+ "   Combines: " + super.combines + "\n\n";
  }//end toString method
}//end of class
