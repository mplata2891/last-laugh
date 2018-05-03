/*
  Mike Plata
  CoSci 290

  The Space class is an abstract class to be inherited by the
  Room class and the NonRoom class.

  The Space class is a subclass of GampePiece
*/

//begining of new class
public class Space extends GamePiece{

  //the Space class has two member variable
  private int exactRow;
  private int exactColumn;

  //default constructor
  public Space(){

    //assigns the indicated integer to the exactRow field
    this.exactRow = 0;

    //assigns the indicated integer to the exactColumn field
    this.exactColumn = 0;
  }//end constructor

  //implicit constructor
  public Space(int row, int column){

    //assigns the value of row to the exactRow field
    this.exactRow = row;

    //assigns the value of column to the exactColumn field
    this.exactColumn = column;
  }//end constructor

  //method to return the value of the exactRow field
  public int getExactRow(){

    //returns the value of the exactRow field
    return this.exactRow;
  }

  //method to set the value of the exactRow field
  public void setExactRow(int row){

    //assigns the value of row to the exacctRow field
    this.exactRow = row;
  }

  //method to return the value of the exactColumn field
  public int getExactColumn(){

    //returns the value of the exactColumn field
    return this.exactColumn;
  }

  //method to set the value of the exactColumn field
  public void setExactColumn(int column){

    //assigns the value of column to the exactColumn field
    this.exactColumn = column;
  }

  //mehod to return this object represented as a string, with appropriate
  //labels for all class members
  public String toString(){

    //returns object as a String
    return "Position -\n"
            + "   Row: " + this.exactRow + "\n"
            + "Column: " + this.exactColumn + "\n\n";
  }
}//end class
