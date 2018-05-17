//import java.util.*;

public class TestDriverMike{

  public static void main(String[] args){

      Room room1 = new Room();
      Door door1 = new Door();
      Sense sense = new Sense();
      Examine examine = new Examine();
      Player playerOne = new Player();
      Inventory inventory = new Inventory();

      door1.setName("Iron Door");
      door1.setKeyName("Iron Key");
      door1.setDescription("The Door is heavy and rusted.");

      room1.setDoor(door1);

      for(int i = 0; i < 4; i++){
        room1.addItem(new Item());
        room1.getItem(i).setName("Item " + (i + 1));
        room1.getItem(i).setDescription("This is Item number " + (i + 1) + ".");
      }
      
      for(int i = 0; i < 4; i++){
          playerOne.addItem(new Item());
          playerOne.getItem(i).setName("Item " + (i + 1));
          playerOne.getItem(i).setDescription("This is Item number " + (i + 1) + ".");
        }
      
      sense.senseSurroundings(room1);
      
      examine.examineItem(room1, "Item 1");

      inventory.openInventory(playerOne);
      
      inventory.inspectItem(playerOne, "Item 1");
      
      System.out.println(playerOne.getFullInventory());
      
      System.out.println(playerOne.toString());
      
      System.out.println("\nDone.");

  }//end main

}//end class
