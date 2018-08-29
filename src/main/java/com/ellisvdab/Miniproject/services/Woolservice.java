package com.ellisvdab.Miniproject.services;

import com.ellisvdab.Miniproject.entities.Wool;
import org.springframework.stereotype.Service;

@Service

public interface Woolservice {
    Wool findById(Long id);
    Wool findByColor(String color);
}
