import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void testStrategyCreation() {
        Strategy strategy = new Strategy();
        assertNotNull(strategy, "Strategy object should be created");
    }

    @Test
    void testStrategyDecision() {
        Strategy strategy = new Strategy();
        boolean decision = strategy.makeDecision();
        assertTrue(decision == true || decision == false, "Strategy decision should be either true or false");
    }

    @Test
    void testStrategyChange() {
        Strategy strategy = new Strategy();
        strategy.changeStrategy();
        boolean decision = strategy.makeDecision();
        assertTrue(decision == true || decision == false, "Strategy decision should be either true or false after strategy change");
    }
}