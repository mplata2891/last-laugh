/*
	Mike Plata
	CoSci 290

	Cloak class is an extension of the armor class
	Cloak is an armor used by the MagicUser class
	Cloak provides light protection against attacks
*/

public class Cloak extends Armor{

	//the Cloak class has one default constructor
	public Cloak() {

		//assigns the indicated string to the name property
		super.setName("Cloak");

		//assigns the indicated strong to the type property
		super.setType("Cloak");

		//assigns the indicated value to the defense property
		super.setDefense(4);
	}

	//method to return the object represented as a string
	//with appropriate labels for each class field
	public String toString() {

		//returns object members as a string
		return "ARMOR -\n"
						+ "Name: " + super.getName() + "\n"
						+ "Type: " + super.getType() + "\n"
						+ " Def: " + super.getDefnse() "\n\n";
	}
}
