package com.starter.services.impl;

import com.starter.dao.IDao;
import com.starter.entities.Client;
import com.starter.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yuksi on 14.09.2017.
 */

@Service
public class ClientService implements IClientService {

    @Autowired
    private IDao clientDao;

    @Override
    public List<Client> getAll() {
        return clientDao.getAll();
    }
}
