/*
	Mike Plata
	CoSci 290

	The Notebook class represents an action that a player can take during
	gameplay.When the Player takes this action, they open their Notebook
	to the first page. This class also allows the player to move forward
	or backward	one page.
*/

//begin new class
public class Notebook{

	//method to open the player's notebook
	public void openNotebook(Player player, int activePage){
		
		System.out.println("Page " + (activePage + 1) + "\n");

		player.getNote(0).toString();
	}

	public int nextPage(Player player, int activePage){

		if((activePage + 1) <= player.getNotebookSize()){
			activePage++;

			System.out.println("Page " + (activePage + 1) + "\n");

			player.getNote(activePage).toString();

			return activePage;
		}
		else{
			displayErrorMsg();

			return activePage;
	}

	public int previousPage(Playerr player, in activePage){

		if((activePage - 1) >= 0){
			activePage--;

			System.out.println("Page " + (activePage - 1) + "\n");

			player.getNote(activePage).toString();

			return activePage
		}
		else{
			displayErrorMsg();

			return activePage;
		}
	}

}//end class
