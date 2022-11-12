# projeto-integrador
Software de poupança

Validações


[X]Não deixar salvar uma carteira com o mesmo nome;

[X]Não deixar salvar pessoa com o mesmo cpf ou identidade;

[X]Não deixar salvar uma pessoa com o mesmo numero da casa;

[X]Não deixar salvar uma taxa com o mesmo nome;

[X]Não deixar salvar um documento com o mesmo cpf ou identidade;

[X]Não deixar salvar um endereço com o mesmo cep;


DIAGRAMA  DE  DADOS

 ![Modelagem](https://user-images.githubusercontent.com/114036212/201235994-f52c308a-5883-4607-919c-e800b30d6170.svg)


criar uma classe nova fora de todas as pastas(clicar no java/com/example...)
Scheduler

@Component
@EnableScheduling
@Service

public class Scheduler{
    @Scheduled(initialDeDelay=10000, fixdRate= 1500000)
    public void executaAgendamentos () {
        System.out.println("O agendamento foi iniciado");
    }
}

dentro de pessoaserviceimpl(rascunho)

@Override
    public Taxa adicionarTaxa(Taxa taxa) {
        List<Taxa>listaDeTaxa=taxaRepository.findAll();
        Integer saldo=carteira.getSaldo();
        Integer percentual=taxa.getPorcentagem();
        Integer soma= saldo+(percentual*saldo/100);
        return taxaRepository.save(taxa);
        }

add o percentual ao cliente
Integer saldo=carteira.getSaldo();
        Integer percentual=taxa.getPorcentagem();
        Integer soma= saldo+(percentual*saldo/100);


Eu mexi em:
pessoaserviceimpl
pessoaservice
taxarepository


passar algum comando dentro do saldo para q ele se altere