package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class PessoaController {
    final PessoaServiceImpl pessoaService;

    public PessoaController(PessoaServiceImpl pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping(value = "/salvarPessoa")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.salvarPessoa(pessoa);
        return null;
    }

    @GetMapping(value = "/buscarPessoa")
    public ResponseEntity<Object> buscarPessoa() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(pessoaService.buscarPessoa());
    }
}



