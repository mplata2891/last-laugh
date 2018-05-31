/*CHECKED*/

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

	//default constructor
	public Key(){
	
		//invokes the parent class default constructor
		super();
		
		//invokes the parent class setType method
		super.setType("Key");
	}//end of constructor
	
	
	
	//method to return the Class represented as a string
	public String toString(){
	
	    //returns the value returned by the parent class toString method
		return super.toString();
	}//end toString method
	
}//end of class
