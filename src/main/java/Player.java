public class Player {
    private String name;
    private int score;
    private Strategy strategy;

    public Player(String name, Strategy strategy) {
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
    public Strategy getStrategy() {
        return strategy;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}