import java.util.*;

public class TestDriver{

  public static void main(String[] args){
    
    FileUtility fileTool = new FileUtility();
    
    //access the splashPage member of the tool object to display the game's title
    fileTool.readFile("TextFiles/SplashScreens/Title.txt");
    
    //access the readFile member of the tool object to display the story's Prologue
    fileTool.readFile("TextFiles/Story/Intro1.txt");
    
    //ask for user input (name)

    //access the readFile member of the tool object to display the story's
    //first part of the intro
    fileTool.readFile("TextFiles/Story/Intro2.txt");


  }
}
