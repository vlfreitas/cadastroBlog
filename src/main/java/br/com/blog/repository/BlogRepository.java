package br.com.blog.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import br.com.blog.model.Blog;

@Repository
public class BlogRepository extends AbstractBlogRepository {

	@SuppressWarnings("unchecked")
	public List<Blog> listAll(){
		Criteria criteria = getSession().createCriteria(Blog.class);
		return criteria.list();	
	}

	
}
