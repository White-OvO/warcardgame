package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
////////////////List of cards
	private List <Card>cards = new ArrayList<>();



///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
////////////////Do i need a constructor for card and deck class or just a single constructor ?	
//constructors
	public Deck() {
			cards = new  ArrayList<Card> ();
			  String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
			  String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"}; // or values
	    	
	
			  
			  for (int row = 0; row < 4; row++){
				  for(int column = 0; column < 13; column++ ) {
			Card newCard = new Card (); //makes a new card
			newCard.setName(suits[row]);//gives card name
			newCard.setValue(column); //setting value 
			newCard.setRank(ranks[column]); //setting ranks
			cards.add(newCard); //adds the completed card to the deck
			
				  }
			  }
		//for (int i = 0 ; i < 52; i++) {
				//cards.add(new Card(i));
				//string and a value
				
		}
	//}

	//Methods 
	
	
///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
////////////////Shuffle deck method	
	
	
	//change shuffle method
	
	//collections videos
	//
	
	
				public void shuffle(){
					Collections.shuffle(cards);
					
					
					
					
				}
///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
//////////////////Draw removes and returns the top card of the card field
	
	public  Card draw() {
		Card currentCard = cards.remove(0);
	//	return cards.remove(0);
		return currentCard;
	
		
	}
	
	
	public String toString() {
		for (Card card : cards) {
			System.out.println(card.describe()); //will print out all cards
		}
		return " " ;
	}
	
	
	
}
	
	