class Card {
	int value;
	String suit;
	String name;
	
	public String toString() {
		return name + " of "+ suit;
	}
}

public class PickACard{
	public static void main(String[] args){
		Card[] deck = buildDeck();
		displayDeck(deck);
		shuffleDeck(deck);
		displayDeck(deck);
		
		int chosen = (int)(Math.random()*deck.length);
		Card picked = deck[chosen];
		
		Card pcard1, pcard2;
		Card dcard1, dcard2;
		int ptotal, dtotal;
		
		pcard1 = deck[0];
		pcard2 = deck[2];
		ptotal = pcard1.value + pcard2.value;
		System.out.println("You got a "+pcard1+" and a "+pcard2);
		
		dcard1 = deck[1];
		dcard2 = deck[3];
		dtotal = dcard1.value + dcard2.value;
		System.out.println("Dealer got a "+dcard1+" and a "+dcard2);
		
		if (ptotal > dtotal && ptotal <= 21)
			System.out.println("You won with a "+ptotal);
		else
			System.out.println("You lost");
				
		System.out.println("You picked a "+picked+" out of the deck,");
		System.out.println("worth "+picked.value+" points in Blackjack.");
	}
	
	public static Card[] buildDeck(){
		String[] suits = {"clubs", "diamonds", "hearts", "spades" };
		String[] names = { "ZERO", "ONE", "two", "three", "four", "five", "six", "seven", 
							"eight", "nine", "ten", "Jack", "Queen", "King", "Ace" };
		
		int i = 0;
		Card[] deck = new Card[52];
		
		for (String s: suits){
			for (int v = 2; v <= 14; v++){
				Card c = new Card();
				c.suit = s;
				c.name = names[v];
				if (v == 14)
					c.value = 11;
				else if (v > 10)
					c.value = 10;
				else 
					c.value = v;
				
				deck[i] = c;
				i++;
			}
		}
		return deck;
	}
	
	public static void displayDeck(Card[] deck){
		for (Card c : deck)
			System.out.println(c.value+"\t"+c);
	}
	
	public static void shuffleDeck(Card[] deck){
		
		System.out.println("*****Shuffling*****");
		for (Card c : deck){
			int i = (int)(Math.random()*deck.length);
			int j = (int)(Math.random()*deck.length);
		
			Card shuffle = deck[i];
			deck[i] = deck[j];
			deck[j] = shuffle;
		}
	}
}