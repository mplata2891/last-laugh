/*
  Mike Plata
  CoSci 290

*/

//begin new interface
public interface Action{

  public String performAction(String action, Room currentRoom){

    if(currentRoom.getItem(i).getManipulatedBy().equalsIgnoreCase(itemName)
        == action){

      System.out.println(currentRoom.getItem(i).toString());
  }


}
