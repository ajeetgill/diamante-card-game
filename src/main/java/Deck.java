import java.util.Collections;
import java.util.Stack;


/**
 * This class represents the deck of cards used in the Diamant board game.
 * It uses the Stack data structure from Java Collections Framework to simulate a deck of cards.
 */
public class Deck {
    private Stack<Card> cards;
    final private int TOTAL_TREASURE_CARDS = 2;
    final private int TOTAL_HAZARD_CARDS = 5;

    /**
     * Constructor for the Deck class.
     * It initializes the cards stack and adds the necessary cards to it.
     */
    public Deck() {
        cards = new Stack<>();
        // Add treasure cards to the deck
        for (int i = 0; i < TOTAL_TREASURE_CARDS; i++) {
            cards.push(new TreasureCard(TreasureCard.TREASURE_TYPE.RUBY));
        }
        // Add hazard cards to the deck
        for (int i = 0; i < TOTAL_HAZARD_CARDS; i++) {
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SNAKE));
            // pick a random hazard card
//            int random = (int) (Math.random() * 3);
//            if (random == 0)
//                cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SNAKE));
//            else if (random == 1)
//                cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SPIDER));
//            else
//                cards.push(new HazardCard(HazardCard.HAZARD_TYPES.ROCKSLIDE));
        }
        // Shuffle the deck
        Collections.shuffle(cards);
    }

    /**
     * This method is used to draw a card from the deck.
     *
     * @return Card drawn from the deck.
     */
    public Card drawCard() {
        return cards.pop();
    }

    /**
     * This method is used to check if the deck is empty.
     *
     * @return boolean value indicating if the deck is empty.
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }


    public String toString() {
        return "{" +
                "cards=" + cards +
                '}';
    }

    public void initializeDeck() {
    }

    public int size() {
        return 0;
    }
}