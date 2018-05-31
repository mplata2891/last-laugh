/*CHECKED*/

/*
  Mike Plata
  CoSci 290

  The Note class represents in-game text files that the user finds
  while exploring the game. The actual Note objects are left by a
  mysterious character called the Architect.

  The Architect seems to know who our main protagonist is, and isn't shy
  about admitting that he is part of the reason our main protagonist
  is in this particular predicament.

  The notes left by the Architect are collected by the player, and are
  stored by the player in a the player's notebook. The notes provide 
  clues to who our main protagonist really is, and ultimately build up
  to a final narrative or conclusion.

  Once a note is collected by a player, the player may open their
  notebook at any time to read the note.
*/

//begin new class
public class Note{

	//The Note class has 3 class members/field/properties
	private String name;
	private String title;
	private String contents;
  
	

	//default constructor
	public Note(){
	
		//assigns the indicated string to the name field
		this.name = "Default Note Name";
		
		//assigns the indicated string to the title field
		this.title = "Default Note Title";
		
		//assigns the indicated string to the contents field
		this.contents = "Default Note Contents";
	}//end constructor
	
	
	
	//method to get the value of the name field
	public String getName() {
		
		//returns the value of the name field
		return this.name;
	}//end getName
	
	
	
	//method to set the value of the name field
	public void setName(String newName) {
		
		//assigns the value of newName to the name field
		this.name = newName;
	}//end setName
	
	
	
	//method to get the value of the title field
	public String getTitle() {
		
		//returns the value of the title field
		return this.title;
	}//end getTitle
	
	
	
	//method to set the value of the title field
	public void setTitle(String newTitle) {
		
		//assigns the value of newTitle to the title field
		this.title = newTitle;
	}//end setTitle
	
	
	
	//method to get the value of the contents field
	public String getContents() {
		
		//returns the value of the contents field
		return this.contents;
	}//end getContents
	
	
	
	//method to set the value of the contents field
	public void setContents(String newContents) {
		
		//assigns the value of newContents to the contents field
		this.contents = newContents;
	}//end setContents
	
	
	
	//method to return the Note object represented as a string
	public String toString() {
		
		//returns the following string
		return this.name + "\n\n"
				+ this.title + "\n\n"
				+ this.contents + "\n";
	}//end toString
  
}//end of class
