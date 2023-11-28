package com.copa.x.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estado_id;
    private String nome;
    private String sigla;

    public Estado() {
    }

    public Estado(Long id, String nome, String sigla) {
        this.estado_id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Long getId() {
        return estado_id;
    }

    public void setId(Long id) {
        this.estado_id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado estado)) return false;
        return Objects.equals(getId(), estado.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
