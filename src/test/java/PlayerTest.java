import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
        player = new Player("John");
    }

    @Test
    public void playerHasNoCards() {
        assertEquals(0, player.countCards());
    }

    @Test
    public void pointsStartAtZero(){
        assertEquals(0, player.getPoints());
    }

    @Test
    public void incrementPoints() {
        player.addPoint();
        assertEquals(1,player.getPoints());
    }

    @Test
    public void playerGetsACard() {
        Card card = new Card(SuitType.HEARTS, RankType.QUEEN);
        player.takeCard(card);
        assertEquals(1, player.countCards());
    }

    @Test
    public void getCards() {
        Card card = new Card(SuitType.HEARTS, RankType.QUEEN);
        player.takeCard(card);
        assertEquals(card, player.getCard());
    }

    @Test
    public void removeAPlayersCard() {
        Card card = new Card(SuitType.HEARTS, RankType.QUEEN);
        player.takeCard(card);
        assertEquals(card, player.removeCard());
        assertEquals(0, player.countCards());
    }
}
