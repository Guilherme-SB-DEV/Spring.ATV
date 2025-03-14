package br.com.example.api.controle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.models.Pessoa;
import br.com.example.api.repositorio.Repositorio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controler {
    @Autowired
    private Repositorio acao;
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }
    
    
    @GetMapping("")
    public String ola() {
        return "oi";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "boas vindas: " + nome;
    }
    
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }

    
}
