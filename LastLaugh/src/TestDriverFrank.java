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
    populate.readMenus(gameGuts);
      /*
      done:
        private String name;
        private ArrayList<String> options;
      */
    populate.readRooms(gameGuts);
      /*
        done:
          private String name;
          private Door door; (below in readDoors)
          private Caretaker caretaker; (below in readCaretaker)
          private String description;
        
        haven't done:
          private int roomId;
          private ArrayList<PuzzlePiece> pieces;
          private int numberOfPuzzlePieces;
          private PuzzlePiece selectedPuzzlePiece;
      */
    populate.readDoors(gameGuts);
      /*
        done:
          private String name;
          private String description;
          private String keyName; 
        
        haven't done:
          private Note note;
      */
    populate.readCaretaker(gameGuts);
      /*
        done:
          private String name;
          private String description;
          private int layers;        	
          private String greeting;       
          private String felicitation;
          private String admonishment;
          private Key key; (below in readKey)
        
        haven't done:
          private ArrayList<String> puzzles;
	        private ArrayList<String> answers;
          private int currentLayer;	

      */
    populate.readKey(gameGuts);
      /*
        done:
          private String name;
        
        haven't done:
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
      
      //Key
      //System.out.print(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getKey().toString());
      
      //helps for loop work with room index
      if(col < 2) col++;
        else{ col = 0; row++; }
    }
    
    /*
      Questions/Comments:
      In Keys/Descriptions
        - 12 keys? Not just 9? (there's 12 description txt files)
        - Do we have key descriptions? Do we need them? Should we scrap that?
        
      Ids
        - I didn't do any of them cause we're not using them?
        
      Caretaker
        - For answers/puzzles, why ArrayList<String>  instead of String?
          Not sure how to work with that, so haven't touched it yet. Should I just
          make the memebers String?
          
      Rooms
        - ArrayList<PuzzlePiece> pieces. Does this need populating? I'm sure how to 
          handle this either.  
          
      Notes
        - populate their contents with text files in Story/LynnNotes? 
          but how to choose which story?
        - title and name for notes where? Sure I make up some files? or they're somewhere?
        
      Empty text files
        - In some of them I just commented genericall just to see it
        
      */
    
  }//end main
  
}//end class
