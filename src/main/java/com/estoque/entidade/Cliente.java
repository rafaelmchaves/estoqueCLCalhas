package com.estoque.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(name="nome")
	private String nome;
	@Column(name="telefone_1")
	private String telefone1;
	@Column(name="telefone_2")
	private String telefone2;
	@Column(name="rua")
	private String rua;
	@Column(name="numero")
	private String numero;
	@Column(name="complemento")
	private String complemento;
	@Column(name="bairro")
	private String bairro;
	@Column(name="cidade")
	private String cidade;
	@Column(name="estado")
	private String estado;
	@Column(name="cep")
	private String cep;
	@Column(name="email")
	private String email;
	
}
