package com.ellisvdab.Miniproject.services;

import com.ellisvdab.Miniproject.entities.Client;
import org.springframework.stereotype.Service;

@Service

public interface Clientservice {

    Client findById(Long id);
    Client findByFirstName(String firstName);
    void saveClient(Client client);
}
