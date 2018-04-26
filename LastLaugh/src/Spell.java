/*
	Mike Plata
	CoSci 290

	Spell class
*/

public class Spell{

	//the Spell class has 3 class members/properties
	private String name;
	private String type;
	private String description;

	//the Spell class has one default constructor
	public Spell() {

		//assigns a value to the name property
		this.name = "None";

		//assigns a value to the type property
		this.type = "N/A";

		//assigns a value to the effect property
		this.description = "N/A"
	}

	//method to assign a value to the name property
	public void setName(String newName) {

		//assigns the value of newName to the name property
		this.name = newName;
	}

	//method to return the value ot the name property
	public String getName() {

		//returns the value of the name property
		return this.name;
	}

	//method to assign a value to the type property
	public void setType(String newType) {

		//assigns the value of newType to the type property
		this.type = newType;
	}

	//method to return the value of the type property
	public String getType() {

		//returns the value of the type property
		return this.type;
	}

	//method to assign a value to the description property
	public void setDescription(String newDescription) {

		//assigns the value of newDescription to the description property
		this.description = newDescription;
	}

	//method to return the value of the description property
	public String getDescription() {

		//returns the value of the description property
		return this.description
	}

	//method to print (to screen) each class member with appropriate labels
	public void toString() {

		//prints the name property
		return "SPELL - \n"
						+ "Name: " + this.name + "\n"
						+ "Type: " + this.type + "\n"
						+ "Description: " + this.description + "\n\n";
	}
}
