package com.example.lambdasFluxos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return  false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public  int hashCode(){
        return Objects.hash(nome, idade);
    }

    @Override
    public  String toString(){
        return  nome + " - " + idade;
    }
}

public class Distinct {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Jonh", "Ana", "Maria", "Jonh");
        names.stream().distinct()
                .forEach(System.out::println);


        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana",30),
                new Pessoa("Ana",40),
                new Pessoa("Jose",30),
                new Pessoa("Farias",40),
                new Pessoa("Farias",40)
        );

        pessoas.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
