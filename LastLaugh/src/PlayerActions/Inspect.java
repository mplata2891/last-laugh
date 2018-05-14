/*
  Mike Plata
  CoSci 290

*/

//begin new interface
public interface Inspect{

  public void InspectItem(Room currentRoom, String itemName){

    for(int i = 0; i < currentRoom.getNumberOfItems(); i++){

      if(currentRoom.getItem(i).getName().equalsIgnoreCase(itemName) == true){

        System.out.println(currentRoom.getItem(i).toString());
      }//end if
    }//end for
  }//end InspectItem

}//end Inspect
