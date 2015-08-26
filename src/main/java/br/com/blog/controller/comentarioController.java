package br.com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.blog.model.Comentario;
import br.com.blog.service.ComentarioService;

@Controller
@RequestMapping("/blog/id/comentario")
public class comentarioController {


	public static final String VIEW = "viewComentario";
	
	@Autowired
	private ComentarioService service;
	
	@RequestMapping(value = "" , method = RequestMethod.POST)
	public ModelAndView save(Comentario comentario){
		service.save(comentario);
		
		return listAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView listAll(){
		
		ModelAndView modView = new ModelAndView(VIEW);
		modView.addObject("comentario", service.listAll());
		return modView;
		
		
	}
}
