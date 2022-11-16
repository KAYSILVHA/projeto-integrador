package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {
    final PessoaRepository pessoaRepository;
    private Object Double;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa editar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) throws Exception {


        List<Pessoa> listaDePessoa = pessoaRepository.findAll();

        for (Pessoa pessoa1 : listaDePessoa) {
            if (pessoa.getDocumento().getCpf().equals(pessoa1.getDocumento().getCpf())) {
                throw new Exception("Cpf ja cadastrado, por favor digite outro!");

            } else if (pessoa.getDocumento().getIdentidade().equals(pessoa1.getDocumento().getIdentidade())) {
                throw new Exception("Identidade ja cadastrada, por favor digite outro!");
            } else if (pessoa.getEndereco().getNumeroCasa().equals(pessoa1.getEndereco().getNumeroCasa())) {
                throw new Exception("Numero de casa ja cadastrado, por favor digite outro!");

            }
        }
        return pessoaRepository.save(pessoa);

    }

    @Override
    public void deletar(Long id_pessoa) {
        pessoaRepository.deleteById(id_pessoa);
    }
    @Override

    public Double adicionarTaxa(Pessoa pessoa) {
    return pessoaRepository.save(pessoa).getCarteira().getSaldo();
}
    public void adicionarTaxa() {

        List<Pessoa>listaDeTaxa = pessoaRepository.findAll();
        for(Pessoa pessoa2 : listaDeTaxa){
            if(pessoa2.getCarteira().getSaldo()!=null)
        Double saldo = pessoa2.getCarteira().getSaldo();
        Double juros = pessoa2.getTaxa().getPorcentagem();
        Double rendimento = saldo + (saldo * (juros / 100));
        pessoa2.getCarteira().setSaldo(rendimento);
        pessoaRepository.save(pessoa2);
        }
        
    }
}
