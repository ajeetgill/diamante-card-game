import java.util.Objects;

/**
 * This class represents a HazardCard in the Diamant board game.
 * It extends the Card class, inheriting its properties and adding a hazardType property.
 */
public class HazardCard extends Card {

    public HazardCard( HAZARD_TYPES hazardType) {
        super();
    }

    // ENUM of hazards in the game
    public enum HAZARD_TYPES {
        SNAKE,
        SPIDER,
        ROCKSLIDE
    }

    private HAZARD_TYPES hazardType;

    /**
     * Constructor for the HazardCard class.
     *
     * @param hazardType The type of hazard this card represents.
     */
    public HazardCard(HAZARD_TYPES hazardType) {
        super(CardType.HAZARD);
        this.hazardType = hazardType;
    }

    /**
     * Returns the type of hazard this card represents.
     *
     * @return The hazard type.
     */
    public String getHazardType() {
        return this.hazardType.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HazardCard)) return false;
        HazardCard that = (HazardCard) o;
        return Objects.equals(hazardType, that.hazardType);
    }

    @Override
    public String toString() {
        // prints an appropriate matching emoji for each hazard type
        switch (this.hazardType) {
            case SNAKE:
                return "[\uD83D\uDC0D]";
            case SPIDER:
                return "[\uD83D\uDC1B]";
            case ROCKSLIDE:
                return "[\uD83D\uDEA8]";
            default:
                return "❌";
        }

    }

    public CardType getCardType() {
        return CardType.HAZARD;
    }
    
}