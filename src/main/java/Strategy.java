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
     *
     * @return a boolean value indicating whether to continue exploring or not.
     */
    abstract boolean decide();
}
class AggressiveStrategy extends Strategy {
    @Override
    boolean decide() {
        return true; // Always continue exploring
    }
}

class ConservativeStrategy extends Strategy {
    @Override
    boolean decide() {
        return random.nextBoolean(); // Continue exploring randomly using the inherited random object
    }
}

class ReactionaryStrategy extends Strategy {
    @Override
    boolean decide() {
        double randomNumber = random.nextDouble();
        return randomNumber <= 0.25; // 25% chance of continuing exploring
    }
}

class CautiousStrategy extends Strategy {
    @Override
    boolean decide() {
        return false; // Never continue exploring
    }
}
