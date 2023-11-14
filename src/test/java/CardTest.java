import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    private Card card;

    @BeforeEach
    void setUp() {
        card = new Card();
    }

    @Test
    void testCardCreation() {
        assertNotNull(card, "Card object should be created.");
    }

    // This test will fail until the Card class is implemented
    @Test
    void testCardValue() {
        assertEquals(0, card.getValue(), "Initial card value should be 0.");
    }

    // This test will fail until the Card class is implemented
    @Test
    void testSetValue() {
        card.setValue(5);
        assertEquals(5, card.getValue(), "Card value should be set to 5.");
    }

    // This test will fail until the Card class is implemented
    @Test
    void testNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> card.setValue(-1), "Card value should not be negative.");
    }
}