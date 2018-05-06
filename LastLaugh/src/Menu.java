/*
  Mike Plata
  CoSci 290


*/

//declare imports
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//begining of a new class
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
  }

  //method to set the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
  }

  //method to assigns values to the ArrayList located in the options field
  public void setOptions(String filename){

    //declare and initialize variables
    String currentLine = "";

    //instatntiate objects of type FileReader and type BufferedReader. Wraps
    //BufferedReader around FileReader.
    //initiate try-catch statement in case file does not exist
    try(BufferedReader b_Reader = new BufferedReader(new FileReader(filename))){

      //initiate while loop to read lines from file, and store into currentLine
      while((currentLine = b_Reader.readLine()) != null){

        //adds the value of currentLine to a new index in the options ArrayList
        this.options.add(currentLine);
      }//end while
    }//end try
    catch(IOException e){

      e.printStackTrace();
    }//end catch
  }

  //method to return all values stored in the array as a string
  public void displayMenu(){

    System.out.println(this.getName());

    for(int i = 0; i < this.options.size(); i++){

      System.out.println(this.options.get(i));
    }
  }

/*
  //returns a representation of the object as a String
  //displaying all member fields with appropriate labels
  public String toString(){

    return this.name + ":\n"
            + this.getOptions();
  }
*/
}//end of class
