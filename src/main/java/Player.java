/**
 * Represents a player in the game.
 */
public class Player {
    final public String name;
    final public Strategy strategy;
    private int chestValue;
    public int caveRubies;

    /**
     * Constructs a new Player with the given name and strategy.
     *
     * @param name     name of the player
     * @param strategy strategy of the player
     */
    public Player(String name, Strategy strategy) {
        caveRubies = 0;
        this.name = name;
        this.chestValue = 0;
        this.strategy = strategy;
    }

    /**
     * Returns the total gems in the player's chest.
     *
     * @return the total gems in the chest
     */
    public int getChestValue() {
        return chestValue;
    }

    /**
     * Adds the specified number of gems to the player's chest.
     * Which saves the player's chest value.
     *
     * @param gemsInChest the number of gems to add to the chest
     */
    void addToChest(int gemsInChest) {
        if (gemsInChest < 0) gemsInChest = 0;
        this.chestValue += gemsInChest;
    }


    /**
     * Returns a string representation of the player.
     *
     * @return a string representation of the player: name, chest value, cave rubies, and strategy
     */
    @Override
    public String toString() {
        return name + '\'' +
                ", [🏧:" + chestValue +
                ", 💎:" + caveRubies +
                "] , strategy=" + strategy;

    }
}