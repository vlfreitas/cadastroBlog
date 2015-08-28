package br.com.blog.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractBlogComentarioRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void persist(Object entity) {
	     getSession().persist(entity);
	}
	
	public void update(Object entity) {
       getSession().update(entity);
    }
	
	public abstract Object findById(int id);
}
