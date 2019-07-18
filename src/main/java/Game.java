import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(ArrayList<Player> players) {
        this.players = players;
        this.deck = new Deck();
        this.deck.setUpCards();
        this.deck.shuffle();
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCards() {
        for(Player player: this.players){
            Card card = this.deck.dealCard();
            player.takeCard(card);
        }
    }

    public Player checkRoundWinner() {
        Player currentHighest = this.players.get(0);
        for(int i = 1 ; i < this.players.size(); i++){
            Player player = this.players.get(i);
            if (currentHighest.getCard().getValueFromEnum() < player.getCard().getValueFromEnum()){
                currentHighest = player;
            }
        }
        currentHighest.addPoint();
        return currentHighest;
    }

    public void returnCards() {
        for(Player player : this.players){
            Card card = player.removeCard();
            this.deck.addCard(card);
        }
    }

    public void runRound() {
        dealCards();
        checkRoundWinner();
        returnCards();
        this.deck.shuffle();
    }

    public Player checkGameWinner() {
        Player currentHighest = this.players.get(0);
        for(int i = 1 ; i < this.players.size(); i++){
            Player player = this.players.get(i);
            if (currentHighest.getPoints() < player.getPoints()){
                currentHighest = player;
            }
        }
        return currentHighest;
    }
}
