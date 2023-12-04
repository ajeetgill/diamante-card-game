import java.util.ArrayList;

/**
 * This class represents the Diamant board game.
 */
public class Game {

    final private ArrayList<Player> players;
    private ArrayList<Player> activPlayers;
    public ArrayList<Card> currentPath;
    final private Deck deck;
    private int round;
    final private int TOTAL_ROUNDS = 1;
    private Card currentCard;
    private Card cardDrawn;
    /**
     * Constructor for the Game class.
     * @param players The list of players participating in the game.
     */
    public Game(ArrayList<Player> players) {
        this.players = players;
        this.round = 0;
        this.deck = new Deck();
    }

    /**
     * This method starts the game and controls the game flow.
     */
    public void start() {
        while (round < TOTAL_ROUNDS) {
            playRound();
            round++;
        }
    }

    /**
     * This method represents a round in the game.
     */
    private void playRound() {
        // Logic for playing a round
        // 1. Draw a card from the deck
        this.activPlayers = new ArrayList<Player>(players);
        this.currentPath = new ArrayList<>();

        currentCard = deck.drawCard();
        cardDrawn = deck.drawCard();
        System.out.println("Drawn card: " + currentCard.toString());
        if(currentCard.getCardType().equals(Card.CardType.TREASURE)) {
            TreasureCard card = (TreasureCard) currentCard;
            // get the ruby value of the card, and split it equally among the players and save the remainder in a variable
            distributeRubies(card);
            currentPath.add(card);
        } else if(currentCard.getCardType().equals(Card.CardType.HAZARD)){
            HazardCard card = (HazardCard) currentCard;
            currentPath.add(card);
        }
        // 2. After a card is drawn - ask each Player to decide to continue or exit
        // whoevers exits, remove them from the active players list
        // show that players has left the expedition
        // working your way back to the camp, leaving-players collects the rubies on the way and split equally and the remainder is left in the cave


        // 3. A round is over
        // - all players exit
        // - 2 Identical Hazard cards are drawn


        // print current game status
        System.out.println(this.toString());

    }

    public boolean kickFromRound(Player player) {
        player.currentRoundRubies = 0;
        activPlayers.remove(player);
        return true;
    }

    /**
     * This method represents a player's turn in the game.
     * @param player The player whose turn it is.
     */
    private void playTurn(Player player) {
        // Logic for playing a turn
    }

    /**
     * This method checks if the game is over.
     * @return True if the game is over, false otherwise.
     */
    private boolean isGameOver() {
        // Logic for checking if the game is over
        return false;
    }

    /**
     * This method determines the winner of the game.
     * @return The player who won the game.
     */
    private Player determineWinner() {
        // Logic for determining the winner
        return null;
    }

    /**
     * change the gemsInChest of the player
     */
    private void changeGemsInChest(Player player, int gems) {
    }

    public void distributeRubies(TreasureCard card) {
        int rubyValue = card.getRubies();
        int remainder = rubyValue % activPlayers.size();

        int rubiesToSplitEqually = rubyValue / activPlayers.size();
        for (Player p : activPlayers) {
            p.currentRoundRubies += rubiesToSplitEqually;
        }
        card.setRubies(remainder);
    }

    public String toString() {
        String result = "================1=====================\n";
        result += "GAME STATUS\n";
        result += "Round: " + round + "\n";
        result += "Active Players in round: \n";
        for (Player player : activPlayers) {
            result += player.toString() + "\n";
        }
        result += deck.toString();
        result += "\n";

        if(cardDrawn != null) {
            result += "Drawn Card: " + cardDrawn.toString();
            result += "\n";
        }
        if(currentCard != null) {
            result += "Current Card: " + currentCard.toString();
            result += "\n";
        }
        if(currentPath != null) {
            result += "Current Path: " + currentPath.toString();
            result += "\n";
        }

        result += "=================2====================\n";
        return result;
    }


}
/**
 * Components in the game:

 * - Deck
 *      - TreasureCard
 *      - HazardCard / TrapCard
 *      - Relic Cards
 * - Board
 * - Decision cards - EXIT & CONTINUE
 *
 * - Player
 *     - Name
 *     - Strategy
 *     - GemsInChest
 *
 * - Rubies
 * - Barricade Tiles
 */