package com.example.genericCollections;

import java.util.PriorityQueue;

public class PriorityQueueOverView {


  public static void main(String[] args) {
    PriorityQueue<Double> queue = new PriorityQueue();

    //Insert elements to queue in natural order
    queue.offer(3.2);
    queue.offer(9.8);
    queue.offer(9.7);
    queue.offer(5.4);

    System.out.println("Polling from queue: ");

    while (queue.size() > 0) {
      System.out.printf("%.1f ", queue.peek());//view top element
      queue.poll();//remove top element
    }
  }
}
