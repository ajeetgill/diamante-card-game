import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DeckTests {
    Deck deck = new Deck();

    @Test
    public void testDeckCreation() {
        assertNotEquals(0, deck.size(), "Deck size found to be 0");
    }

    @Test
    public void testDeckSize() {
        assertEquals(Deck.TOTAL_CARDS, deck.size(), "Deck size found to be 0");
    }

    @Test
    public void testNumberOfTreasureCards() {
        int numTreasureCards = 0;
        while (!deck.isEmpty()) {
            Card card = deck.drawCard();
            if (card instanceof TreasureCard) {
                numTreasureCards++;
            }
        }
        String message = "Deck has unexpected number of treasure cards : " + numTreasureCards;
        assertEquals(Deck.TOTAL_TREASURE_CARDS, numTreasureCards, message);
    }

    @Test
    public void testNumberOfHazardCards() {
        int numHazardCards = 0;
        while (!deck.isEmpty()) {
            Card card = deck.drawCard();
            if (card instanceof HazardCard) {
                numHazardCards++;
            }
        }
        String message = "Deck has unexpected number of Hazard cards : " + numHazardCards;
        assertEquals(Deck.TOTAL_HAZARD_CARDS, numHazardCards, message);
    }


}
