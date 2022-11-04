package com.example.projetointegrador.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class CarteiraDTO {
    private Long id_carteira;
    private String nome;
    private Double saldo;
    private LocalDate dataInicioInvestimento;
    private LocalDate dataTerminoInvestimento;



}
