/*
  Mike Plata
  CoSci 290

  The PuzzlePiece Class is a representation of in-game items
  that will be used to solve the in-game puzzles the user
  must solve throughout the game.

  These puzzle pieces will be found throughout the game by
  having the user explore and search for them.

  The PuzzlePiece class is a sub-class of the Item class
  */

//declare imports
import java.util.ArrayList;

//beginning of new Class
public class PuzzlePiece extends Item{

	//the PuzzlePiece class has 2 class members/fields/properties
	private ArrayList<String> manipulatedBy;
	private ArrayList<String> clues;
	
		  
		  
	//default constructor
	public PuzzlePiece(){
	
		//invokes the parent class default constructor
		super();
		
		//instantiates an ArrayList of type String and stores in manipulatedBy
		this.manipulatedBy = new ArrayList<>();
		
		//instantiates an ArrayList of type String and stores in clues
		this.clues = new ArrayList<>();   	
	}//end of constructor
	
	
	
	//method to get a String stored in the manipulatedBy field
	public String getManipulation(int index) {
		
		//returns a String stored in the specified index
		return this.manipulatedBy.get(index);
	}//end getManipulation
	
	
	
	//method to add a String into the ArrayList stored in the manipulatedBy field
	public void addManipulation(String newManip) {
		
		//adds a new String into the manipulatedBy field
		this.manipulatedBy.add(newManip);
	}//end addManipulation
	
	
	
	//method to get a String store din the clues field
	public String getClue(int index) {
		
		//returns a String stored in the specified index
		return this.clues.get(index);
	}//end getClue
	
	
	
	//method to add a String into the ArraList stored in the clues field
	public void addClue(String newClue) {
		
		//adds a new String into the clue field
		this.clues.add(newClue);
	}
	
	
	
	//method to return the PuzzlePiece object represented as a String
	public String toString() {
		
		//returns the value returned by invoking the parent class toString method
		return super.toString();
	}//end toString
    
}//end of Class
