package com.LojaGames.LojaGames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.LojaGames.LojaGames.model.UsuarioLoginModel;
import com.LojaGames.LojaGames.model.UsuarioModel;
import com.LojaGames.LojaGames.repository.UsuarioRepository;



@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<UsuarioModel> cadastrarUsuario(UsuarioModel usuario){
		
		if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) // Verifica se o repositório/banco de dados já contém o email digitado
			return Optional.empty(); // Caso exista, retorna vazio
		
		usuario.setSenha(criptografarSenha(usuario.getSenha())); // Pega a senha o UsuarioModel, faz a criptografia, e altera, ou insere, com o comando set
		
		return Optional.of(usuarioRepository.save(usuario)); // Salva
		
	}
	
	public Optional<UsuarioModel> atualizarUsuario(UsuarioModel usuario) {

		
		if(usuarioRepository.findById(usuario.getId()).isPresent()) {
			
			Optional<UsuarioModel> buscaUsuario = usuarioRepository.findByEmail(usuario.getEmail());
			
			if ( (buscaUsuario.isPresent()) && ( buscaUsuario.get().getId() != usuario.getId()))
				throw new ResponseStatusException(
						HttpStatus.BAD_REQUEST, "Email já existe!", null);
			
			usuario.setSenha(criptografarSenha(usuario.getSenha()));

			return Optional.ofNullable(usuarioRepository.save(usuario));
			
		}
		
			return Optional.empty();
	
	}	
	
	public Optional<UsuarioLoginModel> autenticarUsuario(Optional<UsuarioLoginModel> usuarioLogin){
		
		Optional<UsuarioModel> usuario = usuarioRepository.findByEmail(usuarioLogin.get().getEmail());
		
		if(usuario.isPresent()) {
			
			if(compararSenhas(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {
				
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setToken(gerarBasicToken(usuarioLogin.get().getEmail(), usuarioLogin.get().getSenha()));
				usuarioLogin.get().setSenha(usuario.get().getSenha());
				
				return usuarioLogin;
			}
		}
		
		return Optional.empty();
	}
	
	private String criptografarSenha(String senha) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(senha);
	}
	
	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.matches(senhaDigitada, senhaBanco);
		
	}
	
	private String gerarBasicToken(String usuario, String senha) {
		
		String token = usuario + ":" + senha;
		byte[] tokenBase64 = Base64.encodeBase64(token.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(tokenBase64);
		
	}
	
}