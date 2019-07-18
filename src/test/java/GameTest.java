import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1;
    Player player2;
    Game game;

    @Before
    public void setUp() {
        player1 = new Player("John");
        player2 = new Player("Jim");
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players);
    }

    @Test
    public void canCardsBeDealt() {
        game.dealCards();
        assertEquals(1, player1.countCards());
        assertEquals(1, player2.countCards());
    }

    @Test
    public void checkRoundWinnerP1Win() {
        Card card1 = new Card(SuitType.HEARTS, RankType.QUEEN);
        player1.takeCard(card1);
        Card card2 = new Card(SuitType.HEARTS, RankType.THREE);
        player2.takeCard(card2);
        assertEquals(player1, game.checkRoundWinner());
        assertEquals(1, player1.getPoints());
        assertEquals(0, player2.getPoints());
    }

    @Test
    public void checkRoundWinnerP2Win() {
        Card card1 = new Card(SuitType.HEARTS, RankType.THREE);
        player1.takeCard(card1);
        Card card2 = new Card(SuitType.HEARTS, RankType.QUEEN);
        player2.takeCard(card2);
        assertEquals(player2, game.checkRoundWinner());
        assertEquals(0, player1.getPoints());
        assertEquals(1, player2.getPoints());
    }
}
