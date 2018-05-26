/*
	Mike Plata
	CoSci 290
*/

//declare imports
import java.util.ArrayList;

//begin new class
public class MasterList{
	
	private ArrayList<GamePiece> masterList;
	
	public MasterList() {
		
		this.masterList = new ArrayList<>();
	}
	
	
	
	
	public Selector getSelector() {
		
		return this.masterList.get(0);
	}
	
	
	
	
	
	
	
	
	public void addGamePiece(GamePiece newPiece) {
		
		this.masterList.add(newPiece);
	}
	
}//end class