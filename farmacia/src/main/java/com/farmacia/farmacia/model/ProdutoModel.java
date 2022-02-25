package com.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.farmacia.farmacia.repository.CategoriaRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class ProdutoModel {

	
        @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		@Size(min= 5, max=100)
		private String nome; 
		
		private int preco;

		@ManyToOne
		@JsonIgnoreProperties("produto")  //parar loop infinito
		private CategoriaRepository categoria;

}
