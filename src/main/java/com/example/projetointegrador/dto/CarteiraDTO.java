package com.example.projetointegrador.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CarteiraDTO {
    private Long id;
    private String nome;
    private Double saldo;
    private Date dataInicioInvestimento;
    private Date dataTerminoInvestimento;



}
