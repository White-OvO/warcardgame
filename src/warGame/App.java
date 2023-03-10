package warGame;

public class App {
	
public static void main(String[] args) {
		
		Deck mainDeck = new Deck();
		
	
		
		mainDeck.shuffle(); 
		
		Player player1 = new Player("Chris");
		Player player2 = new Player( "Kevin");

	
		
///////////////////////////////////////
///////////////////////////////////////
//         deal each player 26 cards
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(mainDeck);              
			}else {
				player2.draw(mainDeck);
			}
		}  
///////////////////////////////////////
///////////////////////////////////////              
//        flips a card. 
//        If their value is higher than the other they get 1 point 
		
		for (int i = 0; i <26; i++); {
			Card player1Card = player1.flip(); 
			Card player2Card = player2.flip(); 
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();               
			}else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore(); 
			}
		}{
///////////////////////////////////////
///////////////////////////////////////
//          display players score
		              
player1.describe(); // players name and score from player class.
player2.describe(); //instance of type player class which describes player.
///////////////////////////////////////
///////////////////////////////////////
///          The winner is...               
		
}if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!"); 
		}else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!") ;
		}else if (player1.getScore() == player2.getScore()) {
			System.out.println("Draw");
			// create a get ascore method
		}
		}
}