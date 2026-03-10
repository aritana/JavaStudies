package com.example.genericCollections;

import java.util.*;

public class SetImp {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();//ordem aleatorio, foco em performance
        Set<String> linkedSet =  new LinkedHashSet<>();//ordem de insercao, foco manter fila
        Set<String> treeSet = new TreeSet<>();//Ordem naturl, alfabetica ou numerica
        Set<String> treeSetReverse = new TreeSet<>(Collections.reverseOrder());//Ordem naturl, alfabetica ou numerica
        Set<String> treeSetReverseComparable = new TreeSet<>((s1,s2)-> Integer.compare(s1.length(),s2.length()));//Ordem naturl, alfabetica ou numerica

        List<String> frutas = Arrays.asList("maça","manga", "manga", "banana", "pera", "uva", "morango", "melancia", "laranja");
        for(String fruta : frutas){
            hashSet.add(fruta);
            linkedSet.add(fruta);
            treeSet.add(fruta);
            treeSetReverse.add(fruta);
            treeSetReverseComparable.add(fruta);
        };
        System.out.println("--- RESULTADOS (Note que 'Manga' não repete) ---");
        System.out.println("HashSet (Aleatório):   " + hashSet);
        System.out.println("LinkedSet (Inserção):  " + linkedSet);
        System.out.println("TreeSet (Alfabética):  " + treeSet);
        System.out.println("TreeSet (treeSetReverse):  " + treeSetReverse);
        System.out.println("TreeSet (treeSetReverseComparable):  " + treeSetReverseComparable);
    }
}
