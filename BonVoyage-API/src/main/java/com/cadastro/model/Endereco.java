package com.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_endereco;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "numero", nullable = false)
	private long numero;
	
	@Column(name = "cep", nullable = false)
	private long cep;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;
	
}

