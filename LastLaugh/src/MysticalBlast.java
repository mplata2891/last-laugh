/*
	Mike Plata
	CoSci 290
	Mystical Blast

	Mystical Blast class is a concrete extension of Spell
	Mystical blast can by cast by a MagicUser
	Mystical blast is a high attack
*/

public class MysticalBlast extends Spell{

	//the MysticalBlast class has 1 class member/property
	private int attack;

	//the MysticalBlast class has one default contructor
	public MysticalBlast() {

		//assigns the indicated string to the name property
		super.setName("Mystical Blast");

		//assigns the indicated string to the type property
		super.setType("Fire Magic");

		//assigns the indicated string to the description property
		super.setDescription("Delivers a magical blast of fire to the target.");

		//assigns a value to the attack property
		this.attack = 10;

	}

	//method to assign a value to the attack property
	public void setAttack(int newValue) {

		//assigns the value of newValue to the attack property
		this.attack = newValue;
	}

	//method to return the value of the attack property
	public int getAttack() {

		//returns the value of the attack property
		return this.attack;
	}

	//method to print (to screen) each class member with appropriate labels
	public void toString() {

		return "SPELL - \n"
						+ "       Name: " + super.getName() + "\n"
						+ "       Type: " + super.getType() + "\n"
						+ "     Attack: " + this.attack + "\n"
						+ "Description: " + super.getDescription() + "\n\n";
	}

}
