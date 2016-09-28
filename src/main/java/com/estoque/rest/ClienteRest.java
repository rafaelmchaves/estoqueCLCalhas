package com.estoque.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.entidade.Cliente;
import com.estoque.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteRest {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
	public void salvar(@RequestBody(required = true) Cliente cliente) {
		service.salvar(cliente);
	}
	
	@RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
	public List<Cliente> buscarTodos() {
		return service.buscarTodos();
	}
	
	@RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
	public void atualizarCliente(Cliente cliente) {
		service.atualizarCliente(cliente);
	}
}
