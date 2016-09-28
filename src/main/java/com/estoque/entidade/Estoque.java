package com.estoque.entidade;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="estoque")
@Data
public class Estoque {

	@Id
	private String id;
	private String idProduto;
	private Integer qtd;
	private String centroCusto;
	private LocalDateTime dataCriacao;
	
}
