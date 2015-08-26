package br.com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.blog.model.Comentario;
import br.com.blog.repository.ComentarioRepository;

@Service
@Transactional
public class ComentarioService {

	@Autowired
	private ComentarioRepository repository;
	
	
	public void save(Comentario comentario){
		repository.persist(comentario);
	}
	
	public List<Comentario> listAll(){
		return repository.listAll();
	}
}
