import java.util.Random;

/**
 * This class represents a Treasure Card in the Diamant board game.
 * It extends the Card class, inheriting its properties and behaviors.
 */
public class TreasureCard extends Card {

    private int value;

    /**
     * Constructor for the TreasureCard class.
     * It randomly assigns a value to the treasure card.
     */
    public TreasureCard() {
        Random rand = new Random();
        this.value = rand.nextInt(15) + 1;
    }

    @Override
    public void play() {
        System.out.println("💎💎💎 Treasure Card Played");
    }

    /**
     * This method returns the value of the treasure card.
     * @return int This returns the value of the treasure card.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * This method sets the value of the treasure card.
     * @param value This is the new value of the treasure card.
     */
    public void setValue(int value) {
        this.value = value;
    }
}