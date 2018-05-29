/*CHECKED*/

/*
	Mike Plata
	CoSci 290

	The Person class is a representation of the person playing the game.

	The Person class is a sub-class of the GamePiece class.
*/

//begin new class
public abstract class Person extends GamePiece{

	//the Person class has 1 class member/field/property
	private String name;

	
	//default constructor
	public Person(){

		//assigns the indicated string to the name field
		this.name = "Default Name";
	}//end constructor
	
	
	
	//method to return the value of the name property
	public String getName(){

		//returns the value of the name property
		return this.name;
	}//end getName
	


	//method to assign a value to the name property
	public void setName(String newName){

		//assigns the value of newName to name
		this.name = newName;
	}//end setName
	


	//method to return object represented as a string
	//with appropriate labels for member fields
	public String toString() {

		//returns object properties as string
		return "PERSON - \n"
						+ "Name: " + this.name + "\n\n";
	}//end toString

}//end Person
