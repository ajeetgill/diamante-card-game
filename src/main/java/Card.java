/**
 * This is the Card class for the Diamant board game.
 * This class represents a card in the game.
 */
public abstract class Card {
    /**
     * Enum for the types of cards.
     * two kind of cards: treasure and hazard
     */
    public enum CardType {
        TREASURE,
        HAZARD
    }

    /**
     * Returns the type of the card.
     *
     * @return the type of the card
     */
    protected CardType type;

    public Card(CardType type) {
        this.type = type;
    }

    /**
     * This method returns the value of the card.
     *
     * @return The value of the card.
     */
    public abstract CardType type();

    /**
     * Returns a string representation of the card.
     *
     * @return a string representation of the card
     */
    public abstract String toString();

}