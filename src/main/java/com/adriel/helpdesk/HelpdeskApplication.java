package com.adriel.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adriel.helpdesk.domain.Chamado;
import com.adriel.helpdesk.domain.Cliente;
import com.adriel.helpdesk.domain.Tecnico;
import com.adriel.helpdesk.domain.enums.Perfil;
import com.adriel.helpdesk.domain.enums.Prioridade;
import com.adriel.helpdesk.domain.enums.Status;
import com.adriel.helpdesk.repository.ChamadoRepository;
import com.adriel.helpdesk.repository.ClienteRepository;
import com.adriel.helpdesk.repository.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tecnico = new Tecnico(null,"Adriel", "10402004560", "adriel@gadriel", "123");
		tecnico.addPerfil(Perfil.ADMIN);
		
		Cliente cliente = new Cliente(null, "joao", "12312312323", "joao@joao", "123");
		
		Chamado chamado = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnico, cliente);
	
		tecnicoRepository.saveAll(Arrays.asList(tecnico));
		clienteRepository.saveAll(Arrays.asList(cliente));
		chamadoRepository.saveAll(Arrays.asList(chamado));
		
	}

}