package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Table(name="carteira")//nome do banco de dados da tabela
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identificador automatico
    @Column(name="id_carteira")
    private Long id_carteira;

    @Column(name="nome")
    private String nome;

    @Column(name="saldo")
    private Double saldo;

    @Column(name="dataInicioInvestimento")
    private LocalDate dataInicioInvestimento;

    @Column(name="dataTerminoInvestimento")
    private LocalDate dataTerminoInvestimento;


}
