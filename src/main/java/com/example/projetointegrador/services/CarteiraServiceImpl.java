package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.CarteiraDTO;
import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.repositories.CarteiraRepository;
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
    public Carteira editar(CarteiraDTO carteiraDTO) {
         Carteira carteira= Carteira.builder()
                 .nome(carteiraDTO.getNome())
                 .saldo(carteiraDTO.getSaldo())
                 .dataInicioInvestimento(carteiraDTO.getDataInicioInvestimento())
                 .dataTerminoInvestimento(carteiraDTO.getDataTerminoInvestimento())
                 .build();

        return carteiraRepository.save(carteira);
    }

    @Override
    public Carteira salvar(CarteiraDTO carteiraDTO) throws Exception {
        List<Carteira> listaDeCarteira = carteiraRepository.findAll();
        for (Carteira carteira1: listaDeCarteira) {
            if(carteiraDTO.getNome().equals(carteira1.getNome())) {
                throw new Exception("Esse nome já esta cadastrado!");
            }
        }
        Carteira carteira= Carteira.builder()
        .nome(carteiraDTO.getNome())
        .saldo(carteiraDTO.getSaldo())
        .dataInicioInvestimento(carteiraDTO.getDataInicioInvestimento())
        .dataTerminoInvestimento(carteiraDTO.getDataTerminoInvestimento())
        .build();
        
        return carteiraRepository.save(carteira);
    }
    @Override
    public void deletar(Long id_carteira){
        carteiraRepository.deleteById(id_carteira);
    }}



       
