package com.cadastro.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "sobrenome", nullable = false)
	private String sobrenome;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "data_nascimento")
	private LocalDate data_nascimento;
	
	@Column(name = "telefone")
	private long telefone;
	
	@Column(name = "email", nullable = false)
	private String email; 
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@OneToOne(mappedBy = "usuario")
	private Endereco endereco;

	
}