/*
  Mike Plata
  CoSci 290

  Key Class, represents physical in-game keys used to
  unlock doors inside the text adventure

  Keys are earned by the player, by completing the 
  in-game puzzles

  The Key Class is a sub-class of the Item class.
*/


//begin new class
public class Key extends Item{

	//the Key class has 2 class members/fields/properties
	private String combines;
	private String combinesWith;
	
	
	
	//default constructor
	public Key(){
	
		//invokes the parent class default constructor
		super();
		
		//invokes the parent class setType method
		super.setType("Key");
		
		//assigns the indicated String to the combines field
		this.combines = "";
		
		//assigns the indicated String to the combinesWith field
		this.combinesWith = "";
	}//end of constructor
	
	
	
	//method to get the value of the combines field
	public String getCombines() {
		
		//returns the value of the combines field
		return this.combines;
	}//end getCombines
	
	
	
	//method to set the value of the combines field
	public void setCombines(String newString) {
		
		//assigns the value of newString to the combines field
		this.combines = newString;
	}//end setCombines
	
	
	
	//method to get the value of the combinesWith field
	public String getCombinesWith() {
		
		//returns the value of the combinesWith field
		return this.combinesWith;
	}//end getCombinesWith
	
	
	
	//method to set the value of the combinesWith field
	public void setCombinesWith(String newName) {
		
		//assigns the value of newName to the combinesWith field
		this.combinesWith = newName;
	}//end setCombinesWith field
	
	
	
	//method to return the Class represented as a string
	public String toString(){
	
	    //returns the value returned by the parent class toString method
		return super.toString();
	}//end toString method
	
}//end of class
