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
    @Column(name="id_pessoa")
    private Long Id_pessoa;

    @Column(name="nome")
    private String nome;

    @ManyToOne ( cascade ={ CascadeType . MERGE , CascadeType . DETACH , CascadeType . REFRESH , CascadeType . PERSIST }, fetch = FetchType . LAZY )
    @JoinTable (name= "documento_pessoa " ,
            joinColumns = @JoinColumn(name = "id_documento"),
            inverseJoinColumns = @JoinColumn(name = "id_pessoa"))
    private Documento  documento;

   @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch=FetchType.LAZY)
    @JoinTable(name="pessoa_endereco",
               joinColumns= @JoinColumn(name="id_endereco"),
               inverseJoinColumns= @JoinColumn(name="id_pessoa"))
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

    @ManyToOne ( cascade ={ CascadeType.MERGE , CascadeType.DETACH , CascadeType.REFRESH , CascadeType.PERSIST }, fetch = FetchType.LAZY )
    @JoinTable (name= "pessoa_carteira" ,
            joinColumns = @JoinColumn(name = "id_carteira"),
            inverseJoinColumns = @JoinColumn(name = "id_pessoa"))
    private Carteira carteira;
}
