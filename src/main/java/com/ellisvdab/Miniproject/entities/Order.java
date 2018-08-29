package com.ellisvdab.Miniproject.entities;


import javax.persistence.Entity;
import java.util.List;

@Entity
public class Order {

    private Long id;
    private Client client;
    private List<Wool> wools;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Wool> getWools() {
        return wools;
    }

    public void setWools(List<Wool> wools) {
        this.wools = wools;
    }
}
