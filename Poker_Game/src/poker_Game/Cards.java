package poker_Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Cards {
	
	
	//Class that has a single card data fields
	private class Card{
		private String suites;
		private String numbers;
	
		Card(String suit, String num){
			this.suites = suit;
			this.numbers = num;
		}
		
		public String toString() {
			return suites + "-" + numbers;
		}
	}
	
	
	//Create an ArrayList to add a single card until we have a full deck
	//we use Card type ArrayList to add the Card data(Two values: suite and number)
	private ArrayList <Card> Deck = new ArrayList<>();
	public void buildDeck() {
		String[] suites = {"C","H","D","S"};
		String[] numbers = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
		
		for(int i = 0; i < suites.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				Card card = new Card(suites[i],numbers[j]); // a multiple of Card constructors
				Deck.add(card);
			}
		}
		System.out.println("Deck is built ");
		System.out.println(Deck); // a multiple toString constructor of ArrayList - hard concept
	}
	
	
	//shuffle the Deck
	Random rand = new Random();
	public void shuffleDeck() {
		for (int i = 0; i < Deck.size(); i++) {
			int j = rand.nextInt(Deck.size());
			Card currentCard = Deck.get(i);
			Card randomCard = Deck.get(j);
			Deck.set(i, randomCard);
			Deck.set(j, currentCard);
		}
		System.out.println(Deck);
		System.out.println();
		System.out.println();
	}
	
	//if there are more than two players, make an object for multiple players for handing two cards for each
	//storing the two cards on hand in ArrayList for each player
	ArrayList<Card> playerOne = new ArrayList<>(); 
	ArrayList<Card> playerTwo = new ArrayList<>();
	//remove two cards on top of the deck for player one
	public void handingOne() {
		System.out.println("Player 1 cards'");
		playerOne.add(Deck.remove(Deck.size()-1));
		playerOne.add(Deck.remove(Deck.size()-1));
		System.out.println(playerOne.toString());
		System.out.println();
	}
	
	
	//remove two cards on top of the deck for player two
	public void handingTwo() {
		System.out.println("Player 2 cards'");
		playerTwo.add(Deck.remove(Deck.size()-1));
		playerTwo.add(Deck.remove(Deck.size()-1));
		System.out.println(playerTwo.toString());
		System.out.println();
	}
	
	
	//money to bid for each players
	private class Money{
		
		private int money = 1000;
		static private int gameMoney = 10;
		static private int bidMoney = 0;
		public int bidding = 0;
		
		Money(){
			money = 1000;
		}
		Money(int num){
			money = num;
		}
		public static int getBidMoney() {
			return bidMoney;
		}
		public static void setBidMoney(int num) {
			bidMoney = num;
		}
		public int getMoney() {
			return this.money;
		}
		public static void setGameMoney(int num) {
			gameMoney = num;
		}
		public static int getGameMoney() {
			return gameMoney;
		}
		public void gameMoney() {
			this.money -= gameMoney;
			bidMoney += gameMoney;
		}
		public void setMoney(int num) {
			this.money = num;
		}
		public void minus(int num) {
			this.money -= num;
		}
		public void plus(int num) {
			this.money += num;
		}
		public void bid() {
			Scanner input = new Scanner(System.in);
			
			Money.setBidMoney(Money.getBidMoney()-bidding);
			
			System.out.println("money: " + this.getMoney());
			System.out.print("How much do you want to bid?: (if you want to continue the game, please match the money the other player bid) ");
			bidding = input.nextInt();
			this.money -= bidding;
			System.out.println("Money: " + this.getMoney());
			
			Money.setBidMoney(Money.getBidMoney()+bidding);
			
			System.out.println("Total money in the pot: " + Money.getBidMoney());
		}	
	}
	
	
	//ask each user to bid, call, or die
	Money []money = new Money[2];
	public int count = 0;
	
	public int moneyOne = 0;
	public int moneyTwo = 0;
	
	public void call() {
		
		if (count == 0) {
			money[0] = new Money();
			money[1] = new Money();
		}else if(count > 0){
			money[0] = new Money(moneyOne);
			money[1] = new Money(moneyTwo);
		}
		count++;
		
		
		Scanner input = new Scanner(System.in);
		int [] choice = new int[3];
		
		
		for(int i = 0; i < choice.length-1; i++) {
			
			if (money[i].getMoney() == 1000) {
				money[i].gameMoney();
			}
			
			System.out.println("player " + (i+1) + " What do you want to do: (1. call 2. bid 3. die)");
			choice[i] = input.nextInt();
			System.out.println("Totla money in the pot: " + Money.getBidMoney());
			
			if(choice[i] == 1) {
				
				// whichever the player wants to bid, the other player should be able to just call to match the bidding.
				if (money[0].bidding != 0) {
					System.out.println();
					System.out.println("following the player's bid: ");
					money[i].bid();
					do {
						if (money[0].bidding < money[1].bidding) {
							money[0].plus(money[0].bidding);
							money[0].bid();	
						}else if (money[0].bidding > money[1].bidding){
							money[1].plus(money[1].bidding);
							money[1].bid();
						}
					}while(money[0].bidding != money[1].bidding);
					System.out.println();
				}
			}else if(choice[i] == 2) {
				//if other player's bidding is higher, then you should be able to follow or bid higher	
				System.out.println();
				System.out.println("player " + (i+1));
				money[i].bid();
				//System.out.println("player 2");
				//money[1].bid();
				if ((money[1] != null) && (money[1].bidding > money[0].bidding)) {
					do {
						
						if (money[0].bidding < money[1].bidding) {
							System.out.println();
							System.out.println("Player 1");
							money[0].setMoney(money[0].getMoney()+money[0].bidding);
							//Money.setBidMoney(Money.getBidMoney()-money[0].bidding);
							money[0].bid();
							System.out.println();
						} 
						if (money[1].bidding < money[0].bidding) {
							System.out.println();
							System.out.println("Player 2");
							money[1].setMoney(money[1].getMoney()+money[1].bidding);
							//Money.setBidMoney(Money.getBidMoney()-money[1].bidding);
							money[1].bid();
							System.out.println();
						}
					}while(money[0].bidding!=money[1].bidding);
					System.out.println(Money.getBidMoney());
				}
									
			}else if(choice[i] == 3) {
				if(i == 1) {
					money[0].plus(Money.getBidMoney());
					Money.setBidMoney(0);
				}else if(i == 0) {
					money[1].plus(Money.getBidMoney());
					Money.setBidMoney(0);
				System.out.println(money[0].getMoney());
				System.out.println(money[1].getMoney());
				System.out.print(Money.getBidMoney());
				}
			}
			
		}
		moneyOne = money[0].getMoney();
		moneyTwo = money[1].getMoney();
	}
	
	
	
	
	
		
	//find a match with the first card you have with the cards on the table
	//first - find a matching number from the first card 
	//second - find a matching number from the second card
	//third - if both cards on hand have a match AND one has two matching cards AND other has a single matching card, then assign F.H.
	//fourth - if one on hand matches to three cards, declare Four of A Kind.
	//fifth - if matching doesn't exist, convert the string into number 
	//make a array that input all the two cards on hand and the cards on the table 
	//and sort it and pick any one of cards and if the next index array value is bigger by 1
	//and if the picked card is at the end index of the array then start from the first and find if it's 1 bigger
	//if all the consecutive elements are same suite declare straight Flush.
	//seventh check if the suites are from where the picked one getting compared with the next index array
	//eighth again make a new array to squeeze all the elements of two cards and the cards on the table
	//and pick one of any card and look for a matching suite And declare a minimum value to get rid of it except 1='A'
	//NOTES - use a split method to get the "-" out
	
	//calculate the upper hand by the rank of the cards combination 
	public void open() {
				
		}
	
		
		
	ArrayList<Card> table = new ArrayList<>();	
	//lays three cards on the table and ask user to bid before putting 4th and 5th card on the table and finally open()
	public void setTable() {
		System.out.println("Dealing three cards on the table: ");
		table.add(Deck.remove(Deck.size()-1));
		table.add(Deck.remove(Deck.size()-1));
		table.add(Deck.remove(Deck.size()-1));
		System.out.println(table.toString());
		System.out.println();
		call();
		table.add(Deck.remove(Deck.size()-1));
		System.out.println(table.toString());
		System.out.println();
		call();
		table.add(Deck.remove(Deck.size()-1));
		System.out.println(table.toString());
		System.out.println();
		call();
		//open();
		//reset ArrayList to 0
	}	 
	
	
	/*
	//if user want to quit or run out of money break or return false value to stop the loop
	public void close() {
		
		int one = money[0].getMoney();
		int two = money[1].getMoney();
		
		if (money[0].getMoney() <= 0 || money[1].getMoney() <= 0) {
			System.out.println("PLAYER " + 1 + "has : " + money[0].getMoney());
			System.out.println("PLAYER " + 2 + "has : " + money[1].getMoney());
			if (one > two) {
				System.out.print("Congratulation Player 1!!! you outplayed Player 2");
			}else {
				System.out.print("Congratulation Player 2!!! you outplayed Player 1");
			}
			System.exit(0);
		}
	}
	*/
}
