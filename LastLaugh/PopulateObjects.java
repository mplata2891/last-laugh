public class PopulateObjects{
//This method opens a file and prints out each line
  public void readNames(CoreObject coreObject, String filename){

    //declare and initialize variables
    int index = 0;
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
       coreObject.getNavigtor().getMenu(index++).setName(currentLine);
        
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readFile
  
//This method opens a file and prints out each line
  public void readOptions(CoreObject coreObject){

    //declare and initialize variables
    int index = 0;
    String currentLine = "";

    for(int index = 0; index < 9; index++) {
	    //trying to open a file to read from
	    try(BufferedReader br = new BufferedReader(new FileReader("src/TextFiles/Menus/MenuOptions/Menu" 
	    															+ index + ".txt"))){
	
	      //read each line in the file until EOF
	      while((currentLine = br.readLine()) != null){
	
	        //prints the value of currentLine to the screen
	       coreObject.getNavigtor().getMenu(index).addOptions(currentLine);
	        
	      }//end while
	
	    //if there is no file to open, the exception will be caught
	    }catch(IOException e){
	      e.printStackTrace();
	    }//end catch
    
    index++;
    }
  }//end readFile
}//end class

