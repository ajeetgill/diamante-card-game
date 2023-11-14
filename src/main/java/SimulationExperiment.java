import java.util.ArrayList;
import java.util.List;

public class SimulationExperiment {

    public static void main(String[] args) {
        // Create a list of players
        List<Player> players = new ArrayList<>();
        players.add(new Player("Player1", new AggressiveStrategy()));
        players.add(new Player("Player2", new ConservativeStrategy()));

        // Create a new game with the players
        Game game = new Game(players);

        // Create a new game simulation with the game
        GameSimulation gameSimulation = new GameSimulation(game);

        // Run the simulation
        gameSimulation.run();

        // Print the results
        gameSimulation.printResults();
    }
}