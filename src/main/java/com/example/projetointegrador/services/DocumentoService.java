package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;

import java.util.List;

public interface DocumentoService {
    List<Documento> listar();

   Documento editar(Documento documento);

    Documento salvar(Documento documento);
    void deletar(Long id_documento);
}
