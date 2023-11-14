import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreasureCardTest {

    private TreasureCard treasureCard;

    @BeforeEach
    public void setUp() {
        treasureCard = new TreasureCard(5);
    }

    /**
     * Test to check the getTreasureValue method of the TreasureCard class.
     * The expected output is 5 as we set the treasure value to 5 in the setUp method.
     */
    @Test
    public void testGetTreasureValue() {
        assertEquals(5, treasureCard.getTreasureValue());
    }

    /**
     * Test to check the toString method of the TreasureCard class.
     * The expected output is "TreasureCard{value=5}" as we set the treasure value to 5 in the setUp method.
     */
    @Test
    public void testToString() {
        assertEquals("TreasureCard{value=5}", treasureCard.toString());
    }
}