/*
	Mike Plata
	CoSci 290
	Leather Armor

	LeatherArmor class is a concrete extension of the Armor class
	LeahterArmor is used by the Rogue class
	Leather Armor has moderate defense
*/

public class LeatherArmor extends Armor{

	//the LeatherArmor class has one default constructor
	public LeatherArmor() {

		//assigns the indicated string to the name property
		super.setName("Leather Armor");

		//assigns the indicated strong to the type property
		super.setType("Leather Armor");

		//assigns the indicated value to the defense property
		super.setDefense(6);
	}

	//method to print out object represented as a String
	//with appropriate labes for each field
	public String toString(){

		return "ARMOR - \n"
						+ "   Name: " + super.getName() + "\n"
						+ "   Type: " + super.getType() + "\n"
						+ "Defense: " + super.getDefense() + "\n\n";
	}
}
