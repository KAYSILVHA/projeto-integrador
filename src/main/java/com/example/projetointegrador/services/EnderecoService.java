package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.EnderecoDTO;
import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Endereco;

import java.util.List;

public interface EnderecoService {

    List<Endereco> listar();

    Endereco editar(EnderecoDTO enderecoDTO);

    Endereco salvar(EnderecoDTO enderecoDTO) throws Exception;

    void deletar(Long id_endereco);
}


