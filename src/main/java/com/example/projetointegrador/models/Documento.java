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
@EqualsAndHashCode(of = "id")
@Table(name="documento")
public class Documento {
    @Id
    @Column(name = "id_documento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_documento;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "identidade")
    private String identidade;

    @Column(name = "cnpj")
    private String cnpj;
}
