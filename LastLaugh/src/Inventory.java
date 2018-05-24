/*
	Mike Plata
	CoSci 290

	The Inventory class is an action a player can take during game-play.
	If the player takes the Inventory action, then they open their Inventory
	and can take additional actions such as inspecting an Item in their inventory,
	combining two items in their inventory, or using an item in their inventory.
*/

//begin new class
public class Inventory extends Command{

	//method to display the player's inventory as a list
	public void openInventory(Player player){

		//initiate for loop to iterate through list
		for(int i = 0; i < player.getNumberOfKeys(); i++){
			
			//print a string representation of each key in the List
			System.out.println("Key " + (i + 1) + ": " + player.getKey(i).toString());
		}//end for
	}//end openInventory



	//method to use an Key in the Player's inventory
	public void useKey(Player player, Door door){
		
		//instantiate and initialize objects
		Key tempKey = new Key();

		//declare and initialize variables
		boolean correctKey = true;

		//invoke selectKey method and assigns its return value to tempKey
		tempKey = this.selectKey(player);

		//invoke checkKey method and assign its return value to correctKey
		correctKey = this.checkKey(tempKey, door);

		//initiate if-else statement
		if(correctKey == true)
			this.unlockDoor(player, door);//invoke unlockDoor method
		else
			/*display error message*/;
	}//end useKey



	//method to selectKey for use
	private Key selectKey(Player player){

		//declare and initialize variables
		int selection = 0;

		//take user's selection

		//returns the Key object in the specific index
		return player.getKey(selection - 1);
	}//end selectKey



	//method to check if selected key unlocks the current door
	private	boolean checkKey(Key key, Door door){

		//initiate if-else statement
		if(key.getName() == door.getKeyName())
			return true;//returns boolean value of true
		else
			return false;//returns boolean value of false
	}//end checkKey



	//method to unlock door with chosen key and give player a new note
	private void unlockDoor(Player player, Door door){

		//invokes unlock method
		this.unlock(door);

		//invokes givePlayerNote method
		this.givePlayerNote(player, door);
	}//end unlockDoor



	//method to unlock the door
	private void unlock(Door door){

		//set the door's status field to unlocked
		door.setStatus("Unlocked");

		//alerts user that the door has been unlocked
		System.out.println("The " + door.getName() + " has been successfully unlocked.\n");
	}//end unlock



	//method to add a note to the player's notebook
	private void givePlayerNote(Player player, Door door){

		//adds a note to the player's notebook
		player.addNote(door.getNote());

		//alert user to new note
		System.out.println("A new Note has been added to your Notebook.\n");
	}//end givePlayerNote

}//end of class
