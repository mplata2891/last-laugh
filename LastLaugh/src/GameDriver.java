/*
  CoSci 290
  Group Last Laugh
    - Lynn
    - Frank
    - Mike

  Our game starring you, try to escape.

  A simple text adventure where the player must
  solve puzzles in order to get through various rooms
  of the game. Different actions taken during gameplay
  can, and will effect the outcome of the game.

  Contains multiple endings. Good Luck!
*/

//import declarations
import java.util.*;

//begining of new class
public class GameDriver{

  //entry point of main application
  public static void main(String[] args){

    //object decclaration and instantiation
    Scanner input = new Scanner(System.in);
    //FileIoUtility fileTool = new FileIoUtility(); *Im working on this - mike
    Utility tool = new Utility();
    Room room1 = new Room("Room 1", 5, 5, 2, 2);
    //Player player1 = new Player();

    //variable declaration and instantiation
    String advance = "";
    String playerName = "";
    String catName = "";
    String direction = "";
    int numberOfSpaces = 0;
    double clownLikeLevel = 0.0;

    //access the readFile member of the tool object to display the story's Prologue
    tool.readFile("TextFiles/Story/Prologue.txt");

    //access the splashPage member of the tool object to display the game's title
    Tool.splashPage("title");

    //access the readFile member of the tool object to display the story's
    //first part of the intro
    tool.readFile("TextFiles/Story/Intro1.txt");

    //prompt user for input
    System.out.print("You've been passed out for 3 days.\n"
                    + "What's your name?: ");

    //take user's input
    playerName = input.next();

    //access the testWriteFile member of the tool object to write the value of
    //playerName onto a file
    tool.testWriteFile(playerName);

    //access the readFile member of the tool object to ddisplay the story's
    //second part of the intro
    tool.readFile("TextFiles/Story/Intro2.txt");

    //access the readFile member of the tool object to display the contents of
    //the testWriting text file
    tool.readFile("testWriting.txt"); //cool works

    tool.readFile("TextFiles/Story/catIntro.txt");

    //access the splashPage member of the tool object to display a cat
    tool.splashPage("cat");

    System.out.print("You decide to name them... ");
    catName = input.next();
    System.out.print("\nSo now it looks like it's you, " + "and " + catName + "\n"
                    + "against wherever the heck you are. \n"
                     +"You get unsteadily to your feet.");

    //display information for user and prompt input
    System.out.print("\nLooks like " + playerName + " and " + catName + " are ready!\n"
                    + "Which direction do you head in? ");

    //take user input
    direction = input.next();

    //prompt user for input
    System.out.print("How many spaces would you like to move?: ");

    //take user input
    numberOfSpaces = input.nextInt();

    /*working on moving in the map here - Mike
    if(direction == "north"){

      if((numberOfSpaces + room1.getExactRow()) !> (room1.getRows() - 1))
    }
    */

    //confirm user input
    System.out.print("Cool, " + numberOfSpaces + " spaces" + direction
                    + " it is! Good luck!\n\n");

    //First Event - displays info for user
    System.out.println("There's a lot of dust.\n"
                      + "Oh, you feel a sneeze coming on.\n"
                      + "ahhh\n"
                      + "ahhHHHHhh\n"
                      + "CHUUUUU!");

    //initiate if-else statement
    if(tool.chance(1,100) >30){//access the chance member of the tool object

      //display result of the first event
      System.out.println("\nMEOW~\n" + catName
                        + " got scared and ran out the room.");
    }//end if
    else{

      //display result of the first event
      System.out.println("\nIn the distance you hear a low whisper say..."
                        + " bless you.");
    }//end else





    //access the splashPage member of the tool object to display 'gameover'
    tool.splashPage("gameover");

  } //end of main
} //end of class
