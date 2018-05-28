/*FINALIZED*/

/*
  Mike Plata
  CoSci 290

	The Menu class holds options for the user to
	interact with and make their way through the
	game 
*/

//declare imports
import java.util.ArrayList;

//begin a new class
public class Menu{

  //the Menu class has 2 member fields/properties
  private String name;
  private ArrayList<String> options;

  //default constructor
  public Menu(){

    //assigns the indicated string to the name field
    this.name = "";

    //instantiates a new array and assigns it to the option field
    this.options = new ArrayList<>();
  }//end constructor


  
  //implicit constructor
  public Menu(String name, String filename){

    //assigns the value of name to the name field
    this.name = name;

    //instantiates a new array and assigns it to the option field
    this.options = new ArrayList<>();
  }//end constructor
  


  //method to return the value of the name field
  public String getName(){

    //returns the value of the name field
    return this.name;
  }//end getName
  


  //method to set the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
  }//end setName
  
  
  
  //method to add String to the option field
  public void addOption(String newOption) {
	  
	  //adds newOption to the array list in the option field
	  this.options.add(newOption);
  }//end addOption
  


  //method to print name member field and indexes of options ArrayList
  public void displayMenu(){

    //invokes getName method and prints the return value
    System.out.println(this.getName());

    for(int i = 0; i < this.options.size(); i++){ //initiate for loop

      //invokes get method and prints the return value
      System.out.println(this.options.get(i));
    }//end for
  System.out.print("\n");
  }//end displayMenu

}//end of class
