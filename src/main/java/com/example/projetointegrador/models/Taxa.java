package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="taxa")
public class Taxa {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identificador automatico

    @Column(name="id")
    private long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="porcentagem")
    private String porcentagem;
}
