import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HazardCardTest {

    /**
     * Test to check if the HazardCard constructor works correctly.
     */
    @Test
    void testConstructor() {
        HazardCard card = new HazardCard("Snake", 5);
        assertEquals("Snake", card.getName());
        assertEquals(5, card.getHazardLevel());
    }

    /**
     * Test to check if the getName method works correctly.
     */
    @Test
    void testGetName() {
        HazardCard card = new HazardCard("Snake", 5);
        assertEquals("Snake", card.getName());
    }

    /**
     * Test to check if the getHazardLevel method works correctly.
     */
    @Test
    void testGetHazardLevel() {
        HazardCard card = new HazardCard("Snake", 5);
        assertEquals(5, card.getHazardLevel());
    }
}