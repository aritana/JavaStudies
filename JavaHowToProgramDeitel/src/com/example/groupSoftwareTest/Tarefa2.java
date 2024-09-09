package com.example.groupSoftwareTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Condominio {
    private List<Bloco> blocos;

    public Condominio() {
        this.blocos = new ArrayList<>();
    }

    public void adicionarBloco(Bloco bloco) {
        blocos.add(bloco);
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }
}

class Bloco {
    private BigDecimal despesas;
    private List<Apartamento> apartamentos;

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public Bloco() {
        this.apartamentos = new ArrayList<>();
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void setDespesas(BigDecimal despesas) {
        this.despesas = despesas;
        calcularValorCondominio();
    }

    private void calcularValorCondominio() {
        double somaFracoes = apartamentos.stream()
                .mapToDouble(Apartamento::getFracao)
                .sum();

        for (Apartamento apartamento : apartamentos) {
            BigDecimal valorCondominio = BigDecimal.valueOf(apartamento.getFracao())
                    .multiply(despesas)
                    .divide(BigDecimal.valueOf(somaFracoes), BigDecimal.ROUND_HALF_UP);
            apartamento.setValorCondominio(valorCondominio);
        }
    }
}

class Apartamento {
    private Double area;
    private Double fracao;
    private BigDecimal valorCondominio;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getFracao() {
        return fracao;
    }

    public void setFracao(Double fracao) {
        this.fracao = fracao;
    }

    public BigDecimal getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(BigDecimal valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
}

public class Tarefa2 {
    public static void main(String[] args) {

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
}