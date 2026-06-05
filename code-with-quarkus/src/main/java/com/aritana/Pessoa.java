package com.aritana;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.ws.rs.QueryParam;

import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {
    public String nome;
    public int anoNascimento;

    public static List<Pessoa> findByAnoNascimento(@QueryParam("anoNascimento") int anoNascimento) {
        return find("anoNascimento", anoNascimento).list();
    }
}
