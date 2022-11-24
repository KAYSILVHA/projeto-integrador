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
    private Date dataInicioInvestimento;

    @Column(name="dataTerminoInvestimento")
    private Date dataTerminoInvestimento;


}
