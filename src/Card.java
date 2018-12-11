public class Card {
    private String rank, suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getPointValue() {
        return pointValue;
    }

    public boolean equals(Card otherCard) {
        return this.pointValue == otherCard.pointValue;
    }

    public String toString() {
        String out = "";
        switch (rank) {
            case "Ace":
                out += "A";
                break;
            case "Jack":
                out += "J";
                break;
            case "Queen":
                out += "Q";
                break;
            case "King":
                out += "K";
                break;
            default:
                out += pointValue;
        }
        switch (suit) {
            case "Spades":
                out += " ♠";
                break;
            case "Clubs":
                out += " ♣";
                break;
            case "Hearts":
                out += " ♥";
                break;
            case "Diamonds":
                out += " ♦";
                break;
        }
        return out + "「" + rank + " of " + suit + "」";
    }
}