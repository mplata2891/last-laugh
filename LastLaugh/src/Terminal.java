/*
  Mike Plata
  CoSci 290

  

  The Puzzle class is a sub-class of the Item class.
*/

//declare imports
import java.util.ArrayList;

//beginning of a new Class
public class Terminal extends Item{

	//the Terminal class has 3 class members/fields/properties
	private ArrayList<String> answers;
	private int layers;
	private int currentLayer;
	private Key key;
	
	
	
	//default constructor
	public Terminal(){
	
		//invokes parent class default constructor
		super();
		
		//instantiates a new ArrayList of type String and stores it to answers
		this.answers = new ArrayList<>();
		
		//assigns the indicated value to the layers field
		this.layers = 0;
		
		//assigns the indicated value to eh currentLayer field
		this.currentLayer = 0;
		
		//instantiates a new object of type Key and assigns it to the key field
		this.key = new Key();
	}//end constructor
	
	
	
	//method to get a String stored in the answers field
	public String getAnswer(int index) {
		
		//returns a String stored in the specific index of the answers field
		return this.answers.get(index);
	}//end getAnswer
	
	
	
	//method to set a String into the ArrayList store in the answers field
	public void addAnswer(String newAnswer) {
		
		//adds a String to the answers field
		this.answers.add(newAnswer);
	}//end addAnswer
	
	
	
	//method to get the value of the layers field
	public int getLayers() {
		
		//returns the value of the layers field
		return this.layers;
	}//end getLayers
	
	
	
	//method to set the value of the layer field
	public void setLayers(int newValue) {
		
		//assigns the value of newValue to the layer field
		this.layers = newValue;
	}//end setLayers
	
	
	
	//method to get the value of the currentLayer field
	public int getCurrentLayer() {
		
		//returns the value of the currentLayer field
		return this.currentLayer;
	}//end getCurrentLayer
	
	
	
	//method to set the value of the currentLayer field
	public void setCurrentLayer(int newValue) {
		
		//assigns the value of newValue to the currentLayer field
		this.currentLayer = newValue;
	}//end setCurrentLayer
	
	
	
	//method to get a Key object stored in the key field
	public Key getKey() {
		
		//returns the Key object in the key field
		return this.key;
	}//end getKey
	
	
	
	//method to set a Key object into the key field
	public void setKey(Key newKey) {
		
		//stores the newKey Key objec into the key field
		this.key = newKey;
	}//end setKey
	
	  
	
	//method to return class represented as a String
	public String toString(){
	
		//returns the value returned by the parent class toString method
		return super.toString();
	}//end toString method
  
}//end of class
