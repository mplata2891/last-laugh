/*
  Mike Plata
  CoSci 290

  The PuzzlePiece Class is used to instantiate in-game items
  that will be used to solve the in-game puzzles the user
  must solve throughout the game.

  These puzzle pieces will be found throughout the game by
  having the user explore and search for them, or be
  discovered by completing other puzzles.

  The PuzzlePiece class is a sub-class of the Item class
  */

  //beginning of new Class
  public class PuzzlePiece extends Item{

    //default constructor
    public PuzzlePiece(){

      //assigns the indicated string to the name property
      super.name = "None";

      //assigns the indicated string to the type property
      super.type = "Puzzle Piece";

      //assigns the indicated string to the type property
      super.description = "None";

      //assigns the indicated string to the location property
      super.location = "Unknown";

      //assigns the indicated boolean value to the combines property
      super.combines = false;
    }//end of constructor

    //implicit constructor
    public PuzzlePiece(String name, String description, String location, boolean bool){

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
    }//end of constructor

    //method to return class members as a string with
  	//appropriate labels for each class member
    public String toString(){

      //returns class members as a string
  		return "Puzzle Piece - \n"
  						+ "       Name: " + super.name "\n"
  						+ "       Type: " + super.type + "\n"
              + "Description: " + super.description + "\n"
  						+ "   Location: " + super.location + "\n"
  						+ "   Combines: " + super.combines + "\n\n";
    }//end toString method
  }//end of Class
