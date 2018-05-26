/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class CoreObjects{
	
	//the CoreObjects class has 4 class members
	private Selector selector;
	private Navigator navigator;
	private PositionTracker tracker;
	private Player player;
	
	
	//default constructor
	public CoreObjects() {
		
		//instantiates an object of type Selector and stores it in the selector member
		this.selector = new Selector();
		
		//instantiates an object of type Navigator and stores it in the navigator member
		this.navigator = new Navigator();
				
		//instantiates an object of type Position tracker and stores it in the tracker member
		this.tracker = new PositionTracker();
		
		//instantiates an object of type Player and stores it in the player member
		this.player = new Player();
	}//end constructor
	
	
	
	//method to get an object stored in the selector member
	public Selector getSelector() {
		
		//returns the object stored in the selector member
		return this.selector;
	}//end getSelector
	
	
	
	//method to set an object into the selector member
	public void setSelector(Selector newSelector) {
		
		//stores newSelector into the selector member
		this.selector = newSelector;
	}//end setSelector
	
	
	
	//method to get an object stored in the navigator member
	public Navigator getNavigator() {
			
		//returns the object stored in the navigator member
		return this.navigator;
	}//end getNavigator
		
		
		
	//method to set an object into the navigator member
	public void setNavigator(Navigator newNavigator) {
			
		//stores newNavigator into the navigator member
		this.navigator = newNavigator;
	}//end set

		
		
	//method to get an object stored in the tracker member
	public PositionTracker getPositionTracker() {
			
		//returns the object stored in the tracker member
		return this.tracker;
	}//end getPositionTracker
		
		
		
	//method to set an object into the tracker member
	public void setPositionTracker(PositionTracker newTracker) {
			
		//stores newTracker into the tracker member
		this.tracker = newTracker;
	}//end setPositionTracker
	
	
	
	//method to get an object stored in the player member
		public Player getPlayer() {
			
			//returns the object stored in the player member
			return this.player;
		}//end getPlayer
		
		
		
		//method to set an object into the player member
		public void setPlayer(Player newPlayer) {
			
			//stores newPlayer into the player member
			this.player = newPlayer;
		}//end setPlayer
	
}//end class