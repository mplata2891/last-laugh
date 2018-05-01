import java.util.*;
import Menus.Menu;

public class TestDriver{

  public static void main(String[] args){

    Menu mainMenu = new Menu("Main Menu", 3);

    mainMenu.setOptions("TextFiles/Menus/MainMenu.txt");

    System.out.println(mainMenu.toString());
  }
}
