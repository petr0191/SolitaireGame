package app;

public enum CardValue {
	ACE(1, "Ace"), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King");

    private final int value;
    private final String name;

    // Constructor for numeric values
    CardValue(int value) {
        this.value = value;
        this.name = String.valueOf(value); // Convert numeric value to String
    }

    // Constructor for face cards
    CardValue(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}

