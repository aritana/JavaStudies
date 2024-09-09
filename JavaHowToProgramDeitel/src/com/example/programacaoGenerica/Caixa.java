package com.example.programacaoGenerica;

public class Caixa<T> {
    private T conteudo;

    public void colocar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T pegar() {
        return conteudo;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.colocar("Olá, Mundo");
        System.out.println(caixaDeTexto.pegar());

        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        caixaDeNumeros.colocar(123);
        System.out.println(caixaDeNumeros.pegar());
    }
}


