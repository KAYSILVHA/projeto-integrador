package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;

import java.util.List;

public interface DocumentoService {
    List<Documento> listar();

   Documento editar(DocumentoDTO documentoDTO);

    Documento salvar(DocumentoDTO documentoDTO) throws Exception;

    void deletar(Long id_documento);
}
