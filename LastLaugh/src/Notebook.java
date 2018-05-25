/*
	Mike Plata
	CoSci 290

	The Notebook class represents an action that a player can take during
	gameplay.When the Player takes this action, they open their Notebook
	to the first page. This class also allows the player to move forward
	or backward	one page.
*/

//begin new class
public class Notebook extends Command{

	public void openActivePage(Player player){

		//display the most recently accessed page of the player's notebook
		System.out.println(player.getNote(player.getCurrentPage()).toString());
	}//end openActivePage

	

	//method to change the page of the notebook
	public void changePage(Player player, int selection){

		//initiate if-else statement
		if(player.getNumberOfNotes() == 0)
			/*display error message*/;
		else{
			
			//initiate switch statement
			switch(selection){
				
				//enter case 1
				case 1:	this.moveToNextPage(player);//invokes moveToNextPage method
					break;//breaks out of switch

				//enter case 2
				case 2:	this.moveToPreviousPage(player);//invokes moveToPreviousPage method
					break;//breaks out of switch
			}//end switch
		}//end if-else
	}//end changePage



	//method to move to the next page in the notebook
	private void moveToNextPage(Player player){

		//initiate if-else statement
		if((player.getCurrentPage() + 1) == player.getNumberOfNotes())
			/*display error message*/;
		else
			player.setCurrentPage(player.getCurrentPage() + 1);
	}//end moveToNextPage



	//method to move to the previous page in the notebook
	private void moveToPreviousPage(Player player){

		//initiate if-else statement
		if(player.getCurrentPage() == 0)
			/*display error message*/;
		else
			player.setCurrentPage(player.getCurrentPage() - 1);
	}//end moveToPreviousPage	

}//end class
