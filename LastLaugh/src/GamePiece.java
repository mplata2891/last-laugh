/*
	Mike Plata
	CoSci 290

	class GamePiece is the supertype of all other
	classes in our text adventure, Last Laugh
*/

public class GamePiece{

	//the GamePiece class has one class member/field
	private int id;

	//the GamePice class has one default constructor
	public GamePiece() {

		id = 0;
	}

	//method for setting the value of the id field
	public void setId(int newId) {

		//assigns the value of newId to the id field
		this.id = newId;
	}

	//method for returning the value of the id field
	public int getId() {

		//returns the value of the id field
		return id;
	}

	//method to return class members as a string
	public String toString() {

		//returns class members as a string
		return "Game Piece ID: " + this.id + "\n";
	}
}
