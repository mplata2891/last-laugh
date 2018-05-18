/*
	Mike Plata
	CoSci 290
	
	The Item class is an abstract class to be inherited by other concrete
	subclasses. The Item class is the super-class for the Key, Terminal,
	and PuzzlePiece classes.
	
	The Item class is a subclass of the GamePiece class.
*/

//begin new class
public class Item extends GamePiece{

	//the Item class has  class members/fields/properties
	private String type;
	private String name;
	private String description;



	//default constructor
	public Item(){

		//assigns the indicated String to the name property
		this.name = "None";

		//assigns the indicated string to the type property
		this.type = "None";

		//assigns the indicated string to the description property
		this.description = "None";
	}//end constructor
	
	
	
	//method to return the value of the type property
	public String getType(){

		//returns the value of the type property
		return this.type;
	}//end getType
	


	//method to set the type property
	public void setType(String newType){

		//assigns the value of newType to the type property
		this.type = newType;
	}//end setType
	


	//method to return the value of the name property
	public String getName(){

		//returns the value of the name property
		return this.name;
	}//end getName
	


	//method to set the name property
	public void setName(String name){

		//assigns the indicated String to the name property
		this.name = name;
	}//end setName
	
	

	//method to return the value of the description property
	  public String getDescription(){
	
	    //returns the value of the description property
	    return this.description;
	  }//end getDescription
	  


	  //method to assigns a value to the description proptery
	  public void setDescription(String newDescription){
	
	    //assigns the value of newDescription to the description property
	    this.description = newDescription;
	  }//end setDescription



	//method to return class members that are not hidden from the player
	//as a string with appropriate labels for each class member
	public String toString(){

		//returns class members as a string
		return this.type + " - \n"
						+ "Name: " + this.name + "\n"
						+ "Description: " + this.description + "\n\n";
	}//end toString

}//end of class
