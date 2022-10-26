package com.example.genericCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * By definition, sets do not contains duplicates. Set is an unordered collection of unique
 * elements
 */
public class SetOverview {

  public static void main(String[] args) {
    String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink", "red",
        "white", "blue", "black", "yellow", "purple", "tan", "pink"};
    List<String> list = Arrays.asList(colors);
    System.out.printf("List: %s%n", list);
    printNonDuplicates(list);
  }

  private static void printNonDuplicates(List<String> values) {
    Set<String>set = new HashSet<>(values);
    System.out.printf("%nNonduplicates are: ");

    for(String value:set){
      System.out.printf("%s ",value);;
    }
    System.out.println();
  }
}
