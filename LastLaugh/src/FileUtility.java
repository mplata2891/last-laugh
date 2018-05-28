/*
  Mike Plata
  CoSci 290

  The FileIoUtility class is a utility class with methods
  that are used to read and write, to and from a File
*/

//declare imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//begin new class
public class FileUtility{

  //This method opens a file and prints out each line
  public void readFile(String filename){

    //declare and initialize variables
    String currentLine = "";

    //trying to open a file to read from
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){

      //read each line in the file until EOF
      while((currentLine = br.readLine()) != null){

        //prints the value of currentLine to the screen
        System.out.println(currentLine);
      }//end while

    //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }//end catch
  }//end readFile


  //method to write content into a file
  public void writeFile(String filename, String content) {

    //try to open a file to write to
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

      //write's the value of content to a text file
      bw.write(content);

      //prints done when file has been written to
      System.out.println("Done");

  	} catch(IOException e){

  		e.printStackTrace();
  	}//end try-catch
  }//end writeFile


  //method to display a splash page, read from a file
  public void splashPage(String scene){

    switch(scene){ //initiate switch statement

      //enters case title and invokes the readFile method
      case "title" :  this.readFile("src/TextFiles/SplashScreens/Title.txt");
                      break;//breaks out of switch

      //enters case cat and invokes the readFile method
      case "cat" :    this.readFile("src/TextFiles/SplashScreens/CatImage.txt");
                      break;//breaks out of switch

      //enters case gameover and invokes readFile method
      case "gameover" : this.readFile("src/TextFiles/SplashScreens/GameOver.txt");
                        break;//breaks out of switch
      case "beatGame" : this.readFile("src/TextFiles/SplashScreens/beatGame.txt");
                       break;//breaks out of switch
    }//end switch
  }//end splashPage


}//end class
