/*
  Mike Plata
  CoSci 290

*/

//begin new interface
public interface Sense{

  //method that prints the name of the door, and names of the Items
  //located in the room that the player is currently in
  public void SenseSurroundings(Room currentRoom){

    //prints message to the user
    System.out.println("In the room you're in, you notice. . .");

    //invokes the identifyDoor method
    this.identifyDoor(currentRoom);

    //invokes the identifyContents method
    this.identifyContents(currentRoom);

  }//end SenseSurroundings


  //method to print the name of the Door, in the current Room
  public void identifyDoor(Room currentRoom){

    //prints the name of the Door with label by invoking getDoorName
    System.out.println("Door:" + currentRoom.getDoor().getDoorName());

  }//end identifyDoor


  //method to print the name of every Item in the current Room
  public void identifyContents(Room currentRoom){

    //prints Item label
    System.out.println("Items:\n");

    //inititate for loop to iterate through ArrayList
    for(int i = 0; i < currentRoom.getNumberOfItems(); i++)
      //prints the name of the item located in the current index
      System.out.println(currentRoom.getItem(i).getName());

  }//end identifyContents

}//end SenseSurroundings
