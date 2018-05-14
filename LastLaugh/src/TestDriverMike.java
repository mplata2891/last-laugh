//import java.util.*;

public class TestDriverMike{

  public static void main(String[] args){

      Room room1 = new Room();
      Door door1 = new Door();
      Player playerOne = new Player();

      door1.setName("Iron Door");
      door1.setKeyName("Iron Key");
      door1.setDescription("The Door is heavy and rusted.");

      room1.setDoor(door1);

      for(int i = 0; i < 4; i++){
        room1.addItem(new Item());
        room1.getItem().setName("Item " + (i + 1));
        room1.getItem().setDescription("This is Item number " + (i + 1) + ".");
      }

      playerOne.senseSurroundings(room1);


  }//end main

}//end class
