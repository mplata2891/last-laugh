/*FINALIZED*/

/*
	Mike Plata
	CoSci 290
	
	The selector class holds the players in game menu selections
	for all three tiers of menus - title menu, main menu, and sub menu
*/

//begin new class
public class Selector extends GamePiece{
	
	//the Selector class has 3 class fields
	private int titleSelection;
	private int mainSelection;
	private int subSelection;
	
	
	//default constructor
	public Selector() {
		
		//assigns the given value to the titleSelection field
		this.titleSelection = 0;
		
		//assigns the given value to the titleSelection field
		this.mainSelection = 0;
		
		//assigns the given value to the titleSelection field
		this.subSelection = 0;
	}//end constructor
	
	
	
	//method to get the value of the titleSelection field
	public int getTitleSelection() {
		
		//returns the value of the titleSelection field
		return this.titleSelection;
	}//end getTitleSelection
	
	
	
	//method to set the value of the titleSelection field
	public void setTitleSelection(int newValue) {
		
		//assigns the value of newValue to the titleSelection field
		this.titleSelection = newValue;
	}//end setTitleSelection
	
	
	
	//method to get the value of the mainSelection field
	public int getMainSelection() {
		
		//returns the value of the mainSelection field
		return this.mainSelection;
	}//end getmainSelection
		
		
		
	//method to set the value of the mainSelection field
	public void setMainSelection(int newValue) {
			
		//assigns the value of newValue to the mainSelection field
		this.mainSelection = newValue;
	}//end setMainSelection
	
	
	
	//method to get the value of the subSelection field
	public int getSubSelection() {
		
		//returns the value of the subSelection field
		return this.subSelection;
	}//end getSubSelection
		
		
		
	//method to set the value of the subSelection field
	public void setSubSelection(int newValue) {
			
		//assigns the value of newValue to the subSelection field
		this.subSelection = newValue;
	}//end setSubSelection
	
	
	
	//returns class represented as a String
	public String toString() {
		
		//returns following String
		return "Selector-\n"
				+ "Title Selection: " + this.titleSelection + "\n"
				+ "Main Selection : " + this.mainSelection + "\n"
				+ "Submenu Selection: " + this.subSelection + "\n\n";
	}//end toString
		
}//end class