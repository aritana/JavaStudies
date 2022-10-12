package com.example.genericCollections;

/**
 * Enum constants are implicitly final. Enum constants are implicitly static. Any attempt to create
 * an object of an enum type with operator new results in a compilation error.
 */
public class Card {

  public static enum Face {
    Ace, Deuce, Three, Four, Five, Six,
    Seven, Eight, Nine, Ten, Jack, Queen, King
  }

  public static enum Suit {Clubs, Diamonds, Hearts, Spades}

  private final Face face;
  private final Suit suit;

  public Card(Face face, Suit suit) {
    this.face = face;
    this.suit = suit;
  }

  public Face getFace() {
    return face;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s of  %s", face, suit);
  }
}
