import java.util.Random;

/**
 * This class represents a Treasure Card in the Diamant board game.
 * It extends the Card class, inheriting its properties and behaviors.
 */
public class TreasureCard extends Card {

    // two kind of treasure cards: RUBY and DIAMOND
    public enum TREASURE_TYPE {
        RUBY
    }

    public static final int RUBY_IN_DIAMOND = 5;

    private int numRubies;
    final private TREASURE_TYPE gemType;

    /**
     * Constructor for the TreasureCard class.
     * It randomly assigns a value to the treasure card.
     */
    public TreasureCard(TREASURE_TYPE gemType) {
        super(CardType.TREASURE);
        this.gemType = gemType;
        Random rand = new Random();
        this.numRubies = rand.nextInt(15) + 1;
    }

    /**
     * This method returns the value of the treasure card.
     *
     * @return int This returns the value of the treasure card.
     */
    public int getRubies() {
        return this.numRubies;
    }

    public void setRubies(int remainderRubies) {
        this.numRubies = remainderRubies;
    }


    /**
     * This method returns the string representation of the treasure card.
     *
     * @return String This returns the string representation of the treasure card.
     */
    @Override
    public String toString() {
        return "" + this.numRubies;
    }

    @Override
    public CardType type() {
        return Card.CardType.TREASURE;
    }
}