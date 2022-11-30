package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.TaxaDTO;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.repositories.PessoaRepository;
import com.example.projetointegrador.repositories.TaxaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxaServiceImpl implements TaxaService{
    final TaxaRepository taxaRepository;

    public TaxaServiceImpl(TaxaRepository taxaRepository) {
        this.taxaRepository = taxaRepository;
    }
    @Override
    public List<Taxa> listar(){
        return taxaRepository.findAll();
    }
    @Override
    public Taxa editar(Taxa taxa){
        Taxa taxa = Taxa.builder()
        .nome(taxaDTO.getNome())
        .porcentagem(taxaDTO.getPorcentagem() != null ? taxaDTO.getPorcentagem() : null)
        .build();
        
        return taxaRepository.save(taxa);
    }
    @Override
    public Taxa salvar(TaxaDTO taxaDTO) throws Exception {
        List<Taxa> listaDeTaxa = taxaRepository.findAll();
        for(Taxa taxa1 : listaDeTaxa){
            if(taxaDTO.getNome().equals(taxa1.getNome())) {
                throw new Exception ("Nome de taxa ja cadastrado, por favor digite outro!");
            }

        }
        Taxa taxa = Taxa.builder()
        .nome(taxaDTO.getNome())
        .porcentagem(taxaDTO.getPorcentagem() !=null ? taxaDTO.getPorcentagem() : null)
        .build();
        
        return taxaRepository.save(taxa);
    }
   @Override
        public void deletar(Long id_taxa){

        taxaRepository.deleteById(id_taxa);
    }
}
