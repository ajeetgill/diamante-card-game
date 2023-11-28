import java.util.Objects;

/**
 * This class represents a HazardCard in the Diamant board game.
 * It extends the Card class, inheriting its properties and adding a hazardType property.
 */
public class HazardCard extends Card {

    // The type of hazard this card represents.
    private final String hazardType;

    /**
     * Constructor for the HazardCard class.
     *
     * @param hazardType The type of hazard this card represents.
     */
    public HazardCard(String hazardType) {

        this.hazardType = hazardType;
    }

    /**
     * Returns the type of hazard this card represents.
     *
     * @return The hazard type.
     */
    public String getHazardType() {
        return hazardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HazardCard)) return false;
        HazardCard that = (HazardCard) o;
        return Objects.equals(hazardType, that.hazardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hazardType);
    }

    @Override
    public String toString() {
        return "HazardCard{" +
                "hazardType='" + hazardType + '\'' +
                '}';
    }
    public void play();
}