/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class CreateObjects{

	//method to instantiate all Menu and Room objects
	public void createSecondLayerObjects(CoreObjects gameStructure){
			
		//invokes createMenus method
		this.createMenus(gameStructure.getNavigator());
			
		//invokes createRooms method
		this.createRooms(gameStructure.getPositionTracker());		
	}//end createSecondLayerObjects
		
		
	
	//method to instantiate all Menu objects
	private void createMenus(Navigator navigator){
			
		//initiates for loop to iteratively instantiate menu objects
		for(int i = 0; i < navigator.getNumberOfMenus(); i++)
			navigator.addMenu(new Menu());
	}//end createMenus
		
		
	
	//method to instantiate all Room, Door, Note, Caretaker, and Key objects
	private void createRooms(PositionTracker tracker){
		
		//initiates for loop to iteratively instantiate all objects listed above
		for(int i = 0; i < tracker.getMaxRows(); i++){
			for(int j = 0; j < tracker.getMaxColumns(); j++){
				tracker.getMap()[i][j] = new Room();
			}//end for
		}//end for				
	}//end createRooms
		
		
	
	//method to instantiate all PuzzlePiece objects in all Rooms
	public void createThirdLayerObjects(PositionTracker tracker) {
		
		//initiates for loop to iteratively access Rooms in map
		for(int i = 0; i < tracker.getMaxRows(); i++){
			for(int j = 0; j < tracker.getMaxColumns(); j++){
				this.createPuzzlePieces(tracker.getRoom(i, j));
	      }//end for
	    }//end for
	}//end createThirdLayerObjects
		
		
		
	//method to instantiate all PuzzlePiece objects (cont.)
	private void createPuzzlePieces(Room room) {
			
		//initiates for loop to iteratively instantiate PuzzlePiece objects
		for(int i = 0; i < room.getNumberOfPuzzlePieces(); i++)
			room.addPuzzlePiece(new PuzzlePiece());
	}//end createPuzzlePieces
	
}//end class