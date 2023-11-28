package com.copa.x.services;

import com.copa.x.entities.Times;
import com.copa.x.repositories.TimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesService {

    @Autowired
    private TimesRepository timesRepository;

    public List<Times> findAll() {
        List<Times> result = timesRepository.findAll();
        return result;
    }
}
