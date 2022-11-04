package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.repositories.CarteiraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraServiceImpl  implements CarteiraService{

        final CarteiraRepository carteiraRepository;

        public CarteiraServiceImpl(CarteiraRepository carteiraRepository) {
            this.carteiraRepository = carteiraRepository;
        }
        @Override
        public List<Carteira> listar(){
            return carteiraRepository.findAll();
        }
        @Override
        public Carteira editar(Carteira carteira){
            return carteiraRepository.save(carteira);
        }
        @Override
        public Carteira salvar(Carteira carteira){
            return carteiraRepository.save(carteira);
        }
        @Override
        public void deletar(Long id_carteira){
        pessoaRepository.deleteById(id_carteira):
    }}



       
