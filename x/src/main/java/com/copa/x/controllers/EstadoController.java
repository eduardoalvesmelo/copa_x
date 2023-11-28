package com.copa.x.controllers;

import com.copa.x.entities.Estado;
import com.copa.x.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estado")
public class EstadoController {

        @Autowired
        private EstadoService estadoService;

        @GetMapping
        public List<Estado> findAll(){
            List<Estado> result = estadoService.findAll();
            return result;
        }
}
