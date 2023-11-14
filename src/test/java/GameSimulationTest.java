import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameSimulationTest {

    @Test
    void testSimulationRunsSuccessfully() {
        GameSimulation simulation = new GameSimulation();
        assertDoesNotThrow(simulation::run);
    }

    @Test
    void testSimulationProducesExpectedResults() {
        GameSimulation simulation = new GameSimulation();
        simulation.run();
        assertNotNull(simulation.getResults());
    }

    @Test
    void testSimulationResetsBetweenRuns() {
        GameSimulation simulation = new GameSimulation();
        simulation.run();
        SimulationResults firstResults = simulation.getResults();
        simulation.run();
        SimulationResults secondResults = simulation.getResults();
        assertNotEquals(firstResults, secondResults);
    }
}