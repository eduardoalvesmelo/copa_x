package com.copa.x.controllers;

import com.copa.x.entities.Estado;
import com.copa.x.entities.Times;
import com.copa.x.services.EstadoService;
import com.copa.x.services.TimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/times")
public class TimesController {
    @Autowired
    private TimesService timesService;

    @GetMapping
    public List<Times> findAll(){
        List<Times> result = timesService.findAll();
        return result;
    }
}
