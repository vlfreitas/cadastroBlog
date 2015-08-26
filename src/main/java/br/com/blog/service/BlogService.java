package br.com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.blog.model.Blog;
import br.com.blog.repository.BlogRepository;


@Service
@Transactional
public class BlogService {

	@Autowired
	private BlogRepository repository;
	
	
	public void save(Blog blog){
		repository.persist(blog);
	}
	
	public List<Blog> listAll(){
		return repository.listAll();
	}
}
