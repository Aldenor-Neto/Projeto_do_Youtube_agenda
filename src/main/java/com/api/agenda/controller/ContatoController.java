            package com.api.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.agenda.model.Contato;
import com.api.agenda.services.ContatoService;

@RestController
@RequestMapping("/agenda")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @PostMapping
    public Contato save(Contato entity) {
        return service.saveOrUpdate(entity);
    }

}
