package com.estoque.entidade;

import java.io.Serializable;

import lombok.Data;

@Data
public class VendaProduto implements Serializable {

	private static final long serialVersionUID = -4366579893271969801L;
	
	private Integer qtdProduto;
	private Integer idProduto;
}
