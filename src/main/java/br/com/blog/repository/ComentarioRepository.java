package br.com.blog.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import br.com.blog.model.Comentario;

@Repository
public class ComentarioRepository extends AbstractComentarioRepository{

	@SuppressWarnings("unchecked")
	public List<Comentario> listAll(){
		Criteria criteria = getSession().createCriteria(Comentario.class);
		return criteria.list();	
	}
}
