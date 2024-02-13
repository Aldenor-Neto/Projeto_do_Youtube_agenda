package com.api.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.agenda.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
    
}
