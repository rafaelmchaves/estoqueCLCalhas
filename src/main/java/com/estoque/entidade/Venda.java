package com.estoque.entidade;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="vendas")
@Data
public class Venda implements Serializable {

	private static final long serialVersionUID = -4622707270621586133L;
	
	@Id
	private Integer id;
	private String idCliente;
	private String centroCusto;
	private List<VendaProduto> vendasProduto;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataEntega;
}
