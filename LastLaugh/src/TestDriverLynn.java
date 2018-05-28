import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class TestDriverLynn{

  
  
  public static void main(String[] args){
    
    //Scanner input = new Scanner(System.in);

    
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
      FileUtility fileTool = new FileUtility();
      fileTool.readFile("/TextFiles/Misc/MenuPrompt.txt");
    }
    
    public static void itemPrompt(){
      FileUtility fileTool = new FileUtility();
      fileTool.readFile("/TextFiles/Misc/ItemPrompt.txt");  
    }
  
}//end class
