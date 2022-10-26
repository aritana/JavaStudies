package com.example.genericCollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Method addAll: inserts an array in a  collection Method frequency:  returns the number of times
 * that an object appears in the collection. Method disjoint: takes two collections and returns true
 * if they have no elements in common.
 */
public class CollectionsMethods {

  public static void main(String[] args) {
    String[] colors = {"red", "white", "yellow", "blue"};
    List<String> list1 = Arrays.asList(colors);
    ArrayList<String> list2 = new ArrayList<>();

    list2.add("black");
    list2.add("red");
    list2.add("green");

    System.out.println("Before addAll, list2 contains: ");

    for (String s : list2) {
      System.out.printf("%s ", s);
    }

    Collections.addAll(list2,colors);
    System.out.printf("%nAfter addAll, list2 contains: ");

    for (String s : list2) {
      System.out.printf("%s ", s);
    }

    //get frequency of "red"

    int frequency  = Collections.frequency(list2, "red");
    System.out.printf("%nFrequency of red is list2: %d%n", frequency);

    //check wether list1 and list2 have elements in common
    boolean disjoint = Collections.disjoint(list1,list2);

    System.out.printf("list1 and list2 %s elements in common%n",(disjoint? "do not have": "have"));

  }
}
