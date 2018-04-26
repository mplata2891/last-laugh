/*
	Mike Plata
	CoSci 290
	Sword

	Sword class in a concrete extension of Weapon class
*/

public class Sword extends Weapon{

	public Sword() {

		//assigns a value to the name property
		super.setName("Sword");

		//assigns a value to the type property
		super.setType("Sword");

		//assigns a value to the attack property
		super.setAttack(8);
	}

	public String toString(){

		return "WEAPON - \n"
						+ "  Name: " + super.getName() + "\n"
						+ "  Type: " + super.getType() + "\n"
						+ "Attack: " + super.getAttack() + "\n\n";
	}
}
