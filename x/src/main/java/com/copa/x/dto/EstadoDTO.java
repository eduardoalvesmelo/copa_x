package com.copa.x.dto;

import com.copa.x.entities.Estado;

public class EstadoDTO {

    private Long id;
    private String nome;
    private String sigla;

    public EstadoDTO() {
    }

    public EstadoDTO(Estado estado) {
        this.id = estado.getId();
        this.nome = estado.getNome();
        this.sigla = estado.getSigla();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
