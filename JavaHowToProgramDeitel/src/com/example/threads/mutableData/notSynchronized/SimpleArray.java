package com.example.threads.mutableData.notSynchronized;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {  // ATENÇÃO: NÃO SEGURO PARA THREADS!


  private static final SecureRandom generator  =   new SecureRandom();
  private final int[] array; //array de inteiros compartilhado
  private int writeIndex = 0; //indice compartilhado do próximo elemento a gravar

  //cria uma SimpleArray de um determinado tamanho
  public SimpleArray(int size) {
    array = new int[size];
  }

  public void add(int value){

    int position = writeIndex;//deveria ser atômica.

    try {
      //coloca a thread para dormir durante 0 a 499 milissegundos.
      Thread.sleep(generator.nextInt(500));

    }catch (InterruptedException ex){

      Thread.currentThread().interrupt();
    }
    //coloca o o valor no elemento apropriado
    array[position] =  value; //deveria ser atômica.
    System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);

    ++writeIndex; //deveria ser atômica.
    System.out.printf("Next write index: %d%n", writeIndex);
  }

  public String toString(){
    return Arrays.toString(array);
  }

}
