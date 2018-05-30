/*
  This method tests load and populate.
  
  Mike, good news, feels like most of the stuff works!
  At the very bottom are just some questions/notes/commments.
  There's a for loop down there that show all the populations.
  Just uncomment out the parts you want to see. 
*/

public class TestDriverFrank{

  public static void main(String[] args){
    int row = 0;
    int col = 0;
    CoreObjects gameGuts = new CoreObjects();
    LoadGame load = new LoadGame();
    load.loadObjects(gameGuts);
    PopulateObjects populate = new PopulateObjects();
    
    //Below each read function has two categories:
      //done: has members that have been populated (no issues)
      //haven't done: I don't know how or don't know if it should
    populate.populateMenus(gameGuts);
      /*
      All done:
        private String name;
        private ArrayList<String> options;
      */
    populate.readRooms(gameGuts);
      /*
        done:
          private String name;
          private String description;
        
        haven't done:
          private int numberOfPuzzlePieces;
      */
    populate.readDoors(gameGuts);
      /*
        All done:
          private String name;
          private String description;
          private String keyName; 
      */
    
    populate.readNotes(gameGuts);
      /*
        All done:
          private String name;
          private String title;
          private String contents;              
      */
    populate.readCaretaker(gameGuts);
      /*
        All done:
          private String name;
          private String description;
          private int layers;        	
          private String greeting;       
          private String felicitation;
          private String admonishment;
          private ArrayList<String> puzzles;
	       private ArrayList<String> answers;	
      */
    populate.readKey(gameGuts);
      /*
        All done:
          private String name;
          private String description;
                  
      */
    
    
    
    //prints what was populated
    //Just uncommment what you want to see (it's a lot otherwise)
    for(int i=0; i<9; i++){
      //Menu and Options
      //gameGuts.getNavigator().getMenu(i).displayMenu(); //works, shows menu names and option
      
      //Room
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).toString()); 
      
      //Door
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getDoor().toString());
      
      //Caretaker
      //System.out.print(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().toString());
      //System.out.println("Layers: " + gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getLayers());
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getGreeting());
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getFelicitation());
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getAdmonishment());
       //puzzles and answer
     /*
      * I've removed this method because I'm going through all of the classes, making sure that they 
      * are complete and have the appropriate class members, and no unnecessary members.
      * If you see the word "Checked" on top of a class it means I've checked it already.
      * //gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().displayQA(); 
      */
      
      //Key
      //System.out.print(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getKey().toString());
      
      //Note
      //System.out.print(gameGuts.getPositionTracker().getRoom(row,col).getDoor().getNote().toString());
      
      //helps for loop work with room index
      if(col < 2) col++;
        else{ col = 0; row++; }
    }
    
    /*
      Questions/Comments:
      
        
    */
    
  }//end main
  
}//end class
