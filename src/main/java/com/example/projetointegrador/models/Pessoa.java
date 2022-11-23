package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;


//@=anotation
@Entity
@Data//lombook= get/set
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Table(name="pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pessoa")
    private Long Id_pessoa;

    @Column(name="nome")
    private String nome;

    @ManyToOne ( cascade ={ CascadeType . MERGE , CascadeType . DETACH , CascadeType . REFRESH , CascadeType . PERSIST }, fetch = FetchType . EAGER )
    @JoinTable (name= "documento_pessoa " ,
            joinColumns = @JoinColumn(name = "id_pessoa"),
            inverseJoinColumns = @JoinColumn(name = "id_documento"))
    private Documento  documento;

   @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch=FetchType.EAGER)
    @JoinTable(name="pessoa_endereco",
               joinColumns= @JoinColumn(name="id_pessoa"),
               inverseJoinColumns= @JoinColumn(name="id_endereco"))
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

    @ManyToOne ( cascade ={ CascadeType.MERGE , CascadeType.DETACH , CascadeType.REFRESH , CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable (name= "pessoa_carteira" ,
            joinColumns = @JoinColumn(name = "id_pessoa"),
            inverseJoinColumns = @JoinColumn(name = "id_carteira"))
    private Carteira carteira;


    @ManyToOne ( cascade ={ CascadeType.MERGE , CascadeType.DETACH , CascadeType.REFRESH , CascadeType.PERSIST }, fetch = FetchType.EAGER )
    @JoinTable (name= "pessoa_taxa" ,
            joinColumns = @JoinColumn(name = "id_pessoa"),
            inverseJoinColumns = @JoinColumn(name = "id_taxa"))
    private Taxa taxa;
}
