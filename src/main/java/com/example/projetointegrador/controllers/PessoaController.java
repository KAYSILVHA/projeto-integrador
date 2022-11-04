package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class PessoaController {
    final PessoaServiceImpl pessoaServiceImpl;

    public PessoaController(PessoaServiceImpl pessoaService) {
        this.pessoaServiceImpl = pessoaService;
    }

    @PostMapping(value = "/salvarPessoa")
    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa response = pessoaServiceImpl.salvar(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/buscarPessoa")
    public ResponseEntity<Object> buscarPessoa() {
        List<Pessoa> response=pessoaServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/alterarPessoa")
    public ResponseEntity<Object> alterarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa response = pessoaServiceImpl.editar(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}


