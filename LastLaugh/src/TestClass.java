/*
	Mike Plata
	CoSci 290
	Lab09

	Lab09 Description:	Create a superclass that all of your objects in your text
											adventure will extend to and name it accordingly for your
											text adventure.

											The only attribute this class should have is private int id
											with matching mutators and accessors that your subclasses
											will inherit.

											In a test class, create an ArrayList of that object type
											and instantiate at least one object of every concrete class
											you have in your game.

											Add these subclasses to your ArrayList. Set some properties
											for each class. Then loop through the ArrayList and print
											out info on each object.
*/

import java.util.*;
public class TestClass{

	//entry point of application
	public static void main(String[] args) {

		//declare and instantiate a new ArrayList
		ArrayList<GamePiece> list = new ArrayList<>();

		//deccare and instantiate various objects needed for text adventure
		Cloak cl1 = new Cloak();
		//Fighter fitr1 = new Fighter();
		Item it1 = new Item();
		Knife ki1 = new Knife();
		LeatherArmor le1 = new LeatherArmor();
		LightArmor li1 = new LightArmor();
		//MagicUser mgcUsr1 = new LightArmor();
		MysticalBlast mb1 = new MysticalBlast();
		//Rogue rog1 = new Rogue();
		Sword sw1 = new Sword();



		it1.setName("Dragon's Tooth");
		it1.setStrMod(1);
		it1.setTufMod(2);
		it1.setSklMod(3);

		list.add(cl1);
		//list.add(fitr1);
		list.add(it1);
		list.add(ki1);
		list.add(le1);
		list.add(li1);
		//list.add(mgcUsr1);
		list.add(mb1);
		//list.add(rog1);
		list.add(sw1);

		//initiate for loop to iterate through list
		for(int i = 0; i < list.size(); i++){

			//prints out object in index 'i', of the list
			System.out.println(list.get(i).toString());
		}//end for loop
	}//end of main method
}//end of TestClass
