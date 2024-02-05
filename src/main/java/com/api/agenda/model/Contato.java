package com.api.agenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Contatos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
 
    private Long id;
    private string nome;
    private String email;
    private String telefone;
    
}

