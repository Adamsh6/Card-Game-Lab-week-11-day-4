import java.util.ArrayList;

public class Player {

    private int points;
    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.points = 0;
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoint() {
        this.points ++;
    }

    public void takeCard(Card card) {
        this.cards.add(card);
    }

    public Card getCard() {
        return this.cards.get(0);
    }

    public Card removeCard() {
        return this.cards.remove(0);
    }
}
