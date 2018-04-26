/*
	Mike Plata
	CoSci 290
	Knife

	Knife Class is an extension of the Weapon class
	The knife is a moderate damage weapon
*/

public class Knife extends Weapon{

	public Knife() {

		//assigns a value to the name property
		super.setName("Knife");

		//assigns a value to the type property
		super.setType("Knife");

		//assigns a value to the attack property
		super.setAttack(6);
	}

	//method to print out the object represented as a String
	//with appropriate labels for each field
	public String toString(){

		return "WEAPON - \n"
						+ "  Name: " + super.getName() + "\n"
						+ "  Type: " + super.getType() + "\n"
						+ "Attack: " + super.getAttack() + "\n\n";
	}
}
