package br.com.blog.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import br.com.blog.model.Comentario;

@Repository
public class ComentarioRepository extends AbstractBlogComentarioRepository{

	@SuppressWarnings("unchecked")
	public List<Comentario> listAll(){
		Criteria criteria = getSession().createCriteria(Comentario.class);
		return criteria.list();	
	}
	@Override
	public Object findById(int idBlog) {
		Criteria criteria = getSession().createCriteria(Comentario.class);
        criteria.add(Restrictions.eq("idBlog", idBlog));
        return criteria.uniqueResult();
	}
}
