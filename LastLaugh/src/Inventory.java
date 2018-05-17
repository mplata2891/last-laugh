/*
	Mike Plata
	CoSci 290

	The Inventory class is an action a player can take during game-play.
	If the player takes the Inventory action, then they open their Inventory
	and can take additional actions such as inspecting an Item in their inventory,
	combining two items in their inventory, or using an item in their inventory.
*/

//begin new class
public class Inventory{

	//method to open a player's inventory
	public void openInventory(Player player){
		
		//prints out header to identify inventory
		System.out.println("Inventory:");

		//initiate for loop to iterate through list of items
		for(int i = 0; i < player.getNumberOfItems(); i++){

				//print out the name of the item located in each index of the list
				System.out.println(player.getItem(i).getName());//print out name of item
		}//end for
	}//end openInventory
	


	//method to select an item in the player's inventory
	public void inspectItem(Player player, String itemName){

		//initiate for loop to iterate through list of items
		for(int i = 0; i < player.getNumberOfItems(); i++){

			//initiate if statement
			if(player.getItem(i).getName().equalsIgnoreCase(itemName) == true){

				//print out details of selected item
				System.out.println(player.getItem(i).toString());
			}//end if
		}//end for
	}//end inspectItem
	
	
	
	//method to combine two Items
	public void combineItems(Player player, Item item1, Item item2) {
		
		//Instantiate and initialize objects
		Item newItem = new Item();
		
		//declare and initialize variables
		boolean itemsCombine = false;
		
		
		itemsCombine = checkIfItemsCombine(item1, item2);
		
		if(itemsCombine = true) {
			newItem = combine(item1, item2);
			
			addItemToInventory(newItem, item1, item2)
		}
		else
			displayErrorMsg();
	}
	
	
	
	
	
	
	
	
	
	
}//end class
