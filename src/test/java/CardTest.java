import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);

    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenHasAValueTen() {
        assertEquals(10, card.getValueFromEnum());
    }

    //    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heearts");
//        assertEquals("Heearts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }

}
