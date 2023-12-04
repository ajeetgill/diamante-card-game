/**
 * This class represents a HazardCard in the Diamant board game.
 * It extends the Card class, inheriting its properties and adding a hazardType property.
 */
public class HazardCard extends Card {

     /**
     * Enum for the types of hazards in the game.
     */
    public enum HAZARD_TYPES {
        SNAKE,
        SPIDER,
        ROCKSLIDE
    }

    private HAZARD_TYPES hazardType;

    /**
     * Constructs a new HazardCard with the given hazard type.
     *
     * @param hazardType the type of hazard this card represents
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

     /**
     * Returns a string representation of the hazard card.
     * The string contains an appropriate matching emoji for each hazard type.
     *
     * @return a string representation of the hazard card
     */
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

    /**
     * Returns the type of the CARD - not same as hazard type.
     *
     * @return the type of the card
     */
    @Override
    public CardType type() {
        return CardType.HAZARD;
    }

}