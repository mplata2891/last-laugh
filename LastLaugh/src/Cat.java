/*
  Mike Plata
  CoSci290

  Cat class
*/

public class Cat extends GamePiece{

  private String name;
  private String color;
  private int size;
  private int health;

  public Cat(){

    //assigns the value of the indicated string to the name field
    this.name = "Kitty";

    //assigns the value of the indicatied string to the color field
    this.color = "Black";

    //assigns a value to the size field
    this.size = 3;

    //assigs a value to the health field
    this.health = 100;
  }

  //method to return the value of the name field
  public String getName(){

    //returns the value of the name field
    return name;
  }

  //method for setting the value of the name field
  public void setName(String newName){

    //assigns the value of newName to the name field
    this.name = newName;
  }

  //mehtod for returning the value of the color field
  public String getColor(){

    //returns the value of the color field
    return this.color;
  }

  //method for setting the value of the color field
  public void setColor(String newColor){

    //assigns the value of newColor to the color field
    this.color = newColor;
  }

  //method to return the value of the size field
  public int getSize(){

    //returns the value of the size field
    return this.size;
  }

  //method for setting the value of the size field
  public void setSize(int newSize){

    //assigns the value of newSize to the size field
    this.size = newSize;
  }

  //method to return the value of the health field
  public int getHealth(){

    //returns the value of the health field
    return this.health;
  }

  //method for setting the value of the health field
  public void setHealth(int newHealth){

    //assigns the value of newHealth to the health field
    this.health = newHealth;
  }

  //method to print out a String representation of this object.
  //prints out class members/fields with appropriate labels.
  public String toString(){

    //returns object as String
    return "Cat -\n"
            + "  Name: " + this.name + "\n"
            + " Color: " + this.color + "\n"
            + "  Size: " + this.size + "\n"
            + "Health: " + this.health + "\n\n";
  }
}
