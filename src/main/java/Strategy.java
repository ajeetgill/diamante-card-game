import java.util.Random;

/**
 * This is an abstract class that represents a strategy that a player can use in the game.
 * It provides a method for deciding whether to continue exploring or not.
 */
public abstract class Strategy {

    protected Random random;

    /**
     * Constructor for the Strategy class.
     */
    public Strategy() {

        this.random = new Random();
    }

    /**
     * This method should be overridden by subclasses to provide a specific strategy.
     * @return a boolean value indicating whether to continue exploring or not.
     */
    public abstract boolean decide();
    public AgressiveStrategy(){
        super();
    }
    public boolean decide(){
        return true;
    }
    public ConservativeStrategy(){
        super();
    }
}