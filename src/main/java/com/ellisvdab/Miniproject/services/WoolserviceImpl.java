package com.ellisvdab.Miniproject.services;

import com.ellisvdab.Miniproject.entities.Wool;
import com.ellisvdab.Miniproject.repositories.WoolRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class WoolserviceImpl implements Woolservice {

    @Autowired
    private WoolRepository woolRepository;

    @Override
    public Wool findById(Long id) {
        return woolRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Wool findByColor(String color) {
        return woolRepository.findByColor(color);
    }
}
