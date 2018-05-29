/*CHECKED*/

/*
	Mike Plata
	CoSci 290
	
	The Navigator class is a container for all the in game menus
	that the user will interact with to navigate through the
	game
*/

//declare imports
import java.util.ArrayList;

//begin new class
public class Navigator extends GamePiece{
	
	//the Navigator class has 2 class members/fields/properties
	private int numberOfMenus;
	private ArrayList<Menu> menus;
	
	
	//default constructor
	public Navigator() {
		
		//instantiates an ArrayList of type Menus and assigns it to the menus field
		this.menus = new ArrayList<>();
		
		//assigns the given value to the numberOfMenus field
		this.numberOfMenus = 0;
	}//end constructors
	
	
	
	//method to get the value of the numberOfMenus field
	public int getNumberOfMenus() {
			
		//returns the value of the getNumberOfMenus field
		return this.numberOfMenus;
	}//end getNumberOfMenus
		
		
		
	//method to set the value of the numberOfMenus field
	public void setNumberOfMenus(int newValue) {
			
		//assigns the value of newValue to the numberOfMenus field
		this.numberOfMenus = newValue;
	}//end setNumberOfMenus
	
	
	
	//method to get a menu object in the menus field
	public Menu getMenu(int index) {
		
		//returns the Menu object stored in the menus field List
		return this.menus.get(index);
	}//end getMenu
	
	
	
	//method to add a menu object to the List stored in the menus field
	public void addMenu(Menu newMenu) {
		
		//adds newMenu to the List stored in the menus field
		this.menus.add(newMenu);
	}//end addMenu
	
	
	
	//method to print class represented as a string
	public String toString() {
		
		//returns the following string
		return "Navigator - \n"
				+ "Number Of Menus: " + this.numberOfMenus + "\n\n";
	}//end toString
	
}//end class