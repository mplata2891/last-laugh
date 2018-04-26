/*
	Mike Plata
	CoSci 290
	Light Armor

	LightArmor class is a concrete extension of the Armor class
	Light Armor is used by the Fighter class
	Light Armor has high defense
*/

public class LightArmor extends Armor{

	//the LightArmor class has one default constructor
	public LightArmor() {

		//assigns the indicated string to the name property
		super.setName("Light Armor");

		//assigns the indicated strong to the type property
		super.setType("Light Armor");

		//assigns the indicated value to the defense property
		super.setDefense(8);
	}

	//method to return the object represented as a String
	//with appropriate labels for each field
	public String toString(){

		return "ARMOR -\n"
						+ "   Name: " + super.getName() + "\n"
						+ "   Type: " + super.getType() + "\n"
						+ "Defense: " + super.getDefense() + "\n\n";
	}
}
