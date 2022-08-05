package com.example.threads.runnable;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

  private static final SecureRandom generator = new SecureRandom();
  private final int sleepTime; //tempo de adormecimento aleatorio para thread
  private final String taskName;

  public PrintTask(String taskName) {
    this.sleepTime = generator.nextInt(5000);//tempo adormecimento entre 0 e 5 segundos
    this.taskName = taskName;
  }

  //Metodo que contem o código que uma thread executará
  @Override
  public void run() {

    try {
      System.out.printf("%n%s going to sleep for %d milliseconds", taskName, sleepTime);
      Thread.sleep(sleepTime);//coloca a thread para dormir
    } catch (InterruptedException exception) {
      exception.printStackTrace();
      Thread.currentThread().interrupt();//reinterrompe a thread
    }
    System.out.printf("%n%s done sleeping%n", taskName);
  }
}
