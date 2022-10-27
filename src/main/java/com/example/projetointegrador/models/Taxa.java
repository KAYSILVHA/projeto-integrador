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
@Table(name="taxa")
public class Taxa {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

=======
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identificador automatico

    @Column(name="id")
    private long id;
    
    @Column(name="nome")
    private String nome;
    
>>>>>>> origin/main
    @Column(name="porcentagem")
    private String porcentagem;
}
