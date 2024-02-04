package com.api.agenda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloTest {
    
    @GetMapping
    public String heloTest(){
        return "Hello word! projeto Agenda em andamento.";
    }
}
