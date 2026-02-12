package com.example.genericCollections;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        //sortBinarySearch();
        //reverseShuffle();
        //fill();
        //copy();
        //addAll();
        //frequency();
        disjoint();

    }

    public static void sortBinarySearch() {

        List<String> nomes = new ArrayList<>(Arrays.asList("Zeca", "Ana", "Bia"));
        Collections.sort(nomes);// Resultado: [Ana, Bia, Zeca]
        System.out.println(nomes);
        int index = Collections.binarySearch(nomes, "Bia");// Retorna: 1 (posição do elemento)
        System.out.println(nomes.get(index));

    }

    public static void reverseShuffle(){
        List<Integer> numeros = new ArrayList<>(Arrays.asList(11, 2, 3, 4, 5));
        Collections.reverse(numeros);
        System.out.println(numeros);
        Collections.shuffle(numeros);
        System.out.println(numeros);
    }

    public static void fill(){
        List<String> list = new ArrayList<>(Arrays.asList("azul", "vermelho", "amarelo"));
        Collections.fill(list, "rosa"); // Preenche toda a lista com o mesmo elemento
        System.out.println(list);
    }

    public static void copy(){
        List<Integer> origem = Arrays.asList(1,2,3,4);
        List<Integer> destino = new ArrayList<>(Arrays.asList(0,0,0,0));

        Collections.copy(destino, origem);
        System.out.println(destino);
    }
    public static  void addAll(){
        List<String> frutas = new ArrayList<>();
        frutas.add("pera");

        Collections.addAll(frutas, "banana","abacate","acerola");
        System.out.println(frutas);
    }

    public  static  void frequency(){
        List<String> votos = Arrays.asList("Sim", "Não", "Sim", "Sim", "Talvez");
        int contagem = Collections.frequency(votos, "Sim");
        System.out.println("Votos 'Sim': " + contagem);
        // Saída: Votos 'Sim': 3

    }

    public static  void disjoint(){
        List<String> lista1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> lista2 = Arrays.asList("d", "e", "f");
        List<String> lista3 = Arrays.asList("c", "e", "f");

        System.out.println(Collections.disjoint(lista1, lista2)); //true
        System.out.println(Collections.disjoint(lista1, lista3)); //false

        System.out.println(!Collections.disjoint(lista1, lista3)); //false

        lista1.retainAll(lista3);
        System.out.println(lista1);

        Set<String> set2 = new HashSet<>(lista1);
        List<String> comuns = set2.stream()
                .filter(lista3::contains)//item->list3.contains(item)
                .toList();

        System.out.println(comuns);
    }//continuar na pagina 590
}
