import java.util.ArrayList;

public class LoadGame{

	public void loadObjects(ArrayList<GamePiece> list){
		
		this.loadFirstLayerObjects(list);
		
		this.loadSecondLayerObjects(list);
		
		this.loadThirdLayerObjects(list.get(2));
	}//end loadObjects


	private void loadFirstLayerObjects(ArrayList<GamePiece> list){
		
		list.add(new Player());
		
		list.add(new Navigator());

		list.add(new PositionTracker());
	}//end loadFirstLayerObjects
	
	
	private void loadSecondLayerObjects(ArrayList<GamePiece> list){
		
		this.loadCommands(list.get(0));
		
		this.loadMenus(list.get(1));
		
		this.loadRooms(list.get(2));
	}//end loadSecondLayerObjects
	
	
	private void loadCommands(Player player){
		
		player.addCommand(new Move());
		
		player.addCommand(new Sense());
		
		player.addCommand(new Examine());
		
		player.addCommand(new Interact());
		
		player.addCommand(new Action());
		
		player.addCommand(new Inventory());
		
		player.addCommand(new Notebook());
	}//end loadCommands
	
	
	private void loadMenus(Navigator navigator){
		
		for(int i = 0; i < 9; i++)
			navigator.addMenu(new Menu());
	}//end loadMenus
	
	
	private void loadRooms(PositionTracker tracker){
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				tracker.getMap()[i][j] = new Room();
	}//end loadRooms
	
	
	
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