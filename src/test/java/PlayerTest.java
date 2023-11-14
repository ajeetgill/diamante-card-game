import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testPlayerCreation() {
        Player player = new Player("John");
        assertEquals("John", player.getName());
    }

    @Test
    void testPlayerScore() {
        Player player = new Player("John");
        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    void testPlayerDecision() {
        Player player = new Player("John");
        player.setDecision(true);
        assertTrue(player.getDecision());
    }

    @Test
    void testPlayerReset() {
        Player player = new Player("John");
        player.addScore(10);
        player.setDecision(true);
        player.reset();
        assertEquals(0, player.getScore());
        assertFalse(player.getDecision());
    }
}