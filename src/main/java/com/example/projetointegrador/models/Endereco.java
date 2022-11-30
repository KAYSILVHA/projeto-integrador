package com.example.projetointegrador.models;

import lombok.*;


import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_endereco")
    private Long Id_endereco;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numeroCasa")
    private String numeroCasa;

    @Column(name="cep")
    private String cep;
}
