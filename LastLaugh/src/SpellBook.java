/*
	Mike Plata
	CoSci 290
	SpellBook

	SpellBook class is used exclusively by
	the MagicUser class
*/

import java.util.ArrayList;
public class SpellBook{

	private ArrayList<Spell> spells;
	private int numberOfSpells;
	private int maxSpells;

	public SpellBook() {

		//creates an ArrayList and assigns it to the spells field
		this.spells = new ArrayList<>[];

		//assigns a value to the numberOfSpells field
		this.numberOfSpells = 0;

		//assigns a value to the maxSpells field
		this.maxSpells = 3;
	}

	//method to return the value of the spells field
	public ArrayList<Spell> getSpells(){

		//returns the value of the spells field
		return this.spells;
	}

	//method to add an element to the spells field
	public void setSpells(Spell newSpell){

		//adds newSpell as an ellement in the spells field
		this.spells.add(newSpell);
	}

	//method to return the value of the numberOfSpells field
	public int getNumberOfSpells(){

		//returns the value of the numberOfSpells field
		return this.numberOfSpells;
	}

	//method to set the value of the numberOfSpells field
	public void setNumberOfSpells(){

		//sets the value of the spells size property to the numberOfSpells field
		this.numberOfSpells = this.spells.size();
	}

	//method to return the value of the maxSpells field
	public int getMaxSpells(){

		//retrurns the value of the maxSpells field
		return this.maxSpells;
	}

	//method to set the value of the maxSpells field
	public void setMaxSpells(int newMax){

		//assigns the value of newMax to the maxSpells field
		this.maxSpells = newMax;
	}

	//method to concatonate the contenst of the spells field into one String
	//for printing purposes
	public String printSpells(){

		//declare and initialize needed variables
		String list = "";

		//initiate for loop for concatonation
		for(int i = 0; i < this.spells.size(); i++){

			//strings concatonated into list
			list += (i+1) + ". " + this.spells.get(i).toString();
		}

		//return the value of list
		return list;
	}

	//method to print the object represented as a strings
	//with approptiate labels for all fields
	public String toString(){

		//return string
		return "SPELL BOOK - Contents:\n"
						+ this.printSpells() + "\n\n";
	}
}
