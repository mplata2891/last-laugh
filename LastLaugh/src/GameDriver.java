/*
	Mike Plata
	CoSci 290
*/

//begin new class
public class GameDriver{
	
	//method to run the title screen sequence
	public void runTitleScreen(CoreObjects gameStructure, FileUtility fileTool,
								InputUtility ioTool) {
		
		//invokes splashPage method 
		fileTool.splashPage("title");
		
		//invokes displayMenu method
		gameStructure.getNavigator().getMenu(0).displayMenu();
		
		//invokes menuPrompt method
		ioTool.menuPrompt();
		
		//invokes takeSelection method
		gameStructure.getSelector().setTitleSelection(ioTool.takeSelection(3));	
	}//end runTitleScreen
	
	
	
	//method to run the intro sequence of the game
	public void runIntroSequence(CoreObjects gameStructure, FileUtility fileTool,
									InputUtility ioTool) {
		
		//access the readFile member of the tool object to display the story's Prologue
	    fileTool.readFile("src/TextFiles/Story/Prologue.txt");
	    
	    //need something to pause,1 then continue

	    //access the readFile member of the tool object to display the story's
	    //first part of the intro
	    fileTool.readFile("src/TextFiles/Story/Intro1.txt");

	    //prompt user for input
	    System.out.print("\nYou've been passed out for 3 days."
	                    + "What's your name?\n");

	    //take user's input
	    gameStructure.getPlayer().setName(ioTool.takeName());
	    
	    //skip to next line
	    System.out.println();

	    //access the readFile member of the tool object to ddisplay the story's
	    //second part of the intro
	    fileTool.readFile("src/TextFiles/Story/Intro2.txt");
	    
	    //skip to next line
	    System.out.println();
	    
	    //need something to pause and continue
	}//end runIntro Sequence
	
	
	
	//method to run the main portion of the game
	public void runMainGame(CoreObjects gameStructure, InputUtility ioTool) {
		
		//update the current room
		gameStructure.getPositionTracker().updateCurrentRoom();
		
		//initiate do-while loop
		do {
			
			//invoke the displayMenu method
			gameStructure.getNavigator().getMenu(1).displayMenu();
			
			//invokes menuPrompt method
			ioTool.menuPrompt();
			
			//invokes takeSelection method
			gameStructure.getSelector().setMainSelection(ioTool.takeSelection(8));
			
			switch(gameStructure.getSelector().getMainSelection()) {
			
				//enter case 1
				case 1:	this.executeMoveOperation(gameStructure, ioTool);
						break;//breaks out of switch
						
				//enter case 2
				case 2:	this.executeSenseOperation(gameStructure.getPlayer().getCommand().getSense(),
													gameStructure.getPositionTracker().getCurrentRoom());
						break;//breaks out of switch
				
				//enter case 3
				case 3:	this.executeExamineOperation(gameStructure, ioTool);
						break;//breaks out of switch
				
				//enter case 4
				case 4: this.executeInteractOperation(gameStructure, ioTool);
						break;//breaks out of switch
						
				//enter case 5
				case 5: this.executeActionOperation(gameStructure, ioTool);
						break;//breaks out of switch
						
				//enter case 6
				case 6: this.executeInventoryOperation(gameStructure, ioTool);
						break;//breaks out of switch
						
				//enter case 7
				case 7: this.executeNotebookOperation(gameStructure, ioTool);
						break;//breaks out of switch
						
				//enter default case
				//default:	this.confirmExitMainGame();	
			}//end switch
			
		}while(gameStructure.getSelector().getMainSelection() != 8);
		
		//invoke setTitleSelection method
		gameStructure.getSelector().setTitleSelection(0);
		
	}//end runMainGame
	
	
	
	//method to move player
	private void executeMoveOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//initiate do-while loop
		do {
			
			gameStructure.getNavigator().getMenu(2).displayMenu();
			
			//invokes menuPrompt method
			ioTool.menuPrompt();
			
			//invokes takeSelection method
			gameStructure.getSelector().setSubSelection(ioTool.takeSelection(3));
			
			if(gameStructure.getSelector().getSubSelection() != 3)
				gameStructure.getPlayer().getCommand().getMove().
					movePlayer(gameStructure.getPositionTracker(), 
								gameStructure.getSelector().getSubSelection());
		
		}while(gameStructure.getSelector().getSubSelection() != 3);
		
		//invoke setMainSelection method
		gameStructure.getSelector().setMainSelection(0);
		
	}//end executeMoveOperation
	
	
	
	//method to sense objects in room
	private void executeSenseOperation(Sense sense, Room room) {
		
		//invoke senseSurroundings method
		sense.senseSurroundings(room);
	}//end executeSenseOperation
	
	
	
	//method to examine object in room
	private void executeExamineOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//gameStructure.getPositionTracker().updateCurrentRoom();
		
		//initiate do-while loop
		do {
			//System.out.println(gameStructure.getPositionTracker().getCurrentRoom().getDoor().toString());
			
			 //System.out.println(gameStructure.getPositionTracker().getCurrentRoom().getCaretaker().toString());
			 
				//invoke displayMenu method
				gameStructure.getNavigator().getMenu(3).displayMenu();
				
				//invokes menuPrompt method
				ioTool.menuPrompt();
				
				//invokes takeSelection method
				gameStructure.getSelector().setSubSelection(ioTool.takeSelection(4));
				
				if(gameStructure.getSelector().getSubSelection() != 4) {
					gameStructure.getPositionTracker().updateCurrentRoom();
					gameStructure.getPlayer().getCommand().getExamine().
						examineItem(gameStructure.getPositionTracker().getCurrentRoom(), 
										gameStructure.getSelector().getSubSelection());
				}
			
		}while(gameStructure.getSelector().getSubSelection() != 4);
		
		//invoke setMainSelection method
		gameStructure.getSelector().setMainSelection(0);
				
	}//end executeExamineOperation
	
	
	
	//method to interact with caretaker
	private void executeInteractOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//initiate do-while loop
		do {
						
				//invoke displayMenu method
				gameStructure.getNavigator().getMenu(4).displayMenu();
					
				//invokes menuPrompt method
				ioTool.menuPrompt();
						
				//invokes takeSelection method
				gameStructure.getSelector().setSubSelection(ioTool.takeSelection(4));
						
				if(gameStructure.getSelector().getSubSelection() != 4) {
					gameStructure.getPlayer().getCommand().getInteract().
						interactWithCaretaker(gameStructure.getPlayer(), 
								gameStructure.getPositionTracker().getCurrentRoom().getCaretaker(), 
									gameStructure.getSelector().getSubSelection());
				}
					
		}while(gameStructure.getSelector().getSubSelection() != 4);
				
		//invoke setMainSelection method
		gameStructure.getSelector().setMainSelection(0);
		
	}//end executeInteractOperation
	
	
	
	//method to select a puzzle piece and take an action on selected puzzle piece
	public void executeActionOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//initiate do-while loop
		do {
							
			gameStructure.getPlayer().getCommand().getAction().
				displayPuzzlePieces(gameStructure.getPositionTracker().getCurrentRoom());
					
			//invoke displayMenu method
			gameStructure.getNavigator().getMenu(5).displayMenu();
							
			//invokes menuPrompt method
			ioTool.menuPrompt();
							
			//invokes takeSelection method
			gameStructure.getSelector().setSubSelection(ioTool.takeSelection(2));
							
			if(gameStructure.getSelector().getSubSelection() != 2)
				this.executeActionSubOperation(gameStructure, ioTool);
						
			}while(gameStructure.getSelector().getSubSelection() != 2);
						
			//invoke setMainSelection method
			gameStructure.getSelector().setMainSelection(0);
			
	}//end executeActionOperation
	
	
	
	//method to perform a manipulation on a puzzle piece
	public void executeActionSubOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		gameStructure.getPlayer().getCommand().getAction().
			selectPuzzlePiece(gameStructure.getPositionTracker().getCurrentRoom());
		
		//initiate do-while loop
		do {
							
			//invoke displayMenu method
			gameStructure.getNavigator().getMenu(6).displayMenu();
									
			//invokes menuPrompt method
			ioTool.menuPrompt();
									
			//invokes takeSelection method
			gameStructure.getSelector().setSubSelection(ioTool.takeSelection(7));
									
			if(gameStructure.getSelector().getSubSelection() != 7)
				gameStructure.getPlayer().getCommand().getAction().
					performAction(gameStructure.getPlayer(), 
								gameStructure.getPositionTracker().getCurrentRoom().
									getSelectedPuzzlePiece(),
										gameStructure.getSelector().getSubSelection());
								
			}while(gameStructure.getSelector().getSubSelection() != 7);
								
			//invoke setMainSelection method
			gameStructure.getSelector().setSubSelection(0);
			
	}//end executeActionSubOperation
	
	
	
	//method to open inventory
	public void executeInventoryOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//initiate do-while loop
		do {
				
				//invoke openInventory method
				gameStructure.getPlayer().getCommand().getInventory().
				openInventory(gameStructure.getPlayer());
			
				//invoke if-else statement
				if(gameStructure.getPlayer().getNumberOfKeys() > 0) {
				
					//invoke displayMenu method
					gameStructure.getNavigator().getMenu(7).displayMenu();
						
					//invokes menuPrompt method
					ioTool.menuPrompt();
									
					//invokes takeSelection method
					gameStructure.getSelector().setSubSelection(ioTool.takeSelection(2));
									
					if(gameStructure.getSelector().getSubSelection() != 2) {
						gameStructure.getPlayer().getCommand().getInventory().
							useKey(gameStructure.getPlayer(), gameStructure.getPositionTracker().
									getCurrentRoom().getDoor());
					}
				}else
					gameStructure.getSelector().setSubSelection(2);
							
		}while(gameStructure.getSelector().getSubSelection() != 2);
					
		//invoke setMainSelection method
		gameStructure.getSelector().setMainSelection(0);
		
	}//end executeInventoryOperation
	
	
	
	//method to open notebook
	public void executeNotebookOperation(CoreObjects gameStructure, InputUtility ioTool) {
		
		//initiate do-while loop
		do {
			
			//invoke openActivePage method
			gameStructure.getPlayer().getCommand().getNotebook().openActivePage(gameStructure.getPlayer());
			
			//initiate if-else statement
			if(gameStructure.getPlayer().getNumberOfNotes() > 0) {
			
				//invoke displayMenu method
				gameStructure.getNavigator().getMenu(8).displayMenu();
						
				//invokes menuPrompt method
				ioTool.menuPrompt();
						
				//invokes takeSelection method
				gameStructure.getSelector().setSubSelection(ioTool.takeSelection(3));
						
				if(gameStructure.getSelector().getSubSelection() != 3)
					gameStructure.getPlayer().getCommand().getNotebook().
						changePage(gameStructure.getPlayer(), 
									gameStructure.getSelector().getSubSelection());
			}else
				gameStructure.getSelector().setSubSelection(3);
				
		}while(gameStructure.getSelector().getSubSelection() != 3);
				
		//invoke setMainSelection method
		gameStructure.getSelector().setMainSelection(0);
		
	}//end executeNotebookOperation
	
}//end class