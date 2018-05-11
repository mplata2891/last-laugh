/*
	Mike Plata
	CoSci 290

	Person class is an abstract class to be inherited by the concrete Player
	class.

	The Person class is a sub-class of the GamePiece class.
*/

//package LastLaugh.src;

public class Person extends GamePiece{

	//the Person class has 1 class member/field
	private String firstName;



	//default constructor
	public Person(){

		//assigns the value of the firstName field to the indicated string
		this.firstName = "";

	}//end constructor


	//implicit constructor
	public Person(String first, String last) {

		//assigns the value of first to the firstName property
		this.firstName = first;

		//assigns the value of last to the lastName property
	//	this.lastName = last;
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


	/*
	//method to return object properties as string
	public String toString() {

		//returns object properties as string
		return "PERSON - \n"
						+ "First Name: " + this.firstName + "\n"
						+ " Last Name: " + this.lastName + "\n\n";
	}
	*/
}
