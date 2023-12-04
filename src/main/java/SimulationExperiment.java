import java.util.ArrayList;

public class SimulationExperiment {

    public static void main(String[] args) {
        // Create a list of players
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Player1", "new AggressiveStrategy()");
        Player player2 = new Player("Player2", "new ConservativeStrategy()");
        Player player3 = new Player("Player3", "new ReactionaryStrategy()");
        players.add(player1);
        players.add(player2);
        players.add(player3);

        // Create a new game with the players
        Game game = new Game(players);
        System.out.println("Starting game...");
        game.start();
        System.out.println("Game over!");

        // Create a new game simulation with the game
        // GameSimulation gameSimulation = new GameSimulation(game);

        // Run the simulation
        // gameSimulation.run();

        // Print the results
        // gameSimulation.printResults();
    }
}