import java.util.Random;

/**
 * This class represents a Treasure Card in the Diamant board game.
 * It extends the Card class, inheriting its properties and behaviors.
 */
public class TreasureCard extends Card {

    /**
     * Enum for the types of GEMS/Treasure in the game.
     * Currently only RUBY is supported.
     * More gems can be added in the future. like Diamond Or more others to make the game more interesting.
     */
    public enum TREASURE_TYPE {
        RUBY
    }

    private int numRubies;
    final private TREASURE_TYPE gemType;

    /**
     * Default Constructor with GemType RUBY
     * It randomly assigns a value to the treasure card.
     */
    public TreasureCard() {
        super(CardType.TREASURE);
        this.gemType = TREASURE_TYPE.RUBY;
        Random rand = new Random();
        this.numRubies = rand.nextInt(15) + 1;
    }

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

    /**
     * This method sets the value of the treasure card.
     *
     * @param remainderRubies the new value of the treasure card
     */
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