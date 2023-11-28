package com.copa.x.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_time")
public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long time_id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Times() {
    }

    public Times(Long id, String nome, Estado estado) {
        this.time_id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() {
        return time_id;
    }

    public void setId(Long id) {
        this.time_id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Times times)) return false;
        return Objects.equals(getId(), times.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
