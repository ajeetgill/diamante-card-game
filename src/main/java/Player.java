public class Player {
    final public String name;
    private String strategy;
    private int chestValue;
    public int caveRubies;

    public Player(String name, String strategy) {
        caveRubies = 0;
        this.name = name;
        this.chestValue = 0;
        this.strategy = strategy;
    }

    // return totals gems in chest
    public int getChestValue() {
        return chestValue;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    void addToChest(int gemsInChest) {
        this.chestValue = gemsInChest;
    }

    boolean wantsToLeave() {
        return false;
    }

    @Override
    public String toString() {
        return "{" + name + '\'' +
                ", [🏧:" + chestValue +
                ", 💎:" + caveRubies +
                "] , strategy=" + strategy +
                '}';

    }
}