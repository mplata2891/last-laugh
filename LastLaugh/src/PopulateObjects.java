//declare imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PopulateObjects{
	
	//method to populate first layer objects
	public void populateFirstLayerObjects(CoreObjects gameStructure) {
		
		//invoke populateNavigator method
		this.populateNavigator(gameStructure.getNavigator());
		
		//invoke populatePositionTracker method
		this.populatePositionTracker(gameStructure.getPositionTracker());
	}//end populateFirstLayerObjects
	
	
	
	//method to populate the Navigator object
	private void populateNavigator(Navigator navigator) {
		
		//invoke readNumberOfMenus method
		this.readNumberOfMenus(navigator);
		
	}//end populateNavigator
	
	
	
	//method to readNumberOfMenus from a file
	private void readNumberOfMenus(Navigator navigator) {
		
		//declare and initialize variables
	    String currentLine = "";

	    //trying to open a file to read from
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/Navigator/numberOfMenus.txt"))){

	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){

		      //prints the value of currentLine to the screen
		      navigator.setNumberOfMenus(Integer.parseInt(currentLine));
	        
	      }//end while

	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch	
	}//end readNumberOfMenus
	
	
	
	//method to populate the PositionTracker method
	private void populatePositionTracker(PositionTracker tracker) {
		
		//invoke readDimensions method
		this.readDimensions(tracker);
		
		//invoke updateNumberOfRoomsMethod
		tracker.updateNumberOfRooms();
	}//end populatePositionTracker
	
	
	
	//method to read maxRow and maxColumn from a file
	private void readDimensions(PositionTracker tracker) {
		
		//declare and initialize variables
		int dimension = 0;
	    String currentLine = "";

	    //trying to open a file to read from
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/Navigator/numberOfMenus.txt"))){

	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){

		      //increment dimension
	    	  dimension++;
	    	  
	    	  //initiate switch statement
	    	  switch(dimension) {
	    	  
		    	  //enter case 1
		    	  case 1:	tracker.setMaxRows(Integer.parseInt(currentLine));
		    	  			break;//breaks out of switch
		    	  			
		    	  //enter case 2
		    	  case 2:	tracker.setMaxColumns(Integer.parseInt(currentLine));
		  					break;//breaks out of switch
	    	  }//end switch
	        
	      }//end while

	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
	}//end readDimensions
	
	
	
 ////////////////Menus//////////////////////////////////////////////////
  public void populateMenus(CoreObjects coreObject){
    readMenuNames(coreObject);
    readMenuOptions(coreObject);
  }
//This method opens a file and prints out each line
  public void readMenuNames(CoreObjects coreObject){

    //declare and initialize variables
    int index = 0;
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Menus/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getNavigator().getMenu(index++).setName(currentLine);
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readMenuNames
  
//This method opens a file and prints out each line
  public void readMenuOptions(CoreObjects coreObject){

    //declare and initialize variables
    //int index = 0;
    String currentLine = "";

    for(int index = 0; index < 9; index++) {
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles//NewGame/Menus/MenuOptions/Menu" 
	    															+ index + ".txt"))){
        
	
		    //read each line in the file until EOF
		    while((currentLine = br.readLine()) != null){
		
			    //prints the value of currentLine to the screen
			    coreObject.getNavigator().getMenu(index).addOption(currentLine);
		        
		    }//end while
        
	
	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
    
    }
  }//end readMenuOptions
  
  //////////Rooms///////////////////////////////////////////////////////
  public void readRooms(CoreObjects coreObject){
    readRoomName(coreObject);
    readRoomDescription(coreObject);
    readRoomNumberPuzzle(coreObject);
  }
  
  public void readRoomName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Rooms/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).setName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
    
  }//end readRoomName
  
  public void readRoomDescription(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Rooms/Descriptions/Room" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds door description
	        description += currentLine;
	       	        
	      }//end while
        
        //gives door the description
        coreObject.getPositionTracker().getRoom(row,col).setDescription(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next door
      description = "";
    }//end for
  }//end readRoomDescription
  
   public void readRoomNumberPuzzle(CoreObjects coreObject){

    //declare and initialize variables
    int row = 0;
    int col = 0;
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Rooms/NumberOfPieces.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

       coreObject.getPositionTracker().getRoom(row,col).setNumberOfPuzzlePieces(Integer.parseInt(currentLine));
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }    
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readRoomNumberPuzzle

  
  //////////Doors/////////////////////////////////////////////////////
  
  public void readDoors(CoreObjects coreObject){
    readDoorName(coreObject);
    readDoorDescription(coreObject);
    readDoorKeyName(coreObject);
  }//end readDoors
  
  public void readDoorName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Doors/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).getDoor().setName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
    
  }//end readDoorName
 
  public void readDoorDescription(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Doors/Descriptions/Door" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds door description
	        description += currentLine;
	       	        
	      }//end while
        
        //gives door the description
        coreObject.getPositionTracker().getRoom(row,col).getDoor().setDescription(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next door
      description = "";
    }//end for
  }//end readDoorDescription
  
  public void readDoorKeyName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Doors/Keys.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).getDoor().setKeyName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readDoorKeyName
  
  ////////Notes//////////////////////////////////////////////////////////////////
  public void readNotes(CoreObjects coreObject){
    readNoteContent(coreObject);
    readNoteName(coreObject);
    readNoteTitle(coreObject);
  }
  
  public int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
  }
  
  public void readNoteContent(CoreObjects coreObject){
    
    //declare and initialize variables
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;
    
    for(int index=1; index<10; index++){
        //trying to open a file to read from
      try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Notes/Story"
                                                 + chance(1,4) + "/Contents/Ch" + index + ".txt"))){

        //read each line in the file until EOF
        while((currentLine = br.readLine()) != null){

         description += currentLine;

        }//end while
         //prints the value of currentLine to the screen
         coreObject.getPositionTracker().getRoom(row,col).getDoor().getNote().setContents(description);
         //room index
         if(col < 2){
           col++;
         }
         else{
           col = 0;
           row++;
         }

      //if there is no file to open, the exception will be caught
      }catch(IOException e){
        e.printStackTrace();
      }//end catch
      description = "";
    }//end for
  }//end readNoteContent
  
  public void readNoteName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Notes/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).getDoor().getNote().setName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
    
  }//end readNoteName
  
  public void readNoteTitle(CoreObjects coreObject){
    
    //declare and initialize variables
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;
    
    
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Notes/Story"
                                                 + chance(1,4) + "/Titles.txt"))){

        //read each line in the file until EOF
        while((currentLine = br.readLine()) != null){
     
           coreObject.getPositionTracker().getRoom(row,col).getDoor().getNote().setTitle(currentLine);
           //room index
           if(col < 2){
             col++;
           }
           else{
             col = 0;
             row++;
           }

        }//end while
       
      //if there is no file to open, the exception will be caught
      }catch(IOException e){
        e.printStackTrace();
      }//end catch
  }//end readNoteTitle
  
  ////////Caretaker//////////////////////////////////////////////////////////////
  public void readCaretaker(CoreObjects coreObject){
    
      readCaretakerName(coreObject);
      readCaretakerDescription(coreObject);
      readCaretakerLayers(coreObject);
      readCaretakerGreetings(coreObject);
      readCaretakerFelicitation(coreObject);
      readCaretakerAdmonishment(coreObject);
      readCaretakerAnswers(coreObject);
      readCaretakerPuzzles(coreObject);
    }//end readCaretaker
  
    public void readCaretakerName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
    
  }//end readCaretakerName
  
  public void readCaretakerDescription(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Descriptions/Terminal" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds door description
	        description += currentLine;
	       	        
	      }//end while
        
        //gives door the description
        coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setDescription(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next 
      description = "";
    }//end for
  }//end readCaretakerDescription

  public void readCaretakerLayers(CoreObjects coreObject){

    //declare and initialize variables
    int row = 0;
    int col = 0;
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Layers.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

       coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setLayers(Integer.parseInt(currentLine));
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }    
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readCaretakerLayers

  
 public void readCaretakerGreetings(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Greetings/Terminal" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds description
	        description += currentLine;
	       	        
	      }//end while
        
        //givesthe description
        coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setGreeting(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next
      description = "";
    }//end for
  }//end readCaretakerGreetings
  
   public void readCaretakerFelicitation(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Felicitations/Terminal" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds description
	        description += currentLine;
	       	        
	      }//end while
        
        //givesthe description
        coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setFelicitation(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next
      description = "";
    }//end for
  }//end readCaretakerFelicitation
  
     public void readCaretakerAdmonishment(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Admonishments.txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds description
	        description += currentLine;
	       	        
	      }//end while
        
        //givesthe description
        coreObject.getPositionTracker().getRoom(row,col).getCaretaker().setAdmonishment(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next
      description = "";
    }//end for
  }//end readCaretakerAdmonishment
  
  //This method loads answers
  public void readCaretakerAnswers(CoreObjects coreObject){

    //declare and initialize variables
    //int index = 0;
    String currentLine = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Answers/Terminal" 
	    															+ index + ".txt"))){
	
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
	
	        //prints the value of currentLine to the screen
	       coreObject.getPositionTracker().getRoom(row,col).getCaretaker().addAnswer(currentLine);
	      
        }
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
          
	      }//end while
	
	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
    
    }
  }//end readCaretakerQA
  
    //This method loads Puzzles
  public void readCaretakerPuzzles(CoreObjects coreObject){

    //declare and initialize variables
    //int index = 0;
    String currentLine = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Caretakers/Puzzles/Terminal" 
	    															+ index + ".txt"))){
	
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
	
	        //prints the value of currentLine to the screen
	       coreObject.getPositionTracker().getRoom(row,col).getCaretaker().addPuzzle(currentLine);
	      
        }
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
          
	      }//end while
	
	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
    
    }
  }//end readCaretakerPuzzles  
  
  
///////Key//////////////////////////////////////////////////////////////////
  public void readKey(CoreObjects coreObject){
    readKeyName(coreObject);
    readKeyDescription(coreObject);
    
  }//end readKey
  
  public void readKeyName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Keys/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getPositionTracker().getRoom(row,col).getCaretaker().getKey().setName(currentLine);
       //room index
       if(col < 2){
         col++;
       }
       else{
         col = 0;
         row++;
       }
        
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
    
  }//end readKeyName
  
  public void readKeyDescription(CoreObjects coreObject){
    //declare and initialize variables
    
    String currentLine = "";
    String description = "";
    int row = 0;
    int col = 0;

    for(int index = 1; index < 10; index++) {
      
	    //trying to open a file to read from
        try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/Keys/Descriptions/Key" 
	    															+ index + ".txt"))){
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
          
          //holds door description
	        description += currentLine;
	       	        
	      }//end while
        
        //gives door the description
        coreObject.getPositionTracker().getRoom(row,col).getCaretaker().getKey().setDescription(description);
        
        //for room index
        if(col < 2){
          col++;
        }
        else{
          col = 0;
          row++;
        }
        	    
          //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
      //clear description for next 
      description = "";
    }//end for
  }//end readCaretakerKeyDescription
    
  
}//end class


