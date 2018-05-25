/*
	Mike Plata
	CoSci 290
*/

import java.util.ArrayList;

//begin new class
public class Navigator extends GamePiece{
	
	private ArrayList<Menu> menus;
	private int numberOfMenus;
	
	
	//default constructor
	public Navigator() {
		
		//instantiates an ArrayList of type Menus and assigns it to the menus field
		this.menus = new ArrayList<>();
		
		//assigns the given value to the numberOfMenus field
		this.numberOfMenus = 0;
	}//end constructors
	
	
	
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
	
}//end class