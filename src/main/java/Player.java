public class Player {
    final public String name;
    private String strategy;
    private int chestValue;
    public int currentRoundRubies;

    public Player(String name, String strategy) {
        currentRoundRubies = 0;
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

    @Override
    public String toString() {
        return "{"+ name + '\'' +
                ", [🏧:" + chestValue +
                ", 💎:" + currentRoundRubies +
                "] , strategy=" + strategy +
                '}';

    }
}