package com.example.lambdasFluxos;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jonas", "Jane", "Bob", "Marley","Jilet");

        names.stream()
                .filter(name -> {
                    System.out.println("Filtrando:" + name);
                    return name.startsWith("J");
                })
                .limit(2)
                .map(name -> {
                    System.out.println("Mapeando: " + name);
                    return name.toUpperCase();
                })
                .forEach(name -> System.out.println("Resultado: " + name));
    }
}