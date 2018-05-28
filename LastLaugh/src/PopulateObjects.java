//declare imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PopulateObjects{
  
 ////////////////Menus//////////////////////////////////////////////////
  public void readMenus(CoreObjects coreObject){
    readMenuNames(coreObject);
    readMenuOptions(coreObject);
  }
//This method opens a file and prints out each line
  public void readMenuNames(CoreObjects coreObject){

    //declare and initialize variables
    int index = 0;
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/Menus/Names.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/Menus/MenuOptions/Menu" 
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
  }
  
  public void readRoomName(CoreObjects coreObject){
  
    //declare and initialize variables
    String currentLine = "";
    int row = 0;
    int col = 0;

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Rooms/Names.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Rooms/Descriptions/Room" 
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
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Doors/Names.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Rooms/Descriptions/Room" 
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
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Doors/Names.txt"))){

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
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Names.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Descriptions/Terminal" 
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
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Layers.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Greetings/Terminal" 
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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Felicitations/Terminal" 
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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Admonishments.txt"))){
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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Answers/Terminal" 
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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Terminals/Puzzles/Terminal" 
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
    try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Keys/Names.txt"))){

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
        try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/NewGame/Keys/Descriptions/Key" 
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

