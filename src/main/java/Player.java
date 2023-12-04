public class Player {
    final public String name;
    final public Strategy strategy;
    private int chestValue;
    public int caveRubies;

    public Player(String name, Strategy strategy) {
        caveRubies = 0;
        this.name = name;
        this.chestValue = 0;
        this.strategy = strategy;
    }

    // return totals gems in chest
    public int getChestValue() {
        return chestValue;
    }

    void addToChest(int gemsInChest) {
        this.chestValue += gemsInChest;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", [🏧:" + chestValue +
                ", 💎:" + caveRubies +
                "] , strategy=" + strategy;

    }
}