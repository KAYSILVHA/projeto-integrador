package com.example.projetointegrador.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private Long id_endereco;
    private String logradouro;
    private String numeroCasa;
    private String referencia;
    private String cep;
}

