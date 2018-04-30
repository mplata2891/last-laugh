/*
  Mike Plata
  CoSci 290

  Key Class, represents physical in-game keys used to
  unlock doors inside the text adventure

  Some keys are found through out the game by searching,
  solving in-game puzzles, or by combining other items.

  The Key Class is a sub-class of the Item class.
*/

//begining of new Class
public class Key extends Item{

  //default constructor
  public Key(){

    //assigns the indicated string to the name property
    super.name = "None";

    //assigns the indicated string to the type property
    super.type = "Key";

    //assigns the indicated string to the type property
    super.description = "None";

    //assigns the indicated string to the location property
    super.location = "Unknown";

    //assigns the indicated boolean value to the combines property
    super.combines = false;
  }//end of constructor

  //implicit constructor
  public Key(String name, String description, String location, boolean bool){

    //assigns the indicated string to the name property
    super.name = name;

    //assigns the indicated string to the type property
    super.type = "Key";

    //assigns the indicated string to the type property
    super.description = description;

    //assigns the indicated string to the location property
    super.location = location;

    //assigns the indicated boolean value to the combines property
    super.combines = bool;
  }//end of constructor

	//method to return class members as a string with
	//appropriate labels for each class member
  public String toString(){

    //returns class members as a string
		return "KEY - \n"
						+ "       Name: " + super.name "\n"
						+ "       Type: " + super.type + "\n"
            + "Description: " + super.description + "\n"
						+ "   Location: " + super.location + "\n"
						+ "   Combines: " + super.combines + "\n\n";
  }//end toString method
}//end of class
