import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTests {

    @Test
    public void testCardTypeHazard() {
        String h = "HAZARD";
        assertEquals(h, Card.CardType.HAZARD.toString());
    }

    @Test
    public void testCardTypeTreasure() {
        String t = "TREASURE";
        assertEquals(t, Card.CardType.TREASURE.toString());
    }

    @Test
    public void testCardTypeHazardValue() {
        Card h = new HazardCard(HazardCard.HAZARD_TYPES.SNAKE);
        assertEquals(h.type(), Card.CardType.HAZARD);
    }

    @Test
    public void testCardTypeTreasureValue() {
        Card t = new TreasureCard(TreasureCard.TREASURE_TYPE.RUBY);
        assertEquals(t.type(), Card.CardType.TREASURE);
    }

}
