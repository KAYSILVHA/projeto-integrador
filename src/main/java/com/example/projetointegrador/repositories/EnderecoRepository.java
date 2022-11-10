package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    List<Endereco> findEnderecoByCep(String cep);


}
