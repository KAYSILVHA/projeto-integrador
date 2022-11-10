package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
    List<Pessoa> findPessoaByDocumento(String cpf);
    List<Pessoa> findPessoaByEndereco(String numeroCasa);

}
