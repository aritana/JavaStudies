package com.example.threads.mutableData.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {

  public static void main(String[] args) throws InterruptedException {

    //Cria novo pool de threads com duas threads
    ExecutorService executorService = Executors.newCachedThreadPool();

    //Cria UnsynchronizedBuffer para armazenar ints
    Buffer sharedLocation = new UnsynchronizedBuffer();

    System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");
    System.out.printf("------\t\t-----\t---------------\t---------------%n%n");

    //Executar Producer e Consumer, dando a cada uma um
    //acesso a sharedLocation

    executorService.execute(new Producer(sharedLocation));
    executorService.execute(new Consumer(sharedLocation));
    executorService.shutdown();//termina o app quando as tarefas concluem
    executorService.awaitTermination(1, TimeUnit.MINUTES);
  }

}
