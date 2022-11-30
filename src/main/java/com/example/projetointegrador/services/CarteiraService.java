package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.CarteiraDTO;
import com.example.projetointegrador.models.Carteira;

import java.util.List;

public interface CarteiraService {
    List<Carteira> listar();

    Carteira editar(CarteiraDTO carteiraDTO);
 
    Carteira salvar(CarteiraDTO carteiraDTO) throws Exception;

    void deletar(Long id_carteira);
}
