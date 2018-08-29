package com.ellisvdab.Miniproject.services;

import com.ellisvdab.Miniproject.entities.Client;
import com.ellisvdab.Miniproject.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service

public class ClientserviceImpl implements Clientservice {


    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client findByFirstName(String firstName) {

        return clientRepository.findByFirstName(firstName);
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }
}
