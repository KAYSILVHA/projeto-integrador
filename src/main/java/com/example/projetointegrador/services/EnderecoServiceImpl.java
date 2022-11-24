package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.EnderecoRepository;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService{
    final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    @Override
    public List<Endereco> listar(){
        return enderecoRepository.findAll();
    }
    @Override
    public Endereco editar(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    @Override
    public Endereco salvar(EnderecoDTO enderecoDTO) throws Exception {
        List<Endereco> listaDeEndereco= enderecoRepository.findAll();

        for(Endereco endereco1 : listaDeEndereco) {
            if(endereco.getCep().equals(endereco1.getCep())) {
                throw new Exception("Cep ja cadastrado, por favor digite outro!");
        }

        }
        Endereco endereco = Endereco.builder()
        .logradouro(enderecoDTO.getLogradouro());
        .numeroCasa(enderecoDTO.getNumeroCasa());
        .referencia(enderecoDTO.getReferencia());
        .cep(enderecoDTO.getCep());
        .build();


     return enderecoRepository.save(endereco);


}
    @Override
    public void deletar(Long id_endereco){
       enderecoRepository.deleteById(id_endereco);
    }
}