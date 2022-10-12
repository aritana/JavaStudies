package com.example.genericCollections;

/**
 * Collection is a data structure, actually, an object - that can hold references to other objects
 * Collection is the root interface in the collections hierarchy from which interfaces Set, Queue
 * and List are derived.
 *
 * Collection is used commonly as a parameter type in methods to allow polymorphic processing of all
 * objects that implement interface Collection
 *
 * Set is a collection that does not contain duplicates List An ordered collection that contain
 * duplicate elements Map is a collection that associates keys to values and cannot contain
 * duplicate key. Map does not derive from Collection Queue Typically a first-in, first-out
 * collection that models a waiting line; other orders can be specified
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 *
 * Lists: Interface List is implemented by several classes, including ArrayList, LinkedList and
 * Vector. Classes ArrayList and Vector are resizable-array implementations of List. Inserting an
 * element between existing elements of an ArrayList or Vector is an inefficient operation all
 * elements after the new one must be moved out of the way, which could be an expensive operation in
 * a collection with a large number of elements. A LinkedList enables efficient insertion or removal
 * of elements in the middle of a collection, but is much less efficient than an ArrayList for
 * jumping to a specific element in the collection.
 */

/**
 * Lists:
 * Interface List is implemented by several classes, including ArrayList, LinkedList and Vector.
 * Classes ArrayList and Vector are resizable-array implementations of List.
 * Inserting an element between existing elements of an ArrayList or Vector is an inefficient operation
 * all elements after the new one must be moved out of the way, which could be an expensive operation
 * in a collection with a large number of elements.
 * A LinkedList enables efficient insertion or removal of elements in the middle of a collection,
 * but is much less efficient than an ArrayList for jumping to a specific element in the collection.
 */


import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList and Vector have nearly identical behaviors.
 * Operations on Vectors are synchronized by default, whereas those on ArrayLists are not.
 * ArrayList is typically preferred over vector in programs that do not share a collection among threads
 * Separately, the Java collections API provides synchronization wrappers that can be used to add
 * synchronization to the unsynchronized collections.
 */


public class CollectionsOverView {

  public static void main(String[] args) {

    // arrayList();
    //linkedList();
    //usingArrayAsList();
    //usingToArray();
    // methodSortAsc();
    // methodSortDesc();
    //methodWithComparator();
    //suffle();
    algorithms();

  }

  private static void algorithms() {
    
    Character[]letters = {'P','C','M'};
    List<Character> list = Arrays.asList(letters);
    System.out.println("List contains: ");
    output(list);

    // reverse and display the List<Character>
    Collections.reverse(list);
    System.out.printf("%nAfter calling reverse, list contains:%n");
    output(list);

    // create copyList from an array of 3 Characters
    Character[] lettersCopy = new Character[3];
    List<Character> copyList = Arrays.asList(lettersCopy);

    // copy the contents of list into copyList
    Collections.copy(copyList,list);
    System.out.printf("%nAfter copying, copyList contains:%n");
    output(copyList);

    // fill list with Rs
    Collections.fill(list,'R');
    System.out.println("%nAfter calling fill, list contains:%n");
    output(list);
  }

  private static void output(List<Character> list) {
    System.out.print("The list is: ");
    for (Character element : list) {
      System.out.printf("%s ", element);
    }
    System.out.printf("%nMax: %s",Collections.max(list));
    System.out.printf("%nMax: %s",Collections.min(list));
  }

  private static void suffle() {
    DeckOfCards cards = new DeckOfCards();
    cards.printCards();

  }

  private static void methodWithComparator() {
    List<Time2> list = new ArrayList<>();

    list.add(new Time2(6, 24, 34));
    list.add(new Time2(18, 14, 58));
    list.add(new Time2(6, 05, 34));
    list.add(new Time2(12, 14, 58));
    list.add(new Time2(6, 24, 22));

    System.out.printf("Unsorted array elements: %n%s%n", list);
    Collections.sort(list, new TimeComparator());

    System.out.printf("Sorted list elements:%n%s%n", list);
  }


  private static void methodSortDesc() {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};

    List<String> list = Arrays.asList(suits);
    System.out.printf("Unsorted array elements: %s%n", list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.printf("Sorted array elements: %s%n", list);
  }

  private static void methodSortAsc() {
    //Must implement the Comparable Interface.
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};

    List<String> list = Arrays.asList(suits);
    System.out.printf("Unsorted array elements: %s%n", list);

    Collections.sort(list);
    System.out.printf("Sorted array elements: %s%n", list);

  }

  private static void usingArrayAsList() {

    try {
      String a[] = new String[]{"A", "B", "C", "D"};
      List<String> list = Arrays.asList(a);

      System.out.println("The list is: " + list);

    } catch (NullPointerException e) {
      System.out.println("Exception thrown : " + e);
    }

  }

  private static void usingToArray() {
    String[] colors = {"black", "blue", "yellow"};
    LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

    links.addLast("red");
    links.add("pink");
    links.add(3, "green");
    links.addFirst("cyan");

    //get LinkedList elements as an array
    colors = links.toArray(new String[links.size()]);

    System.out.println("colors: ");
    for (String color : colors
    ) {
      System.out.println(color);
    }
  }

  private static void linkedList() {

    String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
    List<String> list1 = new LinkedList<>();

    for (String color : colors) {
      list1.add(color);
    }

    String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
    List<String> list2 = new LinkedList<>();

    for (String color : colors) {
      list2.add(color);
    }

    //concatenate lists
    list1.addAll(list2);
    list2 = null; //release resources

    printList(list1);

    System.out.printf("%nDeleting elements 4 to 6...");
    removeItems(list1, 4, 7);
    printList(list1);

    printReversedList(list1);

    System.out.printf("%nUpper Case...");
    convertToUppercaseStrings(list1);
    printList(list1);


  }

  private static void convertToUppercaseStrings(List<String> list) {

    ListIterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) {
      String color = iterator.next();
      iterator.set(color.toUpperCase());
    }
  }

  private static void printReversedList(List<String> list) {

    ListIterator<String> iterator = list.listIterator(list.size());
    System.out.printf("%nReversed List:%n");

    //print list in reverse order
    while (iterator.hasPrevious()) {
      System.out.printf("%s ", iterator.previous());
    }

  }

  private static void removeItems(List<String> list, int start, int end) {
    list.subList(start, end).clear();//remove items
  }

  private static void printList(List<String> list) {
    System.out.printf("%nlist:%n");
    for (String color : list) {
      System.out.printf("%s ", color);
    }
    System.out.println();
  }

  private static void arrayList() {
    String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
    List<String> list = new ArrayList<>();

    for (String color : colors) {
      list.add(color); // adds color to end of list
    }

    // add elements in removeColors array to removeList
    String[] removeColors = {"RED", "WHITE", "BLUE"};
    List<String> removeList = new ArrayList<String>();

    for (String color : removeColors
    ) {
      removeList.add(color);
    }

    System.out.println("ArrayList: ");

    for (int count = 0; count < list.size(); count++) {
      System.out.printf("%s ", list.get(count));
    }

    //remove from list the color contained in removelist

    removeColors(list, removeList);

    System.out.printf("%n%nArrayList after calling removeColors:%n");

    for (String color : list) {
      System.out.printf("%s ", color);
    }
  }

  private static void removeColors(Collection<String> list, Collection<String> removeList) {
    //get iterator
    Iterator<String> iterator = list.iterator();
    //loop while collection has items
    while (iterator.hasNext()) {
      if (removeList.contains(iterator.next())) {
        iterator.remove();
      }
    }
  }
}
