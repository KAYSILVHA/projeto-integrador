package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.models.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {
    List<Taxa> findTaxaByNome(String nome);
    List<Taxa> findTaxaByPorcentagemAndCarteira_Saldo(Double porcentagem, Double saldo);

}
