package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.PessoaDTO;
import com.example.projetointegrador.models.Pessoa;

import java.util.List;

public interface PessoaService {
    List<Pessoa> listar();

    Pessoa editar(PessoaDTO pessoaDTO);

    Pessoa salvar(PessoaDTO pessoaDTO) throws Exception;

    void deletar(Long id_pessoa);

   Double adicionarTaxa(Pessoa pessoa);
}
