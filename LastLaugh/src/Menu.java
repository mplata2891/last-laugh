/*
  Mike Plata
  CoSci 290


*/

//declare imports
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    //invokes the setOptions method
    this.setOptions(filename);
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
  
  
  
  public void addOption(String newOption) {
	  
	  this.options.add(newOption);
  }
  


  //method to assigns values to the ArrayList located in the options field
  public void setOptions(String filename){

    //declare and initialize variables
    String currentLine = "";

    //instantiate objects of type FileReader and type BufferedReader. Wraps
    //BufferedReader around FileReader.
    //initiate try-catch statement in case file does not exist
    try(BufferedReader b_Reader = new BufferedReader(new FileReader(filename))){

      //initiate while loop to read lines from file, and store into currentLine
      while((currentLine = b_Reader.readLine()) != null){

        //adds the value of currentLine to a new index in the options ArrayList
        this.options.add(currentLine);
      }//end while
    }catch(IOException e){

      e.printStackTrace();//prints a stackTrace -_-
    }//end catch
  }//end setOptions


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
