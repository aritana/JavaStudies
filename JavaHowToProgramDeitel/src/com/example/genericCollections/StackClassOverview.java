package com.example.genericCollections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackClassOverview {

  public static void main(String[] args) {
    Stack<Number> stack = new Stack<>();

    stack.push(12L); //push long value
    System.out.printf("Pushed 12L");
    printStack(stack);

    stack.push(34567); //push int value
    System.out.printf("Pushed 34567");
    printStack(stack);

    stack.push(1.0F); //push long value
    System.out.printf("Pushed 1.0F");
    printStack(stack);

    stack.push(1234.5678); //push double value
    System.out.printf("Pushed 1234.5678");
    printStack(stack);

    //remove itens from stack
    try {
      Number removedObject = null;
      while (true) {
        removedObject = stack.pop();
        System.out.printf("Popped %s%n", removedObject);
        printStack(stack);
      }
    } catch (EmptyStackException emptyStackException) {
      emptyStackException.printStackTrace();
    }
  }

  private static void printStack(Stack<Number> stack) {
    if (stack.isEmpty()) {
      System.out.printf("stack is empty%n%n");
    } else {
      System.out.printf("stack contains %s (top)%n", stack);
    }
  }
}
