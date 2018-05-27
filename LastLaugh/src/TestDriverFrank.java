public class TestDriverFrank{

  public static void main(String[] args){
    CoreObjects gameGuts = new CoreObjects();
    //System.out.println(gameGuts.getNavigator().getNumberOfMenus());
    LoadGame load = new LoadGame();
    load.loadObjects(gameGuts);
    
  }//end main
  
}//end class
