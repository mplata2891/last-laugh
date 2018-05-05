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
public class FileIoUtility{

  //This method opens a file and prints out each line
  public void readFile(String filename){

    String currentLine; //hold current line being read in File

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

  	} catch (IOException e) {

  		e.printStackTrace();
  	}//end try-catch
  }//end writeFile

  //ascii
  public void splashPage(String scene){
    switch(scene){
      case "title" :  this.readFile("TextFiles/SplashScreens/Title.txt");
                      break;

      case "cat" :
              System.out.print( "       ,     ,                   \n"+
                                "       |\\.\"./|                 \n"+
                                "      /       \\                 \n"+
                                "     /  _   _  \\   ______       \n"+
                                "     \\==  Y  ==/\"'`      `.    \n"+
                                "     /`-._^_.-'\\     ,-  . \\   \n"+
                                "    /     `     \\   /     \\ \\ \n"+
                                "    \\  \\.___./  /_ _\\     / / \n"+
                                "     `, \\   / ,'  (,-----' /   \n"+
                                "       \"\"' '\"\"     '------'  \n");
                                  break;
      case "gameover" :
              System.out.println(   " _____                        _____                \n"+
                                    "|  __ \\                      |  _  |               \n"+
                                    "| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ \n"+
                                    "| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|\n"+
                                    "| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   \n"+
                                    " \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_|");
                                  break;
    }
  }
}//end class
