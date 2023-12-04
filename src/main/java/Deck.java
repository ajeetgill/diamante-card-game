import java.util.Collections;
import java.util.Stack;


/**
 * This class represents the deck of cards used in the Diamant board game.
 * It uses the Stack data structure from Java Collections Framework to simulate a deck of cards.
 */
public class Deck {
    private Stack<Card> cards;
    final private int TOTAL_TREASURE_CARDS = 20;

    //    each iteration adds 2 snakes, 2 spiders, 2 rockslides, to maintain even number of hazard cards and maintain , so there's always a chance of a hazard-card-pair being drawn
    final private int TOTAL_HAZARD_CARD_ITERATION = 1;

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
        for (int i = 0; i < TOTAL_HAZARD_CARD_ITERATION; i++) {
//            each iteration adds 2 snakes, 2 spiders, 2 rockslides, to maintain even number of hazard cards and maintain , so there's always a chance of a hazard-card-pair being drawn
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SNAKE));
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SNAKE));
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SPIDER));
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.SPIDER));
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.ROCKSLIDE));
            cards.push(new HazardCard(HazardCard.HAZARD_TYPES.ROCKSLIDE));
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
        return
                "CARDS :" + cards;
    }

    public void initializeDeck() {
    }

    public int size() {
        return 0;
    }
}