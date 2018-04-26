/*
  
  Group Last Laugh
  
  Our game starring you, try to escape.  
  
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
   tool.readFile("TextFiles/Story/Prologue.txt");
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

    
    

    tool.splashPage("gameover");

  } //end of main

} //end of class
