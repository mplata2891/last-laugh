import java.util.*;

public class TestDriver{

  public static void main(String[] args){

    Menu mainMenu = new Menu("Main Menu:", "TextFiles/Menus/MainMenu.txt");

    mainMenu.displayMenu();
  }
}
