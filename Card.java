public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	public String getSuit() {
		return suit;
   }

	public String getRank() {
		return rank;
	}

	public int getPointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		if(otherCard.rank().equals(rank) && otherCard.suit().equals(suit) && otherCard.getPointValue() == pointValue)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
