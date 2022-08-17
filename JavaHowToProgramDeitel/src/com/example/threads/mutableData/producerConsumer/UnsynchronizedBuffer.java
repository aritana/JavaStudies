package com.example.threads.mutableData.producerConsumer;

//Mantém o inteiro compartilhado que é acessado por
//Uma thread produtora e uma thread consumidora
public class UnsynchronizedBuffer implements  Buffer{

  private int buffer = -1;
  @Override
  public void blockingPut(int value) throws InterruptedException {
    System.out.printf("\nProducer writes \t%2d", value);
    buffer = value;
  }

  @Override
  public int blockingGet() throws InterruptedException {
    System.out.printf("\nConsumer reads \t%2d", buffer);
    return buffer;
  }
}
