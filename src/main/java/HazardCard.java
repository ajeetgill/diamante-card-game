import java.util.Objects;

/**
 * This class represents a HazardCard in the Diamant board game.
 * It extends the Card class, inheriting its properties and adding a hazardType property.
 */
public class HazardCard extends Card {

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
    public HAZARD_TYPES getHazardType() {
        return this.hazardType;
    }

    @Override
    public String toString() {
        // prints an appropriate matching emoji for each hazard type
        return switch (this.hazardType) {
            case SNAKE -> "\uD83D\uDC0D";
            case SPIDER -> "\uD83D\uDC1B";
            case ROCKSLIDE -> "❌";
            default -> "❌";
        };

    }

    @Override
    public CardType type() {
        return CardType.HAZARD;
    }

}