public class Player {
    private String name;
    private int score;
    private String strategy;
    // private Strategy strategy;
    // @todo : correct the type of Strategy

    // public Player(String name, Strategy strategy) {
    public Player(String name, String strategy) {
        this.name = name;
        this.score = 0;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    // public Strategy getStrategy() {
    public String getStrategy() {
        return strategy;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    // public void setStrategy(Strategy strategy) {
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}