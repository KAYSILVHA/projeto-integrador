package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.TaxaDTO;
import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Taxa;

import java.util.List;

public interface TaxaService {
    List<Taxa> listar();

  Taxa editar(TaxaDTO taxaDTO);

    Taxa salvar(TaxaDTO taxaDTO) throws Exception;

    void deletar(Long id_taxa);
}
