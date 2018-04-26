/*
  Mike Plata
  CoSci 290

  sample class of a Player for our
  text adventure. This is based of
  off a character sheet from the
  legendary game - Dungeons and Dragons.
*/

/*
 //modifiers can be part of an interface that player implements
 //interface:
  	private int attackModifier;
  	private int defenseModifier;
 	private int skillModifier;

 	private int totalAttack;
  	private int totalDefense;
  	private int totalSkill;
 */

public class Player extends Player{

	//the Player class has 8 class members/properties
	private String playerType;
	private int level;
	private int experiencePoints;
	private int skillPoints;
	private int hitPoints;
	private int strength;
	private int toughness;
	private int intelligence;

	//default constructor
	public Player(){

		//sets a value to the playerType property
		this.playerType = "";

		//sets a value to the level property
		this.level = 1;

		//sets a value to the experiencePoints property
		this.experiencePoints = 0;

		//sets a value to the skillPoints property
		this.skillPoints = 0;

		//sets a value to the hitPoints porperty
		this.hitPoints = 0;

		//sets a value to the strenght property
		this.strength = 0;

		//sets a value to the toughness property
		this.toughness = 0;

		//sets a value to the intelligence property
		this.intelligence = 0;
	}

	//method to assign a value to the playerType property
	public void setPlayerType(String newType){

		//assigns the value of newType to playerType
		this.playerType = newType;
	}

	//method to return the value of the playerType property
	public String getPlayerType(){

		//retrurns the value of the playerType property
		return this.playerType;
	  }

	//method to assign a value to the level property
	public void setLevel(int newLevel){

		//assigns the value of newLevel to level
		this.level = newLevel;
	}

	//method to return the value of the level property
	public int getLevel(){

		//retrurns the value of the level property
		return this.level;
	}

	//method to assign a value to the experience property
	public void setExperiencePoints(int newExperiencePoints){

		//assigns the value of newExperience to experiencePoints
		this.experiencePoints = newExperience;
	}

	//method to return the value of the experiencePoints property
	public int getExperiencePoints(){

		//retrurns the value of the experience property
		return this.experiencePoints;
	}

	//method to return the value of the skillPoints property
	public void setSkillPoints(int newSkillPoints) {

		//assigns the value of newSkillPoints to the skillPoints property
		this.skillPoints = newSkillPoints;
	}

	//method to return the value of the skillPoints property
	public int getSkillPoints() {

		//returns the value of the skillPoints property
		return this.skillPoints;
	}

	//method to assign a value to the hitPoints property
	public void setHitPoints(int newHp){

		//assigns the value of newHp to hitPoints
		this.hitPoints = newHp;
	}

	//method to return the value of the hitPoints property
	public int getHitPoints(){

		//retrurns the value of the hitPoints property
		return this.hitPoints;
	}

	//method to assign a value to the strength property
	public void setStrength(int newValue){

		//assigns the value of newValue to strength
		this.strength = newValue;
	}

	//method to return the value of the strength property
	public int getStrength(){

		//retrurns the value of the strength property
		return this.strength;
	}

	//method to assign a value to the toughness property
	public void setToughness(int newValue){

		//assigns the value of newValue to toughness
		this.toughness = newValue;

	}

	//method to return the value of the toughness property
	public int getToughness(){

		//retrurns the value of the toughness property
		return this.toughness;
	}

	//method to assign a value to the intelligence property
	public void setIntelligence(int newValue){

		//assigns the value of newValue to intelligence
		this.intelligence = newValue;
	}

	//method to return the value of the intelligence property
	public int getIntelligence(){

		//retrurns the value of the intelligence property
		return this.intelligence;
	}

	//method to return object fields as a string
	public String toString() {

		//returns object fields as a string
		return "First Name: " + super.getFirstName() + "\n"
						+ "Last Name: " + super.getLastName() + "\n"
						+ "  Age: " + super.getAge() + "\n"
						+ "Class: " + this.playerType + "\n"
						+ "Level: " + this.level + "\n"
						+ "  Exp: " + this.experiencePoints + "\n"
						+ "   SP: " + this.skillPoints + "\n"
						+ "   HP: " + this.hitPoints + "\n"
						+ "  Str: " + this.strength + "\n"
						+ "  Tuf: " + this.toughness + "\n"
						+ "  Int: " + this.intelligence + "\n\n";
	}

/*
  Unsure if the following will be contained in this class


  //method to set the totalAttack property of the player
  private void setTotalAttack(int weaponAttack, int attackMod){

    //calculates a value and assigns that value to totalAttack
    this.totalAttack = weaponAttack + attackMod;
  }

  //method to return the valur of the totalAttack property
  public int getTotalAttack(){

    //returns the value of the totalAttack property
    return totalAttack;
  }

  //method to set the totalDefense property of the player
  private void setTotalDefense(int armorDefense, int defenseModifier){

    //calculates a value and assigns that value to totalDefense
    this.totalDefense = armorDefense + defenseModifier;
  }

   //method to return the valur of the totalDefense property
  public int getTotalDefense(){

    //returns the value of the totalDefense property
    return totalDefense;
  }

  //method to set the totalSkill property
  private void setTotalSkill(){

    //sets the value of the totalSkill property
    this.totalSkill = this.skillModifier;
  }

  //method to return the value of the totalSkill property
  public int getTotalSkill(){

    //returns the value of the totalSkill property
    return totalSkill;
  }
  */

}
