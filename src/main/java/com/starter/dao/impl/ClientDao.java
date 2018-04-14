package com.starter.dao.impl;

import com.starter.dao.IDao;
import com.starter.entities.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientDao implements IDao {
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<Client>();
        Client a = new Client();
        a.setId(1);
        a.setName("aaaaa");
        Client b = new Client();
        b.setId(2);
        b.setName("bbbbb");
        clients.add(a);
        clients.add(b);
        return clients;
        }
}
