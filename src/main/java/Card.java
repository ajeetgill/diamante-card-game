/**
 * This is the Card class for the Diamant board game.
 * This class represents a card in the game.
 */
public abstract class Card {
    public Card() {
    }

    public abstract String getName();

    public abstract int getHazardLevel();

    // two kind of cards: treasure and hazard
    public enum CardType {
        TREASURE,
        HAZARD
    }
    // The value of the card
    protected CardType type;
    protected int value;

    public Card(CardType type) {
        this.value =0;
        this.type = type;
    }

    /**
     * This method returns the value of the card.
     * @return The value of the card.
     */
    public abstract CardType getCardType();
    public abstract String toString();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}