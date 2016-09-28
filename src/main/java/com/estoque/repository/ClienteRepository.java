package com.estoque.repository;

import org.springframework.data.repository.CrudRepository;

import com.estoque.entidade.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
