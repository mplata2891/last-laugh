/*
	This is what the skeleton of our game should look like
	with example methods, that may or may not exist yet
	or ever.

	::: DO NOT TRY TO COMPILE, CUZ IT WON'T COMPILE :::
*/

//begining of new class
public class LastLaugh{

	//entry point of application
	public static void main(String[] args){

		//instantiate and initialize Utility objects
		FileUtility fileTool = new FileUtility();
		InputUtility inputTool = new InputUtility();

		//instantiate and initialize Menu objects
		Menu mainMenu = new Menu("Main Menu:", "TextFiles/Menus/MainMenu.txt");
		Menu playerMenu = new Menu("Player Menu:", "TextFiles/Menus/PlayerMenu.txt");
		Menu moveMenu = new Menu("Move Menu:", "TextFiles/Menus/MoveMenu.txt");
		Menu actionMenu = new Menu("Action Menu:", "TextFiles/Menus/ActionMenu.txt");
		Menu inventoryMenu = new Menu("Inventory Menu:", "TextFiles/Menus/InventoryMenu.txt");

		//instantiate and initialize Player object
		Player playerOne = new Player();

		//instantiate and initialize PositionTracker object
		PositionTracker tracker = new PositionTracker(5, 5, 4, 1);

		//declare and initialize variables
		int selection;


		do{ //initiate do-while (1)

			mainMenu.displayMenu();//displays game's main menu

			fileTool.promptForSelection();//prompts user for selection

			//takes user's menu selection, validates, and stores it
			selection = inputTool.takeSelection(3);

			switch(selection){ //initiate switch statement

				//enter case 1 and invoke startNewGame method
				case 1:	tool.startNewGame();
								break;//break out of switch statement

				//enter case 2 and invoke continueGame method
				case 2:	tool.continueGame();
								break;//break out of switch statement
			}//end switch

			if(selection != 3){ //initiate if statement

				do{ //initiate do-while (2)

					playerMenu.displayMenu();//displays the player menu

					fileTool.promptForSelection(3);//prompts user for selection

					//takes user's menu selection, validates, and stores it
					selection = inputTool.takeSelection(7);

					switch(selection){ //initiate switch statement

						//enters case 1
						case 1:	do{//initiate do-while (3)

											moveMenu.displayMenu();//display move menu

											fileTool.promptForSelection();//prompts user for selection

											//takes user's menu selection, validates, and stores it
											selection = inputTool.takeSelection(5)

											switch(selection){//initiate switch statement

												//enters case 1 and invokes moveNorth method
												case 1:	player.moveNorth();
																break;//breaks out of switch

												//enters case 2 and invokes moveSouth method
												case 2:	player.moveSouth();
																break;//breaks out of switch

												//enter case 3 and invokes moveEast method
												case 3:	player.moveEast();
																break;//breaks out of switch

												//enters case 4 and invokes moveWest method
												case 4:	player.moveWest();
																break;//breaks out of switch
											}//end switch

										}while(selection != 5);//end do-while (3)

										break;//breaks out of switch

						//enters case 2 and invokes sense method
						case 2:	player.sense();
														break;//breaks out of switch

						//enters case 3 and invokes examine method
						case 3:	player.examine()
														break;//breaks out of switch

						//enters case 4
						case 4:	do{//initiate do-while (4)

											actionMenu.displayMenu();//display action menu

											fileTool.promptForSelection();//prompts user for selection

											//takes user's menu selection, validates, and stores it
											selection = inputTool.takeSelection(7);

											switch(selection){//initiate switch statement

												//enter case 1 and invoke press method
												case 1:	player.press();
																break;//breaks out of switch statement

												//enter case 2 and invoke pull method
												case 2:	player.pull();
																break;//breaks out of switch statement

												//enter case 3 and invoke turn method
												case 3:	player.turn();
																break;//breaks out of switch statement

												//enter case 4 and invoke slide method
												case 4:	player.slide();
																break;//breaks out of switch statement

												//enter case 5 and invoke push method
												case 5:	player.push();
																break;//breaks out of switch statement

												//enter case 6 and invoke type method
												case 6:	player.type();
																break;//breaks out of switch statement
											}//end switch

										}while(selection != 7);//end do-while (4)

										break;//breaks out of switch

						//enters case 5
						case 5:	do{//initiate do-while (5)

											inventoryMenu.displayMenu();//display inventory menu

											fileTool.promptForSelection();//prompts user for selection

											//takes user's menu selection, validates, and stores it
											selection = inputTool.takeSelection(4);

											switch(selection){//initiate switch statement

												//enter case 1 and invoke inspect method
												case 1:	item.inspect();
																break;//breaks out of switch

												//enter case 2 and invoke combine method
												case 2:	item.combine();
																break;//breaks out of switch

												//enters case 3 and invokes use method
												case 3:	item.use();
																break;//breaks out of switch
											}//end switch

										}while(selection != 4);//end do-while (5)

										break;//breaks out of switch

						//enters case 6 and invokes saveGame method
						case 6:	tool.saveGame();
														break;//breaks out of switch

						//enters case 7 and invokes confirmExit method
						case 7:	selection = inputTool.confirmExit();
														break;//breaks out of switch
						}//end switch

				}while(selection != 7);//end do-while (2)

			}//end if

		}while(selection != 3);//end do-while (1)

		tool.endGame();//invoke the endGame method

	}//end main

}//end class
