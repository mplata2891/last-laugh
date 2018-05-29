/*CHECKED*/

/*
	Mike Plata
	CoSci 290
	
	The Item class is an abstract class to be inherited by other concrete
	subclasses. The Item class is the super-class for the Key, Terminal,
	and PuzzlePiece classes.
	
	The Item class is a subclass of the GamePiece class.
*/

//begin new class
public abstract class Item extends GamePiece{

	//the Item class has 4 class members/fields/properties
	private String type;
	private String name;
	private String description;
	private String status;


	//default constructor
	public Item(){

		//assigns the indicated String to the name property
		this.name = "Default Item Name";

		//assigns the indicated string to the type property
		this.type = "Default Item Type";

		//assigns the indicated string to the description property
		this.description = "Default Item Description";
		
		//assigns the indicated string to the status property
		this.status = "Active";
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
	  


	  //method to assigns a value to the description property
	  public void setDescription(String newDescription){
	
	    //assigns the value of newDescription to the description property
	    this.description = newDescription;
	  }//end setDescription
	  
	  
	  
	  //method to get the value of the status property
	  public String getStatus() {
		  
		  //returns the value of the status property
		  return this.status;
	  }//end getStatus
	  
	  
	  
	  //method to assigns a value to the status property
	  public void setStatus(String newStatus) {
		  
		  //assigns the value of newStatus to the status property
		  this.status = newStatus;
	  }//end setStatus



	//method to return class members that are not hidden from the player
	//as a string with appropriate labels for each class member
	public String toString(){

		//returns class members as a string
		return this.type + " - \n"
						+ "Name: " + this.name + "\n"
						+ "Description: " + this.description + "\n";
	}//end toString

}//end of class
