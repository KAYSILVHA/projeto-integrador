package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.services.PessoaServiceImpl;
import com.example.projetointegrador.services.TaxaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin

public class TaxaController {
    final TaxaServiceImpl taxaServiceImpl;

    public TaxaController(TaxaServiceImpl taxaService) {
        this.taxaServiceImpl = taxaService;
    }

    @PostMapping(value = "/salvarTaxa")
    public ResponseEntity<Object> taxaPessoa(@RequestBody Taxa taxa) throws Exception {
        Taxa response = taxaServiceImpl.salvar(taxa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/buscarTaxa")
    public ResponseEntity<Object> buscarTaxa() {
        List<Taxa> response=taxaServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/alterarTaxa")
    public ResponseEntity<Object> alterarTaxa(@RequestBody Taxa taxa) {
        Taxa response = taxaServiceImpl.editar(taxa);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

     @DeleteMapping(value = "/deletarTaxa")
    public ResponseEntity<Object> deletarTaxa(Long id_taxa) {
        taxaServiceImpl.deletar(id_taxa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
