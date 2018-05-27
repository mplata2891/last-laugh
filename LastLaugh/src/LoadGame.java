/*
 * Mike Plata
 * CoSci 290
 */

//declare imports
import java.util.ArrayList;

//begin new class
public class LoadGame{

	//method to load all objects that will be used to create
	public void loadObjects(CoreObjects gameStructure){
		
		//first layer objects are created upon CoreObjects instantiation
			/*
			 * Selector
			 * Navigator
			 * PositionTracker
			 * Player
			 */
		
		//invokes method to instantiate 
		this.loadSecondLayerObjects(gameStructure);
		
		this.loadThirdLayerObjects(gameStructure.getPositionTracker());
		
		//fourth layer objects are created upon instantiation of Door and Caretaker objects
			/*
			 * Note
			 * Key
			 */
		
	}//end loadObjects

	
	
	private void loadSecondLayerObjects(CoreObjects gameStructure){
		
		this.loadMenus(gameStructure.getNavigator());
		
		this.loadRooms(gameStructure.getPositionTracker());
		
		this.loadCommands(gameStructure.getPlayer());
	}//end loadSecondLayerObjects
	
	
	private void loadMenus(Navigator navigator){
		
		for(int i = 0; i < 9; i++)
			navigator.addMenu(new Menu());
	}//end loadMenus
	
	
	private void loadRooms(PositionTracker tracker){
		
		for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        tracker.getMap()[i][j] = new Room();
        //System.out.println("Row: " + i + "\tColumn: " + j);
      }
    }	
				
	}//end loadRooms
	
	
	
	private void loadCommands(Player player){
			
			player.addCommand(new Move());
			
			player.addCommand(new Sense());
			
			player.addCommand(new Examine());
			
			player.addCommand(new Interact());
			
			player.addCommand(new Action());
			
			player.addCommand(new Inventory());
			
			player.addCommand(new Notebook());
	}//end loadCommands
	
	
	
	private void loadThirdLayerObjects(PositionTracker tracker) {
		
		for(int i = 0; i < tracker.getMaxRows(); i++){
      for(int j = 0; j < tracker.getMaxColumns(); j++){
        this.loadPuzzlePieces(tracker.getRoom(i, j));
      }
    }
    
	}//end loadThirdLayerObjects
	
	
	
	private void loadPuzzlePieces(Room room) {
		
		for(int i = 0; i < room.getNumberOfPuzzlePieces(); i++)
			room.addPuzzlePiece(new PuzzlePiece());
	}//end loadPuzzlePieces

		
}//end class