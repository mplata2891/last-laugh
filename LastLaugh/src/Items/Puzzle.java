/*
  Mike Plata
  CoSci 290

  The Puzzle Class represents in-game puzzles that The
  player must solve in order to proceed in the game.

  Puzzles may be manipulated in a various amount of ways
  such as pressing, pulling, turning, sliding, or pushing
  various aspects of the puzzle. The user may even need to
  type in text into the puzzle in order for them to solve
  it.

  The Puzzle class is a sub-class of the Item class.
*/

//beginning of a new Class
public class Puzzle extends Item{

  private ArrayList<String> manipulatedBy;

  //defualt constructor
	public Puzzle(){

    //assigns the indicated string to the name property
    super.name = "None";

    //assigns the indicated string to the type property
    super.type = "Puzzle";

    //assigns the indicated string to the type property
    super.description = "None";

    //assigns the indicated string to the location property
    super.location = "Unknown";

    //assigns the indicated boolean value to the combines property
    super.combines = false;

    //instantiates a new ArrayList and assigns it to the manipulatedBy field
    this.manipulatedBy = new ArrayList<>[];
	}	//end constructor

  //implicit constructor
  public Puzzle(String name, String description, String location, boolean bool){

    //assigns the indicated string to the name property
    super.name = name;

    //assigns the indicated string to the type property
    super.type = "Puzzle";

    //assigns the indicated string to the type property
    super.description = description;

    //assigns the indicated string to the location property
    super.location = location;

    //assigns the indicated boolean value to the combines property
    super.combines = bool;

    //instantiates a new ArrayList and assigns it to the manipulatedBy field
    this.manipulatedBy = new ArrayList<>[];
  }//end of constructor

  //method to add a new mainpulation to the manipulatedBy poperty
  public void addManipulation(String newManip){

    //adds the value of newManip to the manipulatedBy property
    manipulatedBy.add(newManip);
  }

  //method to convert the manipulatedBy ArrayList to a string
  public String getManipulations(){

    //declare and initialize variables
    String manipulations = "Manipulated By:\n";

    //initiate for loop to iterate through the ArrayList
    for(int i = 0; i < manipulatedBy.size(); i++){

      //concatonates indicated String to manipulations
      manipulations = "   " + i + ". " + manipulatedBy.get(i) + "\n";
    }

    //returns the value of manipulations
    return manipulations;
  }

  //method to return class members as a string with
	//appropriate labels for each class member
  public String toString(){

    //returns class members as a string
		return "Puzzle - \n"
						+ "       Name: " + super.name "\n"
						+ "       Type: " + super.type + "\n"
            + "Description: " + super.description + "\n"
            + this.getManipulations();
						+ "   Location: " + super.location + "\n"
						+ "   Combines: " + super.combines + "\n\n";
  }//end toString method
}//end of class
