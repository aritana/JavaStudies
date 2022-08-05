package com.example.helloworld;

public class HelloWorld {

public static final Pessoa pessoa = new Pessoa("Jorge");

  public static void main(String[] args) {

    System.out.println("Hello World");

    pessoa.setNome("José");
    System.out.println(pessoa.getNome());
  }

}
