import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt, Dealt;

    public Deck(String[] ranks, String[] suits, int[] values) {
        this.unDealt = new ArrayList<>();
        for (int i = 0; i < ranks.length; i++) {
            unDealt.add(new Card(ranks[i], suits[i], values[i]));
        }
    }

    public boolean isEmpty() {
        return unDealt.size() == 0;
    }

    public int size() {
        return unDealt.size();
    }

    public Card deal() {
        Card card = unDealt.remove(unDealt.size() - 1);
        Dealt.add(card);
        return card;
    }

    public void shuffle() {
        for (int k = 51; k > 0; k--) {
            int r = (int)(Math.random() * (k + 1));
            Card temp = unDealt.get(k);
            
        }
    }
}
