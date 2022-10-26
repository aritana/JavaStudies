package com.example.genericCollections;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/***
 * https://www.scientecheasy.com/2020/10/treeset-in-java.html/
 */
public class SortedSetOverview {

  public static void main(String[] args) {

    String[] colors = {"yellow", "green", "black", "tan", "grey",
        "white", "orange", "red", "green"};

    SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

    System.out.println("Sorted set");
    printSet(tree);

    //get headSet based on "orange"
    System.out.println("headSet (\"orange\"): ");
    printSet(tree.headSet("orange"));

    //get tailSet based upon "orange"
    System.out.println("tailSet  (\\\"orange\\\"): ");
    printSet(tree.tailSet("orange"));

    // get first and last elements
    System.out.printf("first: %s%n",tree.first() );
    System.out.printf("last: %s%n", tree.last());
  }

  private static void printSet(SortedSet<String> set) {
    for (String s : set) {
      System.out.printf("%s ",s);
    }
    System.out.println();
  }

}
