/*
  Mike Plata
  CoSci 290

  The InputUtility class is a utility class with methods
  that are used to prompt user for input, take the input from the user,
  and to check whether their input input was valid.

  In most cases, if the input is not valid, the methods in this class
  will display an error message, give examples of valid input, and
  reprompt for input.
*/

import java.util.*;
//begin new class
public class InputUtility{

  //method to take selection from user and validate the selection
  public int takeSelection(int maxSelection){
    
    //declare and initialize variables
    boolean selectionIsValid = false;
  	int selection = 0;

  	do{ //initiate do-while

      //invoke takeInteger method and assigns its return value to selection
      selection = this.takeInteger();

      //invoke validateSelection method
      selectionIsValid = this.validateSelection(selection, maxSelection);

  		if(selectionIsValid == false); //initiate if statement
  		//to-do: make-->	this.displayErrorMsg(); //invoke displayErrorMsg method

  	}while(selectionIsValid == false); //end do-while

  	return selection; //returns the value of selection
  }//end takeSelection


  
  //method to take an integer input from the user
  public int takeInteger(){

    //instantiate and initialize objects
    Scanner input = new Scanner(System.in);

    //declare and initialize variables
    int number = 0;
    
    while (!input.hasNextInt()) {
    	input.next();
    	System.out.println("Please only enter an integer\n");
    }
    
    //invoke the nextInt method and assigns its return value to number
    number = input.nextInt();
    
    //input.close();

  	return number; //returns the value of number
  }//end takeInteger
  


  //method to validate if a user's selection is an integer greater
  //than zero and within the constraints of the selection range
  private boolean validateSelection(int input, int max){

  	if(input > 0 && input <= max)//enter if statement
  		return true;//assigns the value of true to validFlag
  	else
  		return false;//returns the value of validFlag
  }// isSelectionValid
  


  //method to take a name from the user and confirm it is valid
  public String takeName(){

    //declare and initialize variables
    boolean inputIsValid = false;
    String input = "";

    do{//enter do-while

      System.out.print("Please Enter a Name: ");

      //invokes the takeString method and assigns its return value to input
      input = this.getString();

      //invokes the isNameValid method
      inputIsValid = this.isNameValid(input);

      if(inputIsValid == false)//enters if statement
        this.nameErrorMsg();//invokes the nameErrorMsg method

    }while(inputIsValid == false);//end do-while

    return input;//returns the value of input
  }//end getName
  


  public String getString(){
    //If there is a space between two words only takes the first word (but i feel like that's expected)

    String newString = "";

    Scanner input = new Scanner(System.in);

    newString = input.next();

    return newString;
  }//end getInput
  


  public boolean isNameValid(String value){

    boolean validFlag = false;

    if(value != ""){

      for(int i = 0; i < value.length(); i++){

        //check if the character is a letter or a number
        if(Character.isLetterOrDigit(value.charAt(i))){

          validFlag = true;
        }
        else{

          validFlag = false;

          return validFlag;
        }//end if-else
      }//end for
    }//end if

    return validFlag;
  }//end isNameValid


  public void nameErrorMsg(){

    FileUtility fileTool = new FileUtility();

    fileTool.readFile("src/TextFiles/Misc/InvalidName.txt");

    System.out.println();
  }//end nameErrorMsg
  
  
  
  public void menuPrompt(){
	  
      FileUtility fileTool = new FileUtility();
      
      fileTool.readFile("src/TextFiles/Misc/MenuPrompt.txt");
    }//end menuPrompt
  
  
  
  public void itemPrompt(){
	  
	  FileUtility fileTool = new FileUtility();
	  
      fileTool.readFile("src/TextFiles/Misc/ItemPrompt.txt");
  }//end item prompt
  
  
  
  //method to prompt the user for solution to riddle
  public void promptForSolution() {
	  
	  //prints message to user
	  System.out.println("\nType the word that solves the riddle (You may ignore case): ");
  }//end promptForSolution
  
  
  
  //method to taunt the player for exiting the game
  public void tauntPlayer() {
	  
	  //prints message to user
	  System.out.println("Afraid? You better be. . . HAHAHAHAHAHAHA!");
  }//end tauntPlayer
  
  
  
  //method to prompt user to select a key
  public void promptKeySelection() {
	  
	  System.out.println("Type in the number of the Key, you wish to select for use:\n");
  }//end promptKeySelection
   

}//end class
