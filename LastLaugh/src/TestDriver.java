import java.util.*;

public class TestDriver{

  public static void main(String[] args){

    Menu mainMenu = new Menu("Main Menu");

    mainMenu.setOptions("TextFiles/Menus/MainMenu.txt");

    System.out.println(mainMenu.toString());
  }
}
