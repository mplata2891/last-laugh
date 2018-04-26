/*
  Mike Plata
  CoSci290

  Cat class
*/

public class DevilCat extends Cat{

  private int anger;
  private int dislike;

  public DevilCat(){

    //assigns the value of the indicated string to the name field
    super.setName("Bad Kitty");

    //assigns the value of the indicatied string to the color field
    super.setColor("Black");

    //assigns a value to the size field
    super.setSize(3);

    //assigs a value to the health field
    super.setHealth(100);

    //assigns a value to the anger field
    this.anger = 5;

    //assigns a value to the dislike field
    this.dislike = 5;
  }

  //method for returning the value of the anger field
  public int getAnger(){

    //returns the value of the anger field
    return this.anger;
  }

  //method for setting the value of the anger field
  public void setAnger(int newAnger){

    //assigns the value of newAnger to the anger field
    this.anger = newAnger;
  }

  //method for returning the value of the dislike field
  public int getDislike(){

    //returns the value of the dislike field
    return this.dislike;
  }

  //method for setting the value of the dislike field
  public void setDislike(int newDislike){

    //assigns the value of newDislike to the dislike field
    this.dislike = newDislike;
  }

  //method to print out a String representation of this object.
  //prints out class members/fields with appropriate labels.
  public String toString(){

    //returns object as String
    return "Devil Cat -\n"
            + "   Name: " + super.getName() + "\n"
            + "  Color: " + super.getColor() + "\n"
            + "   Size: " + super.getSize() + "\n"
            + " Health: " + super.getHealth() + "\n"
            + "  Anger: " + this.anger + "\n"
            + "Dislike: " + this.dislike + "\n\n";
  }
}
