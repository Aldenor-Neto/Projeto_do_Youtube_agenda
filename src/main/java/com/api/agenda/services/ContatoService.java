package com.api.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.agenda.model.Contato;
import com.api.agenda.repository.ContatoRepository;

import jakarta.transaction.Transactional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    @Transactional
    public Contato saveOrUpdate(Contato entity) {
        return repository.save(entity);
    }

    @Transactional
    public List<Contato> getAll() {
        return repository.findAll();
    }

    @Transactional
    public Contato update(Contato entity) {
        return saveOrUpdate(entity);
    }
}
