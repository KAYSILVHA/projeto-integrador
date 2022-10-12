package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//@=anotation
@Entity
@Data//lombook= get/set
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="documento")
    private Documento documento;

    @Column(name="endereco")
    private Endereco endereco;

    @Column(name="idade")
    private Integer idade;

    @Column(name="genero")
    private String genero;

    @Column(name="estadoCivil")
    private String estadoCivil;

    @Column(name="dependentes")
    private String dependentes;

    @Column(name="rendimentoMensal")
    private Double rendimentoMensal;

    @Column(name="Carteira")
    private Carteira carteira;

}
