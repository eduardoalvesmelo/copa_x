package com.copa.x.services;

import com.copa.x.entities.Estado;
import com.copa.x.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        List<Estado> result = estadoRepository.findAll();
        return result;
    }

}
