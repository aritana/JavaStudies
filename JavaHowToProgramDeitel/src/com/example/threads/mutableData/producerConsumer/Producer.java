package com.example.threads.mutableData.producerConsumer;

import java.security.SecureRandom;

//Não seguro para Threads
public class Producer implements Runnable { //Thread separada

  private static final SecureRandom generator = new SecureRandom();
  private final Buffer sharedLocation;

  //construtor


  public Producer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }

  @Override
  public void run() {

    int sum = 0;

    for (int count = 1; count <= 10; count++)
    {
      try
      {
        Thread.sleep(generator.nextInt(3000));//sono aleatório
        sharedLocation.blockingPut(count);//configura valor no buffer
        sum += count;
        System.out.printf("\t%2d%n", sum);
      }
      catch (InterruptedException exception)
      {
        Thread.currentThread().interrupt();
      }

      System.out.printf("Producer done producing%nTerminating Producer%n");
    }

  }
}
