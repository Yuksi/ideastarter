package com.starter.ui.controllers;

import com.starter.entities.Client;
import com.starter.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yuksi on 14.09.2017.
 */

@Controller
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/")
    public String startPage() {
        return "startpage";
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String clients(Model model) {
        List<Client> clients = clientService.getAll();
        model.addAttribute("clients", clients);
        return "clients";
    }
}
