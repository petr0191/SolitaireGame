package app;

import javax.swing.ImageIcon;

public class Card {
    private CardSuit suit;
    private CardValue value;
    private boolean isFaceUp;
    private ImageIcon image;

    // Constructor
    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false; // Cards start face down by default.
        loadImage();
    }
    
    private void loadImage() {
        String imageName = "/images/" + this.value.toString().toLowerCase() + "_of_" + suit.name().toLowerCase() + ".png";
        System.out.print(imageName);
        System.out.print(getClass());
        this.image = new ImageIcon(getClass().getResource(imageName));
    }

    // Getters and Setters
    public CardSuit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    // Method to flip the card
    public void flip() {
        isFaceUp = !isFaceUp;
    }

    // For debugging or text-based output
    @Override
    public String toString() {
        return value + " of " + suit + (isFaceUp ? " (Face Up)" : " (Face Down)");
    }
}

