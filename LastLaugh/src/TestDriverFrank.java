public class TestDriverFrank{

  public static void main(String[] args){
    int row = 0;
    int col = 0;
    CoreObjects gameGuts = new CoreObjects();
    //System.out.println(gameGuts.getNavigator().getNumberOfMenus());
    LoadGame load = new LoadGame();
    load.loadObjects(gameGuts);
    PopulateObjects populate = new PopulateObjects();
    populate.readMenus(gameGuts);
    populate.readRooms(gameGuts);
    populate.readDoors(gameGuts);
    populate.readCaretaker(gameGuts);
    
    //prints what was populated    
    for(int i=0; i<9; i++){
      //Menu and Options
      //gameGuts.getNavigator().getMenu(i).displayMenu(); //works, shows menu names and option
      
      //Room
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).toString()); 
      
      //Door
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getDoor().toString());
      
      //Caretaker
      System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().toString());
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getGreeting());
      //System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getFelicitation());
      System.out.println(gameGuts.getPositionTracker().getRoom(row,col).getCaretaker().getAdmonishment());
        if(col < 2) col++;
        else{ col = 0; row++; }
    }
    
    
  }//end main
  
}//end class
