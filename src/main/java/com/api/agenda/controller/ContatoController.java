package com.api.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Contato save(@RequestBody Contato entity) {
        return service.saveOrUpdate(entity);
    }

    @GetMapping
    public List<Contato> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Contato update(@RequestBody Contato entity) {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
