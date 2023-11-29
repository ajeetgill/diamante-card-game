public class DeckTest {
    private Deck deck;

    public void setUp() {
        deck = new Deck();
        deck.initializeDeck();
    }

    public void testDeckNotEmptyAfterInitialization() {
        setUp();
        if (deck.isEmpty()) {
            System.out.println("Test failed: Deck is empty after initialization");
        } else {
            System.out.println("Test passed: Deck is not empty after initialization");
        }
    }

    public void testDrawingReducesDeckSizeByOne() {
        setUp();
        int initialSize = deck.size();
        deck.drawCard();
        if (deck.size() == initialSize - 1) {
            System.out.println("Test passed: Drawing reduced deck size by one");
        } else {
            System.out.println("Test failed: Drawing did not reduce deck size by one");
        }
    }

    public void testDrawingFromEmptyDeckThrowsException() {
        setUp();
        while (!deck.isEmpty()) {
            deck.drawCard(); // Empty the deck
        }
        try {
            deck.drawCard();
            System.out.println("Test failed: Expected exception not thrown when drawing from an empty deck");
        } catch (EmptyDeckException e) {
            System.out.println("Test passed: Exception thrown when drawing from an empty deck");
        }
    }

    public static void main(String[] args) {
        DeckTest deckTest = new DeckTest();
        deckTest.testDeckNotEmptyAfterInitialization();
        deckTest.testDrawingReducesDeckSizeByOne();
        deckTest.testDrawingFromEmptyDeckThrowsException();
    }
}
