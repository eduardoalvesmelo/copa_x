package com.copa.x.dto;

import com.copa.x.entities.Estado;
import com.copa.x.entities.Times;

public class TimesDTO {

    private Long id;
    private String nome;
    private Estado estado;

    public TimesDTO() {
    }

    public TimesDTO(Times times) {
        this.id = times.getId();
        this.nome = times.getNome();
        this.estado = times.getEstado();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }
}
