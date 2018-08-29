package com.ellisvdab.Miniproject.repositories;

import com.ellisvdab.Miniproject.entities.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
    Client findByFirstName(String firstName);
}
