package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="carteira")//nome do banco de dados da tabela
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identificador automatico

    @Column(name="id")
    private long id;

    @Column(name="nome")
    private String nome;

    @Column(name="saldo")
    private Double saldo;

    @Column(name="dataInicioInvestimento")
    private Date dataInicioInvestimento;

    @Column(name="dataTerminoInvestimento")
    private Date dataTerminoInvestimento;


}
