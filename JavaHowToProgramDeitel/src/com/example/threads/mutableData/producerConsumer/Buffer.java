package com.example.threads.mutableData.producerConsumer;


//Interface Buffer especifica métodos chamados por Producer e Consumer.
public interface Buffer {

  public void blockingPut(int value) throws InterruptedException;

  public int blockingGet() throws InterruptedException;

}
