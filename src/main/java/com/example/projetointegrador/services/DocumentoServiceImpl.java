package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.DocumentoRepository;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServiceImpl implements DocumentoService{
    final DocumentoRepository documentoRepository;

    public DocumentoServiceImpl(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }
    @Override
    public List<Documento> listar(){
        return documentoRepository.findAll();
    }
    @Override
    public Documento editar(Documento documento){
          Documento documento = Documento.builder()
        .cpf(documentoDTO.getCpf());
        .identidade(documentoDTO.getIdentidade());
        .cnpj(documentoDTO.getCnpj())
        .build();
        
        return documentoRepository.save(documento);
    }
    @Override
    public Documento salvar(DocumentoDTO documentoDTO) throws Exception {
        List<Documento> listaDeDocumento = documentoRepository.findAll();

        for(Documento documento1: listaDeDocumento){
            if(documento.getCpf().equals(documento1.getCpf()))

        { throw new Exception("Cpf ja cadastrado, por favor digite outro!");

        }else if(documento.getIdentidade().equals(documento1.getIdentidade()))

            { throw new Exception("Identidade ja cadastrada, por favor digite outra!");

            }

        }
        Documento documento = Documento.builder()
        .cpf(documentoDTO.getCpf());
        .identidade(documentoDTO.getIdentidade());
        .cnpj(documentoDTO.getCnpj())
        .build();
        return documentoRepository.save(documento);

}
     @Override
     public void deletar(Long id_documento){
        documentoRepository.deleteById(id_documento);
    }}

