package com.example.projetointegrador.dto;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Endereco;
import lombok.Data;

import javax.persistence.*;

@Data

public class PessoaDTO {
    private Long id_pessoa;
    private String nome;
    private Documento documento;
    private Endereco endereco;
    private Integer idade;
    private String genero;
    private String estadoCivil;
    private String dependentes;
    private Double rendimentoMensal;
    private Carteira carteira;
    private String taxa;

}
