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
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Navigator/NumberOfMenus.txt"))){

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
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/PositionTracker/Dimensions.txt"))){

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
	
	
	
///////////////////////////////////////////////////////////////////////////////
	
	//method to populate second layer objects
	public void populateSecondLayerObjects(CoreObjects gameStructure) {
		
		//invoke populateMenus method
		this.populateMenus(gameStructure.getNavigator());
		
		//invoke populateRooms method
		this.populateRooms(gameStructure.getPositionTracker());
	}//end populateSecondLayerObjects
	
		
	
								/*Menus*/
	
	//method to populate Menu class members
	private void populateMenus(Navigator navigator){
    
		//invoke readMenuNames method
		this.readMenuNames(navigator);
		
		//invoke readMenuOptions method
		this.readMenuOptions(navigator);
	}//end populateMenus
	
		
	//This method opens a file and prints out each line
	private void readMenuNames(Navigator navigator){
	
		//declare and initialize variables
		int index = 0;
		String currentLine = "";
		
		//trying to open a file to read from
		try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Menus/Names.txt"))){
		
			//read each line in the file until EOF
			while((currentLine = br.readLine()) != null){
			
			//prints the value of currentLine to the screen
			navigator.getMenu(index++).setName(currentLine);
			        
			}//end while
		
		//if there is no file to open, the exception will be caught
		}catch(IOException e){
			e.printStackTrace();
		}//end catch
	}//end readMenuNames
  
	
	//This method opens a file and prints out each line
	private void readMenuOptions(Navigator navigator){
	
		//declare and initialize variables
		String currentLine = "";
		
		//initiate for loop
		for(int index = 0; index < 9; index++) {
			
			//trying to open a file to read from
			try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles//NewGame/Menus/MenuOptions/Menu" 
				    															+ index + ".txt"))){
			        
				
				//read each line in the file until EOF
				while((currentLine = br.readLine()) != null){
						
				//prints the value of currentLine to the screen
				navigator.getMenu(index).addOption(currentLine);
						        
				}//end while
			        	
			//if there is no file to open, the exception will be caught
			}catch(IOException e){
				e.printStackTrace();
			}//end catch  
		}//end for
	}//end readMenuOptions
	
	
  
								/*Rooms*/
	
	//method to populate Room class members	
	private void populateRooms(PositionTracker tracker){
		
		//invoke readRoomName method
		this.readRoomName(tracker);
		
		//invoke readRoomDescription method
		this.readRoomDescription(tracker);
		
		//invoke readRoomNumberOfPuzzle method
		this.readRoomNumberOfPuzzle(tracker);
	}//end readRooms
 

	//method to read Room names from a file
	private void readRoomName(PositionTracker tracker){
	  
		//declare and initialize variables
		String currentLine = "";
		int row = 0;
		int col = 0;
		
		//trying to open a file to read from
		try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Rooms/Names.txt"))){
		
		//read each line in the file until EOF
		while((currentLine = br.readLine()) != null){
			
			//invokes setName method
			tracker.getRoom(row,col).setName(currentLine);
			
			//room index
			if(col < 2){
				col++;
			}
			else{
				col = 0;
				row++;
			}//end if-else
			        
		}//end while
		
		//if there is no file to open, the exception will be caught
		}catch(IOException e){
			e.printStackTrace();
		}//end catch 
	}//end readRoomName
	
  
	//method to read Room descriptions from a file
	private void readRoomDescription(PositionTracker tracker){
		
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
				description += (currentLine + "\n");
				       	        
			}//end while
			        
			//gives door the description
			tracker.getRoom(row,col).setDescription(description);
			        
			//for room index
			if(col < 2){
				col++;
			}
			else{
				col = 0;
				row++;
			}//end if-else
			        	    
			//if there is no file to open, the exception will be caught
			}catch(IOException e){
				e.printStackTrace();
			}//end catch
			
			//clear description for next door
			description = "";
		}//end for
	}//end readRoomDescription
	
	
	//method to read Rooms number of puzzle pieces from file
	private void readRoomNumberOfPuzzle(PositionTracker tracker){
	
		//declare and initialize variables
		int row = 0;
		int col = 0;
		String currentLine = "";
		
		//trying to open a file to read from
		try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Rooms/NumberOfPieces.txt"))){
		
		//read each line in the file until EOF
		while((currentLine = br.readLine()) != null){
		
			tracker.getRoom(row,col).setNumberOfPuzzlePieces(Integer.parseInt(currentLine));
			
			//room index
			if(col < 2){
				col++;
			}
			else{
				col = 0;
				row++;
			}//end if-else    
		}//end while
		
		//if there is no file to open, the exception will be caught
		}catch(IOException e){
			e.printStackTrace();
		}//end catch
	}//end readRoomNumberPuzzle
	
	
	
///////////////////////////////////////////////////////////////////////////////
	
	//method to populate third layer objects
	public void populateThirdLayerObjects(CoreObjects gameStructure) {
		
		//invoke populateDoors method
		this.populateDoors(gameStructure.getPositionTracker());
		
		//invoke populateCaretakers method
		this.populateCaretaker(gameStructure);
		
		//invoke populatePuzzlePieces
		this.populatePuzzlePieces(gameStructure.getPositionTracker());
	}//end populateThirdLayerObjects

  
	
								/*Doors*/
  
  private void populateDoors(PositionTracker tracker){
    readDoorName(tracker);
    readDoorDescription(tracker);
    readDoorKeyName(tracker);
  }//end readDoors
  
  private void readDoorName(PositionTracker tracker){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Doors/Names.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       tracker.getRoom(row,col).getDoor().setName(currentLine);
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
 
  private void readDoorDescription(PositionTracker tracker){
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
	        description += (currentLine + "\n");
	       	        
	      }//end while
        
        //gives door the description
        tracker.getRoom(row,col).getDoor().setDescription(description);
        
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
  
  private void readDoorKeyName(PositionTracker tracker){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Doors/Keys.txt"))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       tracker.getRoom(row,col).getDoor().setKeyName(currentLine);
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
  
  
  
  								/*Caretaker*/
  
  
  private void populateCaretaker(CoreObjects coreObject){
    
      readCaretakerName(coreObject);
      readCaretakerDescription(coreObject);
      readCaretakerLayers(coreObject);
      readCaretakerGreetings(coreObject);
      readCaretakerFelicitation(coreObject);
      readCaretakerAdmonishment(coreObject);
      readCaretakerAnswers(coreObject);
      readCaretakerPuzzles(coreObject);
    }//end readCaretaker
  
    private void readCaretakerName(CoreObjects coreObject){
  
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
  
  private void readCaretakerDescription(CoreObjects coreObject){
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
	        description += (currentLine + "\n");
	       	        
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

  private void readCaretakerLayers(CoreObjects coreObject){

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

 private void readCaretakerGreetings(CoreObjects coreObject){
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
	        description += (currentLine + "\n");
	       	        
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
  
   private void readCaretakerFelicitation(CoreObjects coreObject){
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
	        description += (currentLine + "\n");
	       	        
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
  
     private void readCaretakerAdmonishment(CoreObjects coreObject){
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
	        description += (currentLine + "\n");
	       	        
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
  private void readCaretakerAnswers(CoreObjects coreObject){

    //declare and initialize variables
    //int index = 0;
    String currentLine = "";
    //String description = "";
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

          }//end while

        //if there is no file to open, the exception will be caught
        }catch(IOException e){
          e.printStackTrace();
        }//end catch  
		}//end for
  }//end readCaretakerQA
  
    //This method loads Puzzles
  private void readCaretakerPuzzles(CoreObjects coreObject){

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
  
  
  
  								/*PuzzlePieces*/
  
  //method to populate PuzzlePiece class members
  private void populatePuzzlePieces(PositionTracker tracker) {
	  
	  //invoke the readPuzzlePieceNames method
	  this.readPuzzlePieceNames(tracker);
	  
	  //invoke the readPuzzlePieceLayers method
	  this.readPuzzlePieceLayers(tracker);
	  
	  //invoke the readPuzzlePieceClues method
	  this.readPuzzlePieceClues(tracker);
	  
	  //invoke the readPuzzlePieceDescriptions method
	  this.readPuzzlePieceDescriptions(tracker);
	  
	  //invoke the readPuzzlePieceManipulations method
	  this.readPuzzlePieceManipulations(tracker);	  
  }//end populatePuzzlePieces
  
  
  
  //method to read PuzzlePiece names from file
  private void readPuzzlePieceNames(PositionTracker tracker) {
		
		//declare and initialize variables
		int count = 1;
		int k = 0;
	    String currentLine = "";
		
		for(int i = 0; i < tracker.getMaxRows(); i++){
			for(int j = 0; j < tracker.getMaxColumns(); j++){

				//trying to open a file to read from
				try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/PuzzlePieces/"
																			+ "PiecesRoom" + count + "/Names.txt"))){
					
					  //read each line in the file until EOF
					  while((currentLine = br.readLine()) != null){
	
						  //prints the value of currentLine to the screen
						  tracker.getRoom(i,j).getPuzzlePiece(k).setName(currentLine);
						  
						  if(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces())
							  k++;
						
					  }//end while
					  
					  //reset k
					  k = 0;
				  
				  //increment count
				  //if(count <= tracker.getNumberOfRooms())
					  count++;

				//if there is no file to open, the exception will be caught
				}catch(IOException e){
				  e.printStackTrace();
				}//end catch
			}
		}
	}//end readPuzzlePieceNames
  
  
  
  //method to read PuzzlePiece names from file
  private void readPuzzlePieceLayers(PositionTracker tracker) {
		
		//declare and initialize variables
		int count = 1;
		int k = 0;
	    String currentLine = "";
		
		for(int i = 0; i < tracker.getMaxRows(); i++){
			for(int j = 0; j < tracker.getMaxColumns(); j++){

				//trying to open a file to read from
				try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/PuzzlePieces/"
																			+ "PiecesRoom" + count + "/Layers.txt"))){
					
					  //read each line in the file until EOF
					  while((currentLine = br.readLine()) != null){
	
						  //prints the value of currentLine to the screen
						  tracker.getRoom(i,j).getPuzzlePiece(k).setLayers(Integer.parseInt(currentLine));
						  
						  if(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces())
							  k++;
						
					  }//end while
					  
					  //reset k
					  k = 0;
				  
					//increment count
					//if(count <= tracker.getNumberOfRooms())
						count++;

				//if there is no file to open, the exception will be caught
				}catch(IOException e){
				  e.printStackTrace();
				}//end catch
			}
		}
	}//end readPuzzlePieceLayers
  
  
  
  //method to read PuzzlePiece names from file
  private void readPuzzlePieceClues(PositionTracker tracker) {
		
		//declare and initialize variables
		int count = 1;
		int k = 0;
	    String currentLine = "";
		
		for(int i = 0; i < tracker.getMaxRows(); i++){ //initiate for loop (1)
			for(int j = 0; j < tracker.getMaxColumns(); j++){ //initiate for loop (2)

				//trying to open a file to read from
				try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/PuzzlePieces/"
																			+ "PiecesRoom" + count + "/Clues.txt"))){
					
					  //read each line in the file until EOF
					  while((currentLine = br.readLine()) != null){
	
						  //prints the value of currentLine to the screen
						  tracker.getRoom(i,j).getPuzzlePiece(k).setClue(currentLine);
						  
						  if(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces())
							  k++;
						
					  }//end while
					  
					//reset k
					  k = 0;
				  
					//increment count
					//if(count <= tracker.getNumberOfRooms())
						count++;

				//if there is no file to open, the exception will be caught
				}catch(IOException e){
				  e.printStackTrace();
				}//end catch
			}//end for loop (2)
		}//end for loop (1)
	}//end readPuzzlePieceLayers
  
  
  
  //method to read PuzzlePiece names from file
  private void readPuzzlePieceDescriptions(PositionTracker tracker){
	    
	  //declare and initialize variables 
	    String currentLine = "";
	    String description = "";
		int count = 1;
		int k = 0;
		
		for(int i = 0; i < tracker.getMaxRows(); i++){ //initiate for loop (1)
			for(int j = 0; j < tracker.getMaxColumns(); j++){ //initiate for loop (2)
			
				do{ //initiate do-while
				
					//trying to open a file to read from
					try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/PuzzlePieces/"
																				+ "PiecesRoom" + count + "/Descriptions/"
																				+ "Item" + (k + 1) + ".txt"))){
							
						//read each line in the file until EOF
						while((currentLine = br.readLine()) != null){
			
							description += (currentLine + "\n");
								
						}//end while
							  
						tracker.getRoom(i, j).getPuzzlePiece(k).setDescription(description);
							
						if(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces())
							k++;	
						  	
					//if there is no file to open, the exception will be caught
					}catch(IOException e){
						e.printStackTrace();
					}//end catch
					
				}while(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces());
				
				//increment count
					count++;
					k = 0;
			}//end for loop (2)
		}//end for loop (1)
	}//end readPuzzlePieceDescriptions
  
  
  
  //method to read PuzzlePiece names from file
  private void readPuzzlePieceManipulations(PositionTracker tracker){
	    
	  //declare and initialize variables 
	    String currentLine = "";
	    //String description = "";
		int count = 1;
		int k = 0;
		
		for(int i = 0; i < tracker.getMaxRows(); i++){ //initiate for loop (1)
			for(int j = 0; j < tracker.getMaxColumns(); j++){ //initiate for loop (2)
			
				do{ //initiate do-while
				
					//trying to open a file to read from
					try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/NewGame/Items/PuzzlePieces/"
																				+ "PiecesRoom" + count + "/Manipulations/"
																				+ "Item" + (k + 1) + ".txt"))){
							
						//read each line in the file until EOF
						while((currentLine = br.readLine()) != null){
							
							tracker.getRoom(i, j).getPuzzlePiece(k).addManipulation(currentLine);
								
						}//end while
							  
						
						if(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces())
							k++;	
						  	
					//if there is no file to open, the exception will be caught
					}catch(IOException e){
						e.printStackTrace();
					}//end catch
					
				}while(k < tracker.getRoom(i, j).getNumberOfPuzzlePieces());
				
				//increment count
					count++;
					k = 0;
			}//end for loop (2)
		}//end for loop (1)
	}//end readPuzzlePieceManipulations
  
  
  
  
  
///////////////////////////////////////////////////////////////////////////////
  
  //method to populate fourth layer objects
  public void populateFourthLayerObjects(CoreObjects gameStructure) {
	  
	  //invoke the populateNotes method
	  this.populateNotes(gameStructure);
	  
	  //invoke the populateKeys method
	  this.populateKeys(gameStructure);
  }//end loadFourthLayerObjects
  
  
  
  								/*Notes*/
  
  
  private void populateNotes(CoreObjects coreObject){
    readNoteContent(coreObject);
    readNoteName(coreObject);
    readNoteTitle(coreObject);
  }
  
  private int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
  }
  
  private void readNoteContent(CoreObjects coreObject){
    
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

         description += (currentLine + "\n");

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
  
  private void readNoteName(CoreObjects coreObject){
  
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
  
  private void readNoteTitle(CoreObjects coreObject){
    
    //declare and initialize variables
    String currentLine = "";
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
  
  
  
  								/*Keys*/
  
  
  private void populateKeys(CoreObjects coreObject){
    readKeyName(coreObject);
    readKeyDescription(coreObject);
    
  }//end readKey
  
  private void readKeyName(CoreObjects coreObject){
  
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
  
  private void readKeyDescription(CoreObjects coreObject){
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
	        description += (currentLine + "\n");
	       	        
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


