/*
	Mike Plata
	CoSci 290

	Magic-User Class
*/

public class MagicUser extends Player{

	//the MagicUser class has 4 class members/properties
	private SpellBook book;
	private Armor armor;
	private Item activeItem;
	private Item storedItem;

	//the MagicUser has one default constructor
	public MagicUser(){

		//creates an array and assigns it to the spellBook property
		this.book = new SpellBook();

		//assigns a Cloak object to the armor property
		this.armor = new Cloak();

		//assigns null to the activeItem property
		this.activeItem = new null();

		//assigns null to the storedItem property
		this.storedItem = new null();
	}

	//method to assign a value to the equipedArmor property
		public void setEquipedArmor(Armor newArmor){

			//assigns the newArmor object to the equipedArmor property
			this.equipedArmor = newArmor;
		}

		//method to return the value of the equipedArmor property
		public Armor getEquipedArmor(){

			//returns the value of the equipedArmor property
			return this.equipedArmor;
		}

		//method to assign a value to the activeItem property
		public void setActiveItem(Item newItem){

			//assigns the newItem object to the activeItem property
			this.activeItem = newItem;
		}

		//method to return the value of the activeItem property
		public Item getActiveItem(){

			//returns the value of the activeItem property
			return this.activeItem;
		}

		//method to assign a value to the storedItem property
		public void setStoredItem(Item newItem){

			//assigns the newItem object to the storedItem property
			this.storedItem = newItem;
		}

		//method to return the value of the storedItem property
		public Item getStoredItem(){

			//returns the value of the storedItem property
			return this.storedItem;
		}

		public String toString() {

			return "First Name: " + super.getFirstName() + "\n"
							+ "Last Name: " + super.getLastName() + "\n"
							+ "  Age: " + super.getAge() + "\n"
							+ "Class: " + super.getPlayerType() + "\n"
							+ "Level: " + super.getLevel() + "\n"
							+ "  Exp: " + super.getExperiencePoints() + "\n"
							+ "   SP: " + super.getSkillPoints() + "\n"
							+ "   HP: " + super.getHitPoints() + "\n"
							+ "  Str: " + super.getStrength() + "\n"
							+ "  Tuf: " + super.getToughness() + "\n"
							+ "  Int: " + super.getIntelligence() + "\n"
							+ "Weapon: " + this.equipedWeapon.toString() + "\n"
							+ "Sheathed Weapon: " + this.sheathedWeapon + "\n"
							+ " Armor: " + this.equipedArmor + "\n"
							+ "Active Items: " + this.activeItem[0]
									+ ", " + this.activeItem[1]
							+ "Stored Item: " + this.storedItem[0]
									+ ", " + this.storedItem[1]
									+ ", " + this.storedItem[2] + "\n\n";
		}
}
