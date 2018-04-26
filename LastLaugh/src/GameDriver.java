/*
  Francisco Leon
  Co Sci 290

  This program runs a text based rpg that puts to use
  lessons learned in class.
*/

import java.util.*;

public class GameDriver{
  public static void main(String[] args){

    String name = "";

    String catName = "";
    String direction = "";
    double clownLikeLevel = 0.0;
    Utility tool = new Utility();


   tool.splashPage("title");
   tool.readFile("Text.txt");
    //tool.splashPage("intro");

    //User info/set up
    System.out.print("You've been passed out for 3 days.\n" + "What's your name? ");
    Scanner input = new Scanner(System.in);
    //name = input.next();

    tool.TestWriteFile(input.next());
    tool.readFile("testWriting.txt"); //cool works
    System.out.print( ", on a scale of 1 to 10, how much do you like clowns? ");

    clownLikeLevel = input.nextDouble();
    System.out.print(clownLikeLevel + " out of 10? Great! \nCause this place is full of them!\n \n"
                    + "Also, here's a cat.\n");
    tool.splashPage("cat");

    System.out.print("What's it's name? ");
    catName = input.next();
    System.out.print("\nLooks like " + name + " and " + catName + " are ready!\n"
                    + "Which direction do you head in? ");
    direction = input.next();
    System.out.print("Cool, " + direction + " it is! Good luck!\n \n");

    //Random event
    System.out.println("There's a lot of dust.\n" + "Oh, you feel a sneeze coming on.\n"
                      + "ahhh\nahhHHHHhh\nCHUUUUU!");
    if(tool.chance(1,100) >30){
      System.out.println("\nMEOW~\n" + catName + " got scared and ran out the room.");
    }
    else{
      System.out.println("\nIn the distance you hear a low whisper say... bless you.");
    }

    //Lab 10 The human parts done with ArrayList

    //Making humans
    Human Npc1 = new Human("Jack","Lok", tool.chance(1,100));
    Human Npc2 = new Human("Hang","Mang", tool.chance(1,100));
    Human Npc3 = new Human("Leaf","Jones", tool.chance(1,100));

    ArrayList<Human> NonImportantPlayers = new ArrayList<Human>();

    NonImportantPlayers.add(Npc1);
    NonImportantPlayers.add(Npc2);
    NonImportantPlayers.add(Npc3);

    //printing human names
    for(Human Npc: NonImportantPlayers){
      Npc.printHuman();
    }

    /* Thinking about a find human function that searches and returns
        an object in my array
    System.out.println("Who do you choose to aid you?\nCall their first name: " );
    String helper1 = input.next();
    findHuman(helper1,NonImportantPlayers).printHuman();
    System.out.println("has joined your party.");
    */

    //Things thinking about using, not really sure on direction of game

    /* Might use this when Player object is finsihed
    for(int index = 0; index < NonImportantPlayers.length; index++){
       NonImportantPlayers[index].setHitPoints(1 + (int)(Math.random() * (20 - 1)));
       System.out.println("Hit points: " + NonImportantPlayers[index].getHitPoints());
    }
    */
    //Default weapons
    /*
    Weapon noWeapon = new Weapon("none",0);
    Armor noArmor = new Armor("none",0);
    Item noItem = new Item("none",0,0,0);
    */
    //NPC set up

    /*
    Npc1.setStrength(1 + (int)(Math.random() * (20 - 1)));
    System.out.println("Strength: " + Npc1.getStrength());
    System.out.println("attack: " + Npc1.getTotalAttack());

    for(Player Npc: NonImportantPlayers){
      Npc.setHitPoints(1 + (int)(Math.random() * (20 - 1)));
      Npc.setStrength(1 + (int)(Math.random() * (20 - 1)));
      Npc.setToughness(1 + (int)(Math.random() * (20 - 1)));
      Npc.setIntelligence(1 + (int)(Math.random() * (20 - 1)));
    }

    int i = 1;
    for(Player Npc: NonImportantPlayers){
      System.out.println(Npc.getFirstName() + " " + Npc.getLastName() + " attributes:");
      System.out.println("Hit points: " + Npc.getHitPoints());
      //System.out.println("Strength: " + Npc.getStrength());
      System.out.println("getToughness: " + Npc.getToughness());
      System.out.println("Intelligence: " + Npc.getIntelligence());
    }
    */

    tool.splashPage("gameover");

  }
  
  //not sure if going to use this
  public static Human findHuman(String firstName, Human[] people){
    for(Human x : people){
      if(x.getFirstName() == firstName) return x;
    }
    return null;
  }

}
