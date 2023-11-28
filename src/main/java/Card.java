/**
 * This is the Card class for the Diamant board game.
 * This class represents a card in the game.
 */
public abstract class Card {
    // The value of the card
    protected int value;

    /**
     * Constructor for the Card class.
     * @param value The value of the card.
     */
    public Card(int value) {
        this.value = value;
    }

    /**
     * This method returns the value of the card.
     * @return The value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * This method sets the value of the card.
     * @param value The value to set.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * This method is to be implemented by subclasses to define the card's behavior.
     */
    public Card(){}
    public abstract void play();
}