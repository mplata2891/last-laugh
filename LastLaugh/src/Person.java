/*
	Mike Plata
	CoSci 290

	The Person class is a representation of the person playing the game.

	The Person class is a sub-class of the GamePiece class.
*/

//package LastLaugh.src;

public abstract class Person extends GamePiece{

	//the Person class has 1 class member/field
	private String firstName;


	//default constructor
	public Person(){

		//assigns the value of the firstName field to the indicated string
		this.firstName = "";

	}//end constructor


	//method to assign a value to the firstName property
	public void setFirstName(String newFirstName){

		//assigns the value of newFirstName to firstName
		this.firstName = newFirstName;

	}//end setFirstName


	//method to return the value of the firstName property
	public String getFirstName(){

		//retrurns the value of the firstName property
		return this.firstName;

	}//end getFirstName


	//method to return object represented as a string
	//with appropriate labels for member fields
	public String toString() {

		//returns object properties as string
		return "PERSON - \n"
						+ "First Name: " + this.firstName + "\n\n";

	}//end toString

}//end Person
