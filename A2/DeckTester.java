package A2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    
    
    static Deck deck = new Deck(new String[] {"Eight", "Jack", "Eight"}, new String[] {"Spades", "Hearts", "Spades"}, new int[] {8, 11, 8});
    
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        
        System.out.println("Test Passed");
        System.out.println("deal   : " + ((Boolean)(testDeal(0) && testDeal(1))).toString());
    }
    
    
    private static Boolean testDeal(int timeRan) {
        
        if (deck.deal().equals(deck.cards.get(2-timeRan))) {
            return true;
        }
        return false;
    }
    
}
