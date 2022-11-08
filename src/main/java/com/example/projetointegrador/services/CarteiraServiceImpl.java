package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.CarteiraDTO;
import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.repositories.CarteiraRepository;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraServiceImpl  implements CarteiraService {

    final CarteiraRepository carteiraRepository;

    public CarteiraServiceImpl(CarteiraRepository carteiraRepository) {
        this.carteiraRepository = carteiraRepository;
    }

    @Override
    public List<Carteira> listar() {
        return carteiraRepository.findAll();
    }

    @Override
    public Carteira editar(Carteira carteira) {
        return carteiraRepository.save(carteira);
    }

    @Override
    public Carteira salvar(Carteira carteira) {
        return carteiraRepository.save(carteira);
    }
    @Override
    public void deletar(Long id_carteira){
        carteiraRepository.deleteById(id_carteira);
    }
    }


