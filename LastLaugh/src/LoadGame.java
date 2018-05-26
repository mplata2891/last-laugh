import java.util.ArrayList;

public class LoadGame{

	public void loadObjects(CoreObjects gameStructure){
		
		this.loadSecondLayerObjects(gameStructure);
		
		this.loadThirdLayerObjects(list.get(2));
	}//end loadObjects

	
	
	private void loadSecondLayerObjects(CoreObjects gameStructure){
		
		this.loadMenus(gameStructure.getNavigator());
		
		this.loadRooms(list.get(2));
		
		this.loadCommands(list.get(3));
	}//end loadSecondLayerObjects
	
	
	private void loadMenus(Navigator navigator){
		
		for(int i = 0; i < 9; i++)
			navigator.addMenu(new Menu());
	}//end loadMenus
	
	
	private void loadRooms(PositionTracker tracker){
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				tracker.getMap()[i][j] = new Room();
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
		
		for(int i = 0; i < tracker.getMaxRows(); i++)
			for(int j = 0; i < tracker.getMaxColumns(); j++)
				this.loadPuzzlePieces(tracker.getRoom(i, j));
				
	}//end loadThirdLayerObjects
	
	
	
	private void loadPuzzlePieces(Room room) {
		
		for(int i = 0; i < room.getNumberOfPuzzlePieces(); i++)
			room.addPuzzlePiece(new PuzzlePiece());
	}//end loadPuzzlePieces
	
	
	
	private loadFourthLayerObjects(PositionTracker tracker) {
		
		for(int i = 0; i < (tracker.getMaxRows() * tracker.getMaxColumns()); i++)
			loadNotes()
			
	}
		
}//end class