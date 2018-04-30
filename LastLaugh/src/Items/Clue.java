/*
  Mike Plata
  CoSci 290

  The Clue class represents in-game items that help the user piece
  together the game's mystery, but don't necissarily help solve puzzles.
  The Clue class may be many different 'types' of in-game objects, except
  for 'Notes'.

  The Clue class is a sublass of the Item class.
*/

//begining of a new class
public class Clue extends Item{

  //default constructor
  public Clue(){

    //assigns the indicated string to the name property
    super.name = "None";

    //assigns the indicated string to the type property
    super.type = "None";

    //assigns the indicated string to the type property
    super.description = "None";

    //assigns the indicated string to the location property
    super.location = "Unknown";

    //assigns the indicated boolean value to the combines property
    super.combines = false;
  }//end of constructor

  //implicit constructor
  public Clue(String name, String type, String description, String location){

    //assigns the indicated string to the name property
    super.name = name;

    //assigns the indicated string to the type property
    super.type = type;

    //assigns the indicated string to the type property
    super.description = description;

    //assigns the indicated string to the location property
    super.location = location;

    //assigns the indicated boolean value to the combines property
    super.combines = false;
  }//end of constructor

  //method to return class members as a string with
	//appropriate labels for each class member
  public String toString(){

    //returns class members as a string
		return "CLUE - \n"
						+ "       Name: " + super.name "\n"
						+ "       Type: " + super.type + "\n"
            + "Description: " + super.description + "\n"
						+ "   Location: " + super.location + "\n"
						+ "   Combines: " + super.combines + "\n\n";
  }//end toString method
}//end of class
