package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Taxa;

import java.util.List;

public interface TaxaService {
    List<Taxa> listar();

  Taxa editar(Taxa taxa);

    Taxa salvar(Taxa taxa) throws Exception;

    void deletar(Long id_taxa);
}
