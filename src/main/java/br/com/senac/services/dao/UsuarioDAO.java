package br.com.senac.services.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.services.model.Usuario;
import br.com.senac.services.repository.UsuarioRepository;

@Service
public class UsuarioDAO {
	
	@Autowired
	UsuarioRepository repository;
	
	public Usuario saveUser(Usuario usuario) {
		Usuario novoUsuario = null;
		try {
			return novoUsuario = repository.save(usuario); 
		} catch (Exception e){
			e.printStackTrace();
			return novoUsuario;
		}
	}

	public List<Usuario> findAll() {
		List<Usuario> novoUsuario = null;
		try {
			return novoUsuario = repository.findAll(); 
		} catch (Exception e){
			e.printStackTrace();
			return novoUsuario;
		}
	}

	public Usuario findId(Long id) {
		Usuario novoUsuario = null;
		try {
			return novoUsuario = repository.findId(id);
		} catch (Exception e) {
			e.printStackTrace();
			return novoUsuario;
		}
	}

	public List<Usuario> findByName(String name) {
		List<Usuario> novoUsuario = null;
		try {
			return novoUsuario = repository.findByName(name);
		} catch (Exception e) {
			e.printStackTrace();
			return novoUsuario;
		}
	}

	public Boolean delete(Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
