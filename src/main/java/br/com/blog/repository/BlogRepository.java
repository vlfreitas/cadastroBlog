package br.com.blog.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.blog.model.Blog;

@Repository
public class BlogRepository extends AbstractBlogComentarioRepository {

	@SuppressWarnings("unchecked")
	public List<Blog> listAll(){
		Criteria criteria = getSession().createCriteria(Blog.class);
		return criteria.list();	
	}
	@Override
	public Object findById(int id) {
		Criteria criteria = getSession().createCriteria(Blog.class);
        criteria.add(Restrictions.eq("id",id));
        return criteria.uniqueResult();
	}

	
}
