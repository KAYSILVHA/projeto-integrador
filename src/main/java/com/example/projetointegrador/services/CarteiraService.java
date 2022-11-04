package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;

import java.util.List;

public interface CarteiraService {
    List<Carteira> listar();

    Carteira editar(Carteira carteira);

    Carteira salvar(Carteira carteira);
}
