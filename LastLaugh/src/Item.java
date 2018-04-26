/*
  Mike Plata
  CoSci 290
	Item Class

  Abstract class for to be inherited by other concrete Item subclasses
  To be used by the Player class
*/

public class Item{

	//the Item class has 4 properties
	private String name;
	private int strMod;
	private int tufMod;
	private int sklMod;

	//the Item class has 1 defualt constructor
	public Item(){

		//assigns the indicated String to the name property
		this.name = "None";

		//assigns the value of zero (0) to the strMod property
		this.strMod = 0;

		//assigns the value of zero (0) to the tufMod property
		this.tufMod = 0;

		//assigns the value of zero (0) to the sklMod property
		this.sklMod = 0;
	}

	//method to set the name property
	public void setName(String name){

		//assigns the indicated String to the name property
		this.name = name;
	}

	//method to return the value of the name property
	public String getName(){

		//returns the value of the name property
		return this.name;
	}

	//method to set the strMod property
	public void setStrMod(int newValue){

		//assigns the value of newValue to strMod property
		this.strMod = newValue;
	}

	//method to return the value of the strMod property
	public int getStrMod(){

		//returns the value of the strMod property
		return this.strMod;
	}

	//method to set the tufMod property
	public void setTufMod(int newValue){

		//assigns the value of newValue to tufMod property
		this.tufMod = newValue;
	}

	//method to return the value of the tufMod property
	public int getTufMod(){

		//returns the value of the tufMod property
		return this.tufMod;
	}

	//method to set the sklMod property
	public void setSklMod(int newValue){

		//assigns the value of newValue to sklMod property
		this.sklMod = newValue;
	}

	//method to return the value of the sklMod property
	public int getSklMod(){

		//returns the value of the defMod property
		return this.sklMod;
	}

	//method to return class members as a string
	public String toString() {

		//returns class members as a string
		return "ITEM - \n"
						+ "    Name: " + this.name "\n"
						+ " Str Mod: " + this.strMod + "\n"
						+ " Tuf Mod: " + this.tufMod + "\n"
						+ " Skl Mod: " + this.sklMod + "\n\n";
	}
}
