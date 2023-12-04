import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreasureCardTests {
    
    Card card = new TreasureCard();

    @Test
    public void testCardCreationTreasure() {
            assertEquals(card instanceof TreasureCard , card.type().equals(Card.CardType.TREASURE), "Default Constructor Treasure Card type not set properly");
    }

    @Test
    public void testOverloadedConstructorTreasureCard() {
        Card c = new TreasureCard(TreasureCard.TREASURE_TYPE.RUBY);
            assertEquals(c instanceof TreasureCard , c.type().equals(Card.CardType.TREASURE), "Overloaded Conostructs Treasure Card type not set properly");
    }

    // test rubies
    @Test
    public void testSetRubies() {
        TreasureCard tc = new TreasureCard();
        tc.setRubies(5);
        assertEquals(5, tc.getRubies(), "Set Rubies not working properly");
    }

    //test type()
    @Test
    public void testType() {
        TreasureCard tc = new TreasureCard();
        assertEquals(Card.CardType.TREASURE, tc.type(), "Type not working properly");
    }

}
