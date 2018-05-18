/*
	Mike Plata
	CoSci 290
	
	The Command class is the parent class for all other 'commands'.
	'Commands' are the in-game options available to the user and 
	the Player class.
*/

//begin new class
public class Command extends GamePiece{
	
	//the Command class has 1 class member/field/property
	private int commandId;
	
	
	
	//defualt constructor
	public Command(){
		
		//assigns the inidicated value to the commandId field
		this.commandId  = 0;
	}//end constructor
	
	
	
	//method to get the value of the commandId field
	public int getCommandId(){
		
		//returns the value of the commandId field
		return this.commandId;
	}//end getCommandId
	
	
	
	//methhod to set the value of the commandId field
	public void setCommandId field(int newId){
		
		//assigns the value of newId to the commandId field
		this.commandId = newId;
	}//end setCommandId
	
}//end class