package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Endereco;

import java.util.List;

public interface EnderecoService {

    List<Endereco> listar();

    Endereco editar(Endereco endereco);

    Endereco salvar(Endereco endereco);
    
    void deletar(Long id_endereco);
}

