/*
  Mike Plata
  CoSci 290

  The Examine class represents an action that the player can take druing
  gameplay. If the Player chooses to take this action, the Player examines
  a specific Item in the current room they are in. Examining an Item will tell
  the player the name of the item, the type of item it is, and a description
  of the Item.
*/

//begin new class
public class Examine{

  //method to print the details of a specific Item in a Room
  public void examineItem(Room currentRoom, String itemName){

    //initiate for loop to iterate through list
    for(int i = 0; i < currentRoom.getNumberOfItems(); i++){

      //initiate if statement
      if(currentRoom.getItem(i).getName().equalsIgnoreCase(itemName) == true){

        //print out details of Item
        System.out.println(currentRoom.getItem(i).toString());
      }//end if
    }//end for
  }//end InspectItem

}//end Inspect
