package com.example.groupSoftwareTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class GroupSoftwareTest {

    public static void main(String[] args) {

        System.out.println("----------------Tarefa 1------------------------------");
        tarefa1();
        System.out.println("----------------Tarefa 2------------------------------");
        tarefa2();
        System.out.println("----------------Tarefa 3------------------------------");
        tarefa3();
    }

    private static void tarefa3() {
        List<Integer> listaNumerica = Arrays.asList(1, 2, 3, 4);
        List<Character> listaLetras = Arrays.asList('a', 'b', 'c', 'd');
        List<Integer> listaReversa = Arrays.asList(1, 2, 3, 4);

        Collections.reverse(listaReversa);

        System.out.println("Lista invertida");
        System.out.println(listaReversa);

        System.out.println("Lista.filter(args)");
        List<Integer> listaFiltrada = listaNumerica.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(listaFiltrada);

        System.out.println("Lista.map(args)");
        List<String> listLetrasMaiusculas = listaLetras.stream()
                .map(x -> String.valueOf(x).toUpperCase())
                .toList();
        System.out.println(listLetrasMaiusculas);
    }

    private static void tarefa2() {
        Apartamento apto1 = new Apartamento();
        apto1.setArea(100.0);
        apto1.setFracao(0.25);

        Apartamento apto2 = new Apartamento();
        apto2.setArea(150.0);
        apto2.setFracao(0.35);

        // Criando bloco e adicionando apartamentos
        Bloco bloco1 = new Bloco();
        bloco1.adicionarApartamento(apto1);
        bloco1.adicionarApartamento(apto2);

        // Definindo despesas do bloco
        bloco1.setDespesas(BigDecimal.valueOf(1000));

        // Criando condomínio e adicionando bloco
        Condominio condominio = new Condominio();
        condominio.adicionarBloco(bloco1);

        // Exibindo valores de condomínio dos apartamentos
        for (Bloco bloco : condominio.getBlocos()) {
            for (Apartamento apartamento : bloco.getApartamentos()) {
                System.out.println("Apartamento com área " + apartamento.getArea() +
                        " e fração " + apartamento.getFracao() +
                        " tem valor de condomínio: " + apartamento.getValorCondominio());
            }
        }
    }

    private static void tarefa1() {
        Quadrado quadrado = new Quadrado(2.0);
        Retangulo retangulo = new Retangulo(2.0, 3.0);
        Triangulo triangulo = new Triangulo(2.0, 3.0);
        Circulo circulo = new Circulo(2.0);

        Calculadora calculadora = new Calculadora();

        calculadora.adicionarFigura(quadrado);
        calculadora.adicionarFigura(retangulo);
        calculadora.adicionarFigura(triangulo);
        calculadora.adicionarFigura(circulo);

        calculadora.imprimirAreaTotal();
    }
}