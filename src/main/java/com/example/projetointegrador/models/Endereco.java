package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.*;
=======
>>>>>>> origin/main
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="endereco")
<<<<<<< HEAD
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numeroCasa")
    private String numeroCasa;

=======

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identificador automatico
    
    @Column(name="id")
    private long id;
    
    @Column(name="logradouro")
    private String logradouro;
    
    @Column(name="numeroCasa")
    private String numeroCasa;
    
>>>>>>> origin/main
    @Column(name="referencia")
    private String referencia;
}
