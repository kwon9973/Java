package poker_Game; 
import java.util.ArrayList;
import java.util.Arrays;

public class Poker_Game {

	public static void main(String[] args) {
		
			do {
				Cards cards = new Cards();
				cards.buildDeck(); 
				cards.shuffleDeck();
				//can make a new object every time you hand two cards to players, but it is for the simple display.
				cards.handingOne();
				cards.handingTwo();			
				cards.call();
				//cards.call2();
				//cards.setTable();
				//cards.close(); //break out of the loop once either of the players runs out of money
				break;
			}while(true);
	}

}
