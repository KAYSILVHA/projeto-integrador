package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numeroCasa")
    private String numeroCasa;

    @Column(name="referencia")
    private String referencia;
}
