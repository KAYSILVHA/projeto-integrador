package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Pessoa;

import java.util.List;

public interface PessoaService {
    List<Pessoa> listar();

    Pessoa editar(Pessoa pessoa);

    Pessoa salvar(Pessoa pessoa) throws Exception;

    void deletar(Long id_pessoa);
}
