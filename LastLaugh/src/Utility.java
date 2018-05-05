import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utility{

  //This method opens a file and prints each line
  public void readFile(String filename){
    String currentLine;

    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      while( (currentLine = br.readLine()) != null){
        //can do some sort of check here for special characters
        System.out.println(currentLine);
      }

    }catch(IOException e){
      e.printStackTrace();
    }

  }
  //gives random int in a given interval
  public int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
    }
  //lab 14
  public void testWriteFile(String userInfo){
    String FILENAME = "testWriting.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
			//String content = "This is the content to write into file\n";
			bw.write(userInfo);
			//System.out.println("Done");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}


  //ascii
  public void splashPage(String scene){
    switch(scene){
    case "title" :
            System.out.println( "      @@@        @@@@@@    @@@@@@   @@@@@@@   \n"+
                                "      @@@       @@@@@@@@  @@@@@@@   @@@@@@@   \n"+
                                "      @@!       @@!  @@@  !@@         @@!     \n"+
                                "      !@!       !@!  @!@  !@!         !@!     \n"+
                                "      @!!       @!@!@!@!  !!@@!!      @!!     \n"+
                                "      !!!       !!!@!!!!   !!@!!!     !!!     \n"+
                                "      !!:       !!:  !!!       !:!    !!:     \n"+
                                "       :!:      :!:  !:!      !:!     :!:     \n"+
                                "       :: ::::  ::   :::  :::: ::      ::     \n"+
                                "      : :: : :   :   : :  :: : :       :      \n"+


                                "@@@        @@@@@@   @@@  @@@   @@@@@@@@  @@@  @@@  \n"+
                                "@@@       @@@@@@@@  @@@  @@@  @@@@@@@@@  @@@  @@@  \n"+
                                "@@!       @@!  @@@  @@!  @@@  !@@        @@!  @@@  \n"+
                                "!@!       !@!  @!@  !@!  @!@  !@!        !@!  @!@  \n"+
                                "@!!       @!@!@!@!  @!@  !@!  !@! @!@!@  @!@!@!@!  \n"+
                                "!!!       !!!@!!!!  !@!  !!!  !!! !!@!!  !!!@!!!!  \n"+
                                "!!:       !!:  !!!  !!:  !!!  :!!   !!:  !!:  !!!  \n"+
                                " :!:      :!:  !:!  :!:  !:!  :!:   !::  :!:  !:!  \n"+
                                " :: ::::  ::   :::  ::::: ::   ::: ::::  ::   :::  \n"+
                                ": :: : :   :   : :   : :  :    :: :: :    :   : :  \n");
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
}
