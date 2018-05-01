/*
  Mike Plata
  CoSci 290


*/
package Menus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//begining of a new class
public class Menu{

  //the Menu class has 2 member fields/properties
  private String name;
  private int size;
  private ArrayList<String> options;

  //default constructor
  public Menu(){

    //assigns the indicated string to the name field
    this.name = "";

    //assigns the indicated value to the size field
    this.size = 0;

    //instantiates a new array and assigns it to the option field
    this.options = new ArrayList<>[];
  }//end constructor

  //implicit constructor
  public Menu(String name, int size){

    //assigns the value of name to the name field
    this.name = name;

    this.size = size;

    //instantiates a new array and assigns it to the option field
    this.options = new ArrayList<>[];
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

  //method to return the value of the size field
  public int getSize(){

    //returns the value of the size field
    return this.size;
  }

  //method to assign a value to the size field
  public void setSize(int newSize){

    //assigns the value of newSize to the size field
    this.size = newSize;
  }

  //method to assigns values to the array located in the options field
  public void setOptions(String filename){

    String currentLine;
    int i = 0;

    try(BufferedReader b_Reader = new BufferedReader(new FileReader(filename))){

      //for(int i = 0; i < this.size; i++){

      while((currentLine = b_Reader.readLine()) != null){

          this.options.add(currentLine);
          //i++;
      }//end while
    //}
    }//end try
    catch(IOException e){

      e.printStackTrace();
    }
  }

  //method to return all values stored in the array as a string
  public String getOptions(){

    //declare variables
    String allOptions = "";

    //initiate for loop to iterate through the array
    for(int i = 0; i < this.options.length; i++){

      //concatonate all values stored in array into one string
      allOptions = "  " + this.options[i] + "\n";
    }

    return allOptions;
  }

  //returns a representation of the object as a String
  //displaying all member fields with appropriate labels
  public String toString(){

    return this.name + ":\n"
            + this.getOptions();
  }
}//end of class
