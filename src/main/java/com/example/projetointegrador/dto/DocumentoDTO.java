package com.example.projetointegrador.dto;

import lombok.Data;
import java.util.Date;
@Data

public class DocumentoDTO {
    private Long id_documento;
    private String cpf;
    private String identidade;
    private String cnpj;
}
