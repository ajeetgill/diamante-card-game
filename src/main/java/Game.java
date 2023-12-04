import java.util.ArrayList;

/**
 * This class represents the Diamant board game.
 */
public class Game {

    final private ArrayList<Player> players;
    private ArrayList<Player> activePlayers;
    public ArrayList<Card> currentPath;
    private Deck deck;
    private int cave;

    private Card currentCard;
    private Card cardDrawn;

    /**
     * Constructor for the Game class.
     *
     * @param players The list of players participating in the game.
     */
    public Game(ArrayList<Player> players) {
        this.players = players;
        this.cave = 0;
        this.deck = new Deck();
    }

    /**
     * This method starts the game and controls the game flow.
     */
    public void start() {
        final int TOTAL_CAVES = 1;
        while (cave < TOTAL_CAVES) {
            this.activePlayers = new ArrayList<Player>(players);
            this.currentPath = new ArrayList<>();
            this.deck = new Deck();
            System.out.println("Starting Deck: " + deck);
            enterCave();
            cave++;
        }
    }

    /**
     * Logic for playing a round/cave
     * 1. Draw a card
     * 2. reveal drawnCard
     * - if HAZARD : drawnCard
     * -----> ❌endCave if: it's the second card of it's type in the current path
     * -----> else : do nothing
     * <p>
     * - if TREASURE : drawnCard
     * -----> distribute rubies
     * <p>
     * 3. Add drawnCard to currentPath
     * 4. Ask players if they want to leave
     * <p>
     * This method represents a cave in the game.
     */
    private void enterCave() {
        boolean isCaveClosed = false;
        do {
            currentCard = deck.drawCard();
            if (currentCard instanceof TreasureCard tCard) {
                cardDrawn = new TreasureCard(TreasureCard.TREASURE_TYPE.RUBY);
                ((TreasureCard) cardDrawn).setRubies(tCard.getRubies());
            } else {
                cardDrawn = new HazardCard(HazardCard.HAZARD_TYPES.SNAKE);
            }
            //  System.out.println("Drawn card: " + currentCard.toString());
            isCaveClosed = isCaveFinished(currentCard);
            currentPath.add(currentCard);
            if (isCaveClosed) {
                System.out.println(cave + " :Cave is over");
                return;
            } else {
                if (currentCard instanceof TreasureCard tCard) {
                    distributeRubies(tCard);
                }

                kickPlayersWantingToLeave();
                System.out.println(this.toString());
            }
        } while (!isCaveClosed);
    }

    /**
     * This method kicks players who want to leave the game and removes them from the active players list.
     */
    private void kickPlayersWantingToLeave() {
        if (currentPath.size() <= 2) return;
        if (activePlayers.isEmpty()) return;
        ArrayList<Player> playersToRemove = new ArrayList<>();
        for (Player player : activePlayers) {
            if (player.strategy.decide()) {
                playersToRemove.add(player);
            }
        }
        if (!playersToRemove.isEmpty()) {
            System.out.println("Players leaving: " + playersToRemove.toString());
            for (Player p : playersToRemove) {
                p.addToChest(p.caveRubies);
                p.caveRubies = 0;
            }
            for (Card c : currentPath) {
                if (c instanceof TreasureCard tCard) {
                    distributeRubiesOnCaveExit(tCard, playersToRemove);
                }
            }
        }
        activePlayers.removeAll(playersToRemove);
    }

    /**
     * This method determines the winner of the game.
     * In case of a tie, the player who entered the cave first wins.
     *
     * @return The player who won the game.
     */
    private Player determineWinner() {
        Player winner = null;
        int max = 0;
        for (Player p : players) {
            if (p.getChestValue() > max) {
                max = p.getChestValue();
                winner = p;
            }
        }
        return winner;
    }

    /**
     * When a treasure card is drawn, this method distributes the rubies to the players.
     *
     * @param card The treasure card that was drawn.
     */
    public void distributeRubies(TreasureCard card) {
        int rubyValue = card.getRubies();
        int remainder = rubyValue % activePlayers.size();

        int rubiesToSplitEqually = rubyValue / activePlayers.size();
        for (Player p : activePlayers) {
            p.caveRubies += rubiesToSplitEqually;
        }
        card.setRubies(remainder);
    }

    /**
     * (exit cave) : Function which finishes the round if requirements are met
     * if round is finished - returns true
     * else return false
     *
     * @return isFinished : boolean
     */
    public boolean isCaveFinished(Card lastDrawnCard) {
        boolean exitByTrap = hasTwoSameTrapCards(lastDrawnCard, currentPath);
        boolean roundHasEnded = exitByTrap || activePlayers.isEmpty() || deck.isEmpty();
        if (roundHasEnded) {
            if (exitByTrap) {
                System.out.println("Two identical hazard cards drawn" + lastDrawnCard.toString());
            } else if (deck.isEmpty()) {
                System.out.println("??? - Ending Cave : Deck is empty");
            }
            for (Player p : players) {
                p.caveRubies = 0;
            }
        }
        return roundHasEnded;
    }

    /**
     * Function which checks if the last drawn card is a trap card and if there are two of the same trap cards in the current path
     *
     * @param lastDrawnCard : Card representing the last drawn card
     * @return hasTwo : boolean describing if there are two of the same trap cards in the current path
     */
    private boolean hasTwoSameTrapCards(Card lastDrawnCard, ArrayList<Card> pathToCheck) {
        if (pathToCheck == null || pathToCheck.isEmpty()) return false;

        System.out.println("lastDrawn is HazardCard: " + (lastDrawnCard instanceof HazardCard));
        boolean hasTwo = false;
        if (lastDrawnCard instanceof HazardCard lastCard) {

            for (Card c : pathToCheck) {
                if (c instanceof HazardCard h) {
//                    HazardCard h = (HazardCard) c;
                    if (h.getHazardType().equals(lastCard.getHazardType())) {
                        hasTwo = true;
                        break;
                    }
                }
            }
        }
        return hasTwo;
    }


    /**
     * When players decide to leave a cave, this method distributes the rubies to the players which were left in the path of Cave
     *
     * @param card The treasure card that was drawn.
     */
    public void distributeRubiesOnCaveExit(TreasureCard card, ArrayList<Player> playersToDistribute) {
        int rubyValue = card.getRubies();
        int remainder = rubyValue % playersToDistribute.size();

        int rubiesToSplitEqually = rubyValue / playersToDistribute.size();
        for (Player p : playersToDistribute) {
            p.addToChest(rubiesToSplitEqually);
        }
        card.setRubies(remainder);
    }

    public String getStatusOfPlayers() {
        Player winner = determineWinner();
        StringBuilder result = new StringBuilder("===============RESULT================\n");
        result.append("🏆Winner : ").append(winner);
        result.append("\n");
        result.append("All Players: \n");
        for (Player p : players) {
            result.append(p).append("\n");
        }
        result.append("=================2====================\n");
        return result.toString();
    }

    public String toString() {
        StringBuilder result = new StringBuilder("================1=====================\n");
        result.append("GAME STATUS\n");
        result.append("Cave: #").append(cave).append("\n");
//        result.append("Active players in Cave: \n");
//        for (Player player : activePlayers) {
//            result.append(player.toString()).append("\n");
//        }
        if (deck != null) {
            result.append(deck.toString());
            result.append("\n");
        }

        if (cardDrawn != null) {
            result.append("Drawn Card: ").append(cardDrawn.toString());
            result.append("\n");
        }
        if (currentCard != null) {
            result.append("Current Card: ").append(currentCard.toString());
            result.append("\n");
        }
        if (currentPath != null) {
            result.append("Current Path: ").append(currentPath.toString());
            result.append("\n");
        }

        result.append("=================2====================\n");
        return result.toString();
    }


}
/*
  Components in the game:

  - Deck
       - TreasureCard
       - HazardCard / TrapCard
       - Relic Cards
  - Board
  - Decision cards - EXIT & CONTINUE

  - Player
      - Name
      - Strategy
      - GemsInChest

  - Rubies
  - Barricade Tiles
 */