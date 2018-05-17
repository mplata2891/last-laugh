/*
  Mike Plata
  CoSci 290

  The CommandUtility class is a list of methods that help
  interpret and carry out the commands given by the player
  during game play.
*/
//package LastLaugh.src;

//import LastLaugh.src.Item.*;

//begin new class
public class CommandUtility{


  


  //method to move the player north 1 space
  public int moveNorth(PositionTracker tracker){

    //invokes the getExactRow method and returns the value of the calculation
    return tracker.getExactRow() - 1;
  }//end moveNorth


  //method to move the player north 1 space
  public int moveSouth(PositionTracker tracker){

    //invokes the getExactRow method and returns the value of the calculation
    return tracker.getExactRow() + 1;
  }//end moveSouth


  //method to move the player north 1 space
  public int moveEast(PositionTracker tracker){

    //invokes the getExactColumn method and returns the value of the calculation
    return tracker.getExactColumn() + 1;
  }//end moveEast


  //method to move the player north 1 space
  public int moveWest(PositionTracker tracker){

    //invokes the getExactColumn method and returns the value of the calculation
    return tracker.getExactColumn() - 1;
  }//end moveNorth

/*
  public void senseSurroundings(Room currentRoom){

  	identifyDoors(currentRoom.getContents());

  	identifyContents(currentRoom);
  }


  public void identifyDoors(ArrayList<Item> list){


  }
*/
}//end class
