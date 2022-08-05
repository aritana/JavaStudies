package com.example.threads.runnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {

  public static void main(String[] args) {

    PrintTask task1 = new PrintTask("task1");
    PrintTask task2 = new PrintTask("task2");
    PrintTask task3 = new PrintTask("task3");

    System.out.println("%nStarting Executor");

    //Cria ExecutorService para gerenciar threads
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(task1);
    executorService.execute(task2);
    executorService.execute(task3);

    //Fecha ExecutorService -- ele decide quando fechar trheads
    executorService.shutdown();

    System.out.printf("%nTask started, main ends. %n%n");

  }
}
