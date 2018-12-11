import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt, dealt;

    public Deck(String[] ranks, String[] suits, int[] values) {
        this.dealt = new ArrayList<>();
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
        if (unDealt.size() == 0)
            return null;
        Card card = unDealt.remove(0);
        dealt.add(card);
        return card;
    }

    public void shuffle() {
        while (dealt.size() > 0)
            unDealt.add(dealt.remove(0));
        for (int k = unDealt.size() - 1; k > 0; k--) {
            int r = (int)(Math.random() * (k + 1));
            Card temp = unDealt.get(k);
            unDealt.set(k, unDealt.get(r));
            unDealt.set(r, temp);
        }
    }

    public String toString() {
        int rows = unDealt.size() / 4;
        StringBuilder sb = new StringBuilder("Un-dealt:\n");
        // I know this doesn't work if the number of cards is not a multiple of 4.
        // I'll fix it later maybe
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < 4; c++) {
                StringBuilder card = new StringBuilder(unDealt.get(r + (rows * c)).toString());
                while (card.length() < 25)
                    card.append(" ");
                sb.append(card);
            }
            sb.append("\n");
        }
        if (dealt.size() > 0) {
            sb.append("Dealt:\n");
            for (Card c : dealt)
                sb.append(c).append("\n");
        }
        return sb.toString();
    }
}
