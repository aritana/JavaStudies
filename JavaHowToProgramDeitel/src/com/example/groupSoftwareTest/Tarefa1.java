package com.example.groupSoftwareTest;

import java.util.ArrayList;
import java.util.List;

abstract class Figura {
    abstract Double getArea();
}

class Quadrado extends Figura {
    private Double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return lado * lado;
    }
}

class Retangulo extends Figura {
    private Double largura;
    private Double altura;

    public Retangulo(Double ladoX, Double ladoY) {
        this.largura = ladoX;
        this.altura = ladoY;
    }

    @Override
    public Double getArea() {
        return largura * altura;
    }
}

class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;
    }
}

class Circulo extends Figura {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

class Calculadora {
    private List<Figura> figuras;

    public Calculadora() {
        this.figuras = new ArrayList<>();
    }

    public void adicionarFigura(Figura figura) {
        figuras.add(figura);
    }

    public double calcularAreaTotalFiguras() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.getArea();
        }
        return areaTotal;
    }

    public void imprimirAreaTotal() {
        String areaTotalFormatada = String.format("%.2f", calcularAreaTotalFiguras());
        System.out.println("A área total das figuras é: " + areaTotalFormatada + "metros quadrados.");
    }
}

public class Tarefa1 {
    public static void main(String[] args) {

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