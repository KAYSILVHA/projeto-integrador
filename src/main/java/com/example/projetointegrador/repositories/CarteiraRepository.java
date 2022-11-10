package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {


    List<Carteira> findCarteiraByNome(String nome);
}
