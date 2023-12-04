import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HazardCardTests {

    @Test
    public void testHazardTypeSnake() {
        String s = "SNAKE";
        assertEquals(s, HazardCard.HAZARD_TYPES.SNAKE.toString());
    }

    @Test
    public void testHazardTypeSpider() {
        String s = "SPIDER";
        assertEquals(s, HazardCard.HAZARD_TYPES.SPIDER.toString());
    }

    @Test
    public void testHazardTypeRockslide() {
        String s = "ROCKSLIDE";
        assertEquals(s, HazardCard.HAZARD_TYPES.ROCKSLIDE.toString());
    }

    @Test
    public void testCardCreationHazard() {
        // using loop test for each type in ENUM hazard types
        for (HazardCard.HAZARD_TYPES type : HazardCard.HAZARD_TYPES.values()) {
            HazardCard card = new HazardCard(type);
            assertEquals(type, card.getHazardType(), "Card type not set properly");
        }
    }

}
