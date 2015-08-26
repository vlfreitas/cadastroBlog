package br.com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.blog.model.Blog;
import br.com.blog.service.BlogService;

@Controller
@RequestMapping("/Blog")
public class blogController {

	public static final String VIEW = "view";
	
	@Autowired
	private BlogService service;
	
	@RequestMapping(value = "" , method = RequestMethod.POST)
	public ModelAndView save(Blog blog){
		service.save(blog);
		
		return listAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView listAll(){
		
		ModelAndView modView = new ModelAndView(VIEW);
		modView.addObject("blog", service.listAll());
		return modView;
		
		
	}
}
