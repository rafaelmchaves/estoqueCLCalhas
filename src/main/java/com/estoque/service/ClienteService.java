package com.estoque.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.entidade.Cliente;
import com.estoque.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
    private ClienteRepository repository;
	
	public void salvar(Cliente cliente) {
		cliente.setDataCriacao(LocalDateTime.now());
		repository.save(cliente);
	}
	
}
