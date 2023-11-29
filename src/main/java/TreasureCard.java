import java.util.Random;

/**
 * This class represents a Treasure Card in the Diamant board game.
 * It extends the Card class, inheriting its properties and behaviors.
 */
public class TreasureCard extends Card {

    public TreasureCard(int i) {
    }

    public int getTreasureValue();

    // two kind of treasure cards: RUBY and DIAMOND
    public enum TREASURE_TYPE {
        RUBY,
        DIAMOND
    }

    public static final int RUBY_IN_DIAMOND = 5;
    
    private int numGems;
    private TREASURE_TYPE gemType;

    /**
     * Constructor for the TreasureCard class.
     * It randomly assigns a value to the treasure card.
     */
    public TreasureCard(TREASURE_TYPE gemType) {
        super(CardType.TREASURE);
        this.gemType = gemType;
        Random rand = new Random();
        this.numGems = rand.nextInt(15) + 1;
    }

    /**
     * This method returns the value of the treasure card.
     * @return int This returns the value of the treasure card.
     */
    public int getTotalValue() {
        if(this.gemType == TREASURE_TYPE.DIAMOND)
            return this.numGems * RUBY_IN_DIAMOND;
        else
            return this.numGems;
    }

    // get the gemtype
    public TREASURE_TYPE getGemType() {
        return this.gemType;
    }
    
    /**
     * This method returns the string representation of the treasure card.
     * @return String This returns the string representation of the treasure card.
     */
    @Override
    public String toString() {
        if (this.gemType == TREASURE_TYPE.DIAMOND)
            return "[💎" + this.numGems + ']';
        else
            return "[🏮" + this.numGems + ']';
    }

    @Override
    public CardType getCardType() {
        return Card.CardType.TREASURE;
    }
}