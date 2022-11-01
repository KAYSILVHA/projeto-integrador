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
@Table(name="taxa")
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_taxa")
    private Long id_taxa;

    @Column(name="nome")
    private String nome;

    @Column(name="porcentagem")
    private String porcentagem;
}
