/**
 * This is the Card class for the Diamant board game.
 * This class represents a card in the game.
 */
public abstract class Card {
    // two kind of cards: treasure and hazard
    public enum CardType {
        TREASURE,
        HAZARD
    }
    // The value of the card
    protected CardType type;

    public Card(CardType type) {
        this.type = type;
    }

    /**
     * This method returns the value of the card.
     * @return The value of the card.
     */
    public abstract CardType getCardType();
    public abstract String toString();

}