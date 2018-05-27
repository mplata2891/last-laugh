import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class TestDriverLynn{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    FileUtility fileTool = new FileUtility();
    
    menuPrompt();
    itemPrompt();
    
    
    /*
    public static menuSelect(String option){
      switch(option){
          
      }//end of switch
    }//end of menuSelection
    */
  }//end main
  
  public static void menuPrompt(){
      System.out.println("Select a menu type a number from 0-8 to make a selection.");
    }
    
    public static void itemPrompt(){
      System.out.println("Input the name of the item you wish to use.");  
    }
  
}//end class
