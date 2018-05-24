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
	private int layers;
	private int currentLayer;
	private ArrayList<String> manipulatedBy;
	private String clue;
	 
		  
	//default constructor
	public PuzzlePiece(){
	
		//invokes the parent class default constructor
		super();
		
		//invokes the parent class setType method
		super.setType("Puzzle Piece");
		
		//assigns the indicated value to the layers field
		this.layers = 0;

		//assigns the indicated value to the currentLayer field
		this.currentLayer = 0;
		
		//instantiates an ArrayList of type String and stores in manipulatedBy
		this.manipulatedBy = new ArrayList<>();
		
		//assigns given string to the clue field
		this.clue = "";
	}//end of constructor
	
	
	
	//method to get the value of the layers field
	public int getLayers() {

	//returns the value of the layers field
	return this.layers;
	}//end getLayers



	//method to set the value of the layer field
	public void setLayers(int newValue) {

		//assigns the value of newValue to the layer field
		this.layers = newValue;
	}//end setLayers



	//method to get the value of the currentLayer field
	public int getCurrentLayer() {

		//returns the value of the currentLayer field
		return this.currentLayer;
	}//end getCurrentLayer



	//method to set the value of the currentLayer field
	public void setCurrentLayer(int newValue) {

		//assigns the value of newValue to the currentLayer field
		this.currentLayer = newValue;
	}//end setCurrentLayer
		
		
		
	//method to increment the value of currentLayer field by 1
	public void incrementCurrentLayer() {
			
		//increments the value of the currentLayer field by 1
		this.currentLayer++;
	}//end incrementCurrentLayer
	
	
	
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
	
	
	
	//method to get a String stored in the clues field
	public String getClue() {
		
		//returns a String stored in the specified index
		return this.clue;
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
