package com.example.projetointegrador.repositories;

import com.example.projetointegrador.models.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    List<Documento> findDocumentoByCpf(String cpf);

    List<Documento> findDocumentoByidentidade(String identidade);


}
