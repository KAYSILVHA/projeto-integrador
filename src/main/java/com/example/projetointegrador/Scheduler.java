package com.example.projetointegrador;

import com.example.projetointegrador.services.PessoaServiceImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@EnableScheduling
@Service

public class Scheduler {

        final PessoaServiceImpl pessoaServiceImpl;

        public Scheduler(PessoaServiceImpl pessoaServiceImpl){
            this.pessoaServiceImpl=pessoaServiceImpl;
        }
        @Scheduled(initialDelay=10000, fixedRate= 1500000)

        public void executarAgendamentos () {
            pessoaServiceImpl.adicionarTaxa();
            System.out.println("O agendamento foi iniciado");

        }
    }
