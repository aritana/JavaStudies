package com.example.groupSoftwareTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tarefa3 {
    public static void main(String[] args) {

        List<Integer> listaNumerica = Arrays.asList(1, 2, 3, 4);
        List<Character> listaLetras = Arrays.asList('a', 'b', 'c', 'd');
        List<Integer> listaReversa = Arrays.asList(1, 2, 3, 4);

        Collections.reverse(listaReversa);
//1)
        System.out.println("Lista invertida");
        System.out.println(listaReversa);
//2)
        System.out.println("Lista.filter(args)");
        List<Integer> listaFiltrada = listaNumerica.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(listaFiltrada);
//3)
        System.out.println("Lista.map(args)");
        List<String> listLetrasMaiusculas = listaLetras.stream()
                .map(x -> String.valueOf(x).toUpperCase())
                .toList();
        System.out.println(listLetrasMaiusculas);
    }
}