import java.util.ArrayList;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {
    
    private static ArrayList<Card> cards = new ArrayList<Card>();
    
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        cards.add(new Card("Eight", "Spades", 8));
        cards.add(new Card("Jack", "Hearts", 11));
        cards.add(new Card("Eight", "Spades", 8));
        System.out.println("Test Passed");
        System.out.println("matches   : " + testMatches().toString());
        System.out.println("toString  : " + testToString().toString());
    }
    
    
    private static Boolean testMatches() {
        if (!cards.get(0).matches(cards.get(2))) {
            return false;
        }
        if (cards.get(0).matches(cards.get(1))) {
            return false;
        }
        return true;
    }
    
    private static Boolean testToString() {
        if (!cards.get(0).toString().equals("Eight of Spades (point value = 8)")) {
            return false;
        }
        if (!cards.get(1).toString().equals("Jack of Hearts (point value = 11)")) {
            return false;
        }
        return true;
    }
    
    
}
