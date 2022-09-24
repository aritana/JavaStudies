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


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList and Vector have nearly identical behaviors.
 * Operations on Vectors are synchronized by default, whereas those on ArrayLists are not.
 * ArrayList is typically preferred over vector in programs that do not share a collection among threads
 * Separately, the Java collections API provides synchronization wrappers that can be used to add
 * synchronization to the unsynchronized collections.
 */

public class CollectionsOverView {

  public static void main(String[] args) {

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
