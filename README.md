# projeto-integrador
Software de poupança

Validações
[ ]Não deixar salvar uma carteira com o mesmo nome;
[ ]Não deixar salvar pessoa com o mesmo cpf ou identidade;
[ ]Não deixar salvar uma pessoa com o mesmo numero da casa;
[ ]Não deixar salvar uma taxa com o mesmo nome;
[ ]Não deixar salvar um documento com o mesmo cpf ou identidade;
[ ]Não deixar salvar um endereço com o mesmo cep;

antes do metodo salvar
public Endereco salvar(Endereco endereco) {
if(){
System.out.println("Esse nome de Carteira ja existe, por favor digite outro!");
}
return enderecoRepository.save(endereco);
}