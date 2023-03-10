package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	//Fields
	 private List <Card>hand = new ArrayList<>();
	 private int score;
	 private String name;

	
	// constructors
	
	
	
	public Player(String name) {
			score = 0;
			this.name = name;
			//this.hand = new ArrayList <Card> () ;
			
			
	}
	
//								METHODS describe
	//move over to app class when finished useful source
	public void describe() {

			System.out.println("player name: " + name + " and my score is: " + score);
			
	}
	////////////////getters and setters for hand
	
		  // Getter
		  public String getName() {
		    return name;
		  }

		  // Setter
		  public void setHand(List<Card> hand) {
		    this.hand = hand;
		  }
		public List<Card> getHand() {
			return hand; 
		}
		
		
		
		// create a get a score method
		public int getScore() {
		return score;
		
			//getScore = score;
		}
		 
	 
//									Flip 
	
	public Card flip() {
		Card currentCard = hand.get(0);
		hand.remove(0); 
		System.out.println(name +" has " + currentCard.describe());
		return currentCard;
		
	}
	
// 									draw
	public void draw(Deck mainDeck) {
		Card card = mainDeck.draw();
		hand.add(card);
//	or 
// public void draw(Deck draw){
//	Card currentCard = deck.draw();
//	hand.add(currentCard);		
	}
	
//									Increment Score
	public void incrementScore() {
		score++;
		
	}

	
}
	
