/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class LoadGameALSO{
	
	//the LoadGame class has 2 class members/fields/properties
	private CreateObjects createObjects;
	private PopulateObjects populateObjects;
	
	
	
	//default constructor
	public LoadGameALSO() {
		
		//instantiates an object of type LoadObjects and assigns it to the loadObjects field
		this.createObjects = new CreateObjects();
		
		//instantiates an object of type Populate Objects and assigns it to the populateObjects field
		this.populateObjects = new PopulateObjects();
	}//end constructor
	
	
	
	//method to load and populate all game objects
	public void createAndPopulateAllObjects(CoreObjects gameStructure) {
		
		this.populateObjects.populateFirstLayerObjects(gameStructure);
		
		this.createObjects.createSecondLayerObjects(gameStructure);
		
		this.populateObjects.populateSecondLayerObjects(gameStructure);
		
		this.createObjects.createThirdLayerObjects(gameStructure.getPositionTracker());
		
		//this.populateObjects.populateThirdLayerObjects(gameStructure);
		
		this.populateObjects.populateFourthLayerObjects(gameStructure);
	}//end loadAndPopulateAllObjects
	
	
}//end class