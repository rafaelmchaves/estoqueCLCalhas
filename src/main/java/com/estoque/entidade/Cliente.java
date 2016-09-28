package com.estoque.entidade;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -7132339820974792655L;
	
	@Id
	private String id;
	private String nome;
	private String telefone1;
	private String telefone2;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String email;
	private LocalDateTime dataCriacao;
	
}
