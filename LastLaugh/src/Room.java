/*
  Mike Plata
  CoSci 290

  The Room class is a representation of a physical in-game
  room that the player is inside of. Each room has its own
  name and contains a variety of items.
*/

public class Room extends GamePiece{

  //the Room class has 3 member fields/properties
  private String name;
  private ArrayList<Item> contents;
  private ArrayList<Door> connections;

  //default constructor
  public Room(){

    //assigns the value of the indicated string to the name field
    this.name = "";

    //instantiates a new ArrayList of type Item, and stores it to the contents field
    this.contents = new ArrayList<>();
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


  //method to add elements to the contents member field
  public void addItem(Item item){

    //adds item to an element in the ArrayList
    this.contents.add(item);
  }//end addItem


  //method to return an Item in the list
  public Item getItem(int index, Item object){

    //returns Item located in specific indexe
    this.contents.get(index, object);
  }//end getItem


}//end class
