package com.estoque.entidade;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="produtos")
@Data
public class Produto implements Serializable {

	private static final long serialVersionUID = 3819101894026925011L;
	
	@Id
	private String id;
	private String nomeProduto;
	private LocalDateTime dataCriacao;
	
}
