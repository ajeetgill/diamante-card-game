import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTests {

    @Test
    public void testPlayerHasName() {
        Player p1 = new Player("Player__1", new AggressiveStrategy());
        assertEquals("Player__1", p1.name, "Player has name");
    }

    @Test
    public void testBothPlayersHaveSameName() {
        Player p1 = new Player("Player__1", new AggressiveStrategy());
        Player p2 = new Player("Player__1", new ConservativeStrategy());
        assertEquals(p2.name, p1.name, "Two players have same name");
    }

    @Test
    public void chestValueStartsWithZero() {
        Player p1 = new Player("Player__1", new AggressiveStrategy());
        assertEquals(0, p1.getChestValue(), "Initial chest value is zero");
    }

    @Test
    public void testToString() {
        final String expected = "Player__1', [🏧:0, 💎:0] , strategy=St:Aggressive";
        Player player = new Player("Player__1", new AggressiveStrategy());
        String result = player.toString();
        assertEquals(expected, result);
    }

    @Test
    public void testAddToChest() {
        Player player = new Player("Player__1", new AggressiveStrategy());
        player.addToChest(5);
        assertEquals(5, player.getChestValue());
    }

    @Test
    public void testPlayerCreation() {
        Player player = new Player("Player__1", new AggressiveStrategy());
        assertEquals("Player__1", player.name);
        assertEquals(0, player.getChestValue());
        assertEquals(0, player.caveRubies);
        assertTrue(player.strategy instanceof AggressiveStrategy);
    }

}
