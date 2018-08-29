package com.ellisvdab.Miniproject.controllers;

import com.ellisvdab.Miniproject.entities.Client;
import com.ellisvdab.Miniproject.services.Clientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")

public class ClientRestController {
    private final Clientservice clientservice;

    @Autowired
    public ClientRestController (Clientservice clientservice) {
        this.clientservice = clientservice;
    }
    @GetMapping("/(id)")
    public String findClientById (Long id){
        return String.valueOf(clientservice.findById((id));
    }
}
