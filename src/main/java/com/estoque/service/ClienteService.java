package com.estoque.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Cliente> buscarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		repository.findAll().forEach(cliente -> clientes.add(cliente));
		return clientes;
	}
	
	public void atualizarCliente(Cliente cliente) {
		repository.save(cliente);
	}
	
}
