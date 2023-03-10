package warGame;

public class Card {
//this is set to private so no one can change the name of the deck	
///////////////////////////////////////////////////////////		
////////////////i.Fields values and names
	// card class value and name 
		private String cardName;
		private String rank;
		private int cardValue;
///////////////////////////////////////////////////////////		
//////////////////Constructors
//		public Card(int value,String name, String rank) {
//			this.cardValue = value;
//			this.cardName = name;
//			this.rank = rank;
//		}

				
				


//						This is a class that has two constructors. The first constructor sets the value of cardValue to the value passed in as an argument, 
//						and sets the value of cardName to the name passed in as an argument. The second constructor does the same thing, but with different order of arguments.			
///////////////////////////////////////////////////////////		
////////////////Methods 
		


			///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
/////////////////ii 1.) Getters and setters
			public int getValue() { 
				return this.cardValue;
			}
			
			public void setValue(int value) {
				this.cardValue = value;
			}
			
			public String getName() {
				return this.cardName;
			}
			
			public void setName(String name) { 
				this.cardName = name;
			
			}
			public String getRank() {
				return rank;
			}

			public void setRank(String rank) {
				this.rank = rank;
			}
//						Methods it return name and value just as two of spades or two of ace etc  
//						The constructor takes in two parameters, value and name, and assigns them to the fields.
			
			
			
			
			
			
			
			
			
///////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////		
////////////////Describe

	public String describe() {
			  return " The "+ rank + " of " + cardName; //return String name of card 
			  
			  

	}


	
}

	

