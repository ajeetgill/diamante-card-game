import java.util.ArrayList;
import java.util.List;

public class GameSimulation {

    private Game game;
    private List<Player> players;

    public GameSimulation() {
        this.game = new Game();
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        System.out.println("Adding player " + player.getName());
    }

    public void startGame() {
        for (Player player : players) {
            game.addPlayer(player);
        }
        game.start();
    }

    public void simulateRound() {
        game.playRound();
    }

    public void simulateGame() {
        while (!game.isGameOver()) {
            simulateRound();
        }
    }

    public Player getWinner() {
        return game.getWinner();
    }

    public List<Player> getPlayers() {
        return players;
    }
}