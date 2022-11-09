# projeto-integrador
Software de poupança

Validações


[X]Não deixar salvar uma carteira com o mesmo nome;

[X]Não deixar salvar pessoa com o mesmo cpf ou identidade;

[X]Não deixar salvar uma pessoa com o mesmo numero da casa;

[X]Não deixar salvar uma taxa com o mesmo nome;

[X]Não deixar salvar um documento com o mesmo cpf ou identidade;

[ ]Não deixar salvar um endereço com o mesmo cep;


 List<Pessoa> listaDePessoas = pessoaRepository.findAll();
        if(pessoa.getCpf().equals(listaDePessoas)){
            System.out.println("Cpf ja cadastrado, por favor digite outro!");
        }else if(pessoa.getIdentidade().equals(listaDePessoas)){
          System.out.println("Identidade ja cadastrada, por favor digite outro!");
        }else{
  return pessoaRepository.save(pessoa);
     }
      return pessoa;
     }

  
   List<Pessoa> listaDePessoas = pessoaRepository.findAll();
        if(pessoa.getEndereco(numeroCasa).equals(listaDePessoas)){
            System.out.println("Numero de casas ja cadastrado, por favor digite outro!");
        } else{
  return pessoaRepository.save(pessoa);
     }
      return pessoa;
     }
  
   List<Taxa> listaDeTaxas = taxaRepository.findAll();
        if(taxa.getNome().equals(listaDeTaxas)){
            System.out.println("Nome de taxa ja cadastrado, por favor digite outro!");
        } else{
  return taxaRepository.save(taxa);
     }
      return taxa;
     }
  
  List<Documento> listaDeDocumentos = documentoRepository.findAll();
        if(documento.getCpf().equals(listaDeDocumentos)){
            System.out.println("Cpf ja cadastrado, por favor digite outro!");
        }else if(documento.getIdentidade().equals(listaDeDocumentos)){
          System.out.println("Identidade ja cadastrada, por favor digite outro!");
        }else{
  return documentoRepository.save(documento);
     }
      return documento;
     }
  
   List<Endereco> listaDeEnderecos = enderecoRepository.findAll();
        if(endereco.getCep().equals(listaDeEnderecos)){
            System.out.println("Nome de taxa ja cadastrado, por favor digite outro!");
        } else{
  return enderecoRepository.save(endereco);
     }
      return endereco;
     }
