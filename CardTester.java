/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("Ten", "Spades", 10);
		Card two = new Card("Ten", "Hearts", 10);
		Card three = new Card("Ten", "Diamonds", 10);

		System.out.println(one.getSuit());
		System.out.println(one.getRank());
		System.out.println(one.getPointValue());
		System.out.println(one.toString);

		System.out.println(two.getSuit());
		System.out.println(two.getRank());
		System.out.println(two.getPointValue());
		System.out.println(two.toString);

		System.out.println(three.getSuit());
		System.out.println(three.getRank());
		System.out.println(three.getPointValue());
		System.out.println(three.toString);
	}
}
