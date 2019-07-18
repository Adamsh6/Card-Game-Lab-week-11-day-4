import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void isTheDeckEmpty() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void deckHas52Cards() {
        deck.setUpCards();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void doesIncludeTheAceHeartsAtPosition0() {
        deck.setUpCards();
        assertEquals(SuitType.HEARTS, deck.getCards().get(0).getSuit());
        assertEquals(RankType.ACE, deck.getCards().get(0).getRank());
    }

    @Test
    public void doesIncludeTheKingOfClubsAtPosition51() {
        deck.setUpCards();
        assertEquals(SuitType.CLUBS, deck.getCards().get(51).getSuit());
        assertEquals(RankType.KING, deck.getCards().get(51).getRank());
    }

    @Test
    public void canDealCard() {
        deck.setUpCards();
        Card card = deck.getCards().get(51);
        assertEquals(card, deck.dealCard());
        assertEquals(51, deck.countCards());
    }
}
