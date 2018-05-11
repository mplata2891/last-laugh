/*
  Mike Plata
  CoSci290

  Cat class
*/

public class GoodCat extends Cat{

  private int happiness;
  private int affection;

  public GoodCat(){

    //assigns the value of the indicated string to the name field
    super.setName("Good Kitty");

    //assigns the value of the indicatied string to the color field
    super.setColor("Brown");

    //assigns a value to the size field
    super.setSize(3);

    //assigs a value to the health field
    super.setHealth(100);

    //assigns a value to the happiness field
    this.happiness = 10;

    //assigns a value to the affection field
    this.affection = 10;
  }

  //method for returning the value of the happiness field
  public int getHappiness(){

    //returns the value of the happiness field
    return this.happiness;
  }

  //method for setting the value of the happiness field
  public void setHappiness(int newHappiness){

    //assigns the value of newHappiness to the happiness field
    this.happiness = newHappiness;
  }

  //method for returning the value of the affection field
  public int getAffection(){

    //returns the value of the affection field
    return this.affection;
  }

  //method for setting the value of the affection field
  public void setAffection(int newAffection){

    //assigns the value of newAffection to the affection field
    this.affection = newAffection;
  }

  //method to print out a String representation of this object.
  //prints out class members/fields with appropriate labels.
  public String toString(){

    //returns object as String
    return "Good Cat -\n"
            + "  Name: " + super.getName() + "\n"
            + " Color: " + super.getColor() + "\n"
            + "  Size: " + super.getSize() + "\n"
            + "Health: " + super.getHealth() + "\n"
            + "Happiness: " + this.happiness + "\n"
            + "Affection: " + this.affection + "\n\n";
  }
}
