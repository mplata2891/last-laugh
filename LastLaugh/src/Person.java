/*
	Mike Plata
	CoSci 290

	Person class is an abstract class to be inherited by the concrete Player
	class.

	The Person class is a sub-class of the GamePiece class.
*/

public class Person extends GamePiece{

	//the Person class has 2 class members/fields
	private String firstName;
	private String lastName;


	//default constructor
	public Person(){

		//assigns the value of the firstName field to the indicated string
		this.firstName = "";

		//assigns the value of the lastNae field to the indicated string
		this.lastName = "";
	}

	//implicit constructor
	public Person(String first, String last) {

		//assigns the value of first to the firstName property
		this.firstName = first;

		//assigns the value of last to the lastName property
		this.lastName = last;
	}

	//method to return the full name of the Person object
	public String getFullName(){

		//returns a concatenated string consisting of the
		//first and last name properties
		return (this.firstName + " " + this.lastName);
	}

	//method to assign a value to the firstName property
	public void setFirstName(String newFirstName){

		//assigns the value of newFirstName to firstName
		this.firstName = newFirstName;
	}

	//method to return the value of the firstName property
	public String getFirstName(){

		//retrurns the value of the firstName property
		return this.firstName;
	}

	//method to assign a value to the lastName property
	public void setLastName(String newLastName){

		//assigns the value of newLastName to lastName
		this.lastName = newLastName;
	}

	//method to return the value of the lastName property
	public String getLastName(){

		//retrurns the value of the lastName property
		return this.lastName;
	}

	//method to return object properties as string
	public String toString() {

		//returns object properties as string
		return "PERSON - \n"
						+ "First Name: " + this.firstName + "\n"
						+ " Last Name: " + this.lastName + "\n\n";
	}
}
