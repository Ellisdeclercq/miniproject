package com.ellisvdab.Miniproject.repositories;

import com.ellisvdab.Miniproject.entities.Client;
import com.ellisvdab.Miniproject.entities.Wool;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WoolRepository extends PagingAndSortingRepository<Wool, Long> {
    Wool findByColor(String color);
}
