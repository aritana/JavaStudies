package com.example.genericCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

  private List<Card> list;

  public DeckOfCards() {
    Card[] deck = new Card[52];
    int numberOfCards = 0;

    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Face face : Card.Face.values()) {
        deck[numberOfCards] = new Card(face, suit);
        ++numberOfCards;
      }
    }
    list = Arrays.asList(deck);
    Collections.shuffle(list);
  }

  public void printCards() {
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? newLine() : "");
    }
  }
  public String newLine(){
    System.out.println();
    return "";
  }
}
