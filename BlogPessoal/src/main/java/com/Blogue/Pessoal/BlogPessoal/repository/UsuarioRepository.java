package com.Blogue.Pessoal.BlogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blogue.Pessoal.BlogPessoal.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

	public Optional<UsuarioModel> findByEmail (String email);
	public List<UsuarioModel> findByNomeContainingIgnoreCase (String nome);
	
}
