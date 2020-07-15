package se.lexicon.elmira;

public enum Currency {

    SEK1(1),
    SEK2(2),
    SEK5(5),
    SEK10(20),
    SEK50(100),
    SEK100(100),
    SEK200(200),
    SEK500(500),
    SEK1000(1000);

    private int amount;

    Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}



