package br.com.blog.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blog.model.Comentario;
import br.com.blog.service.ComentarioService;

@RestController
@RequestMapping("/ed/comentario")
public class ComentarioEndPoint {

	@Autowired
	private ComentarioService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody Comentario comentario){
		
		service.save(comentario);
		System.out.println("Inserindo!");
		return new ResponseEntity<Comentario>(HttpStatus.OK);
	}
	
	@RequestMapping(value="" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>list(){
		
		System.out.println("Listando");
		return new ResponseEntity<List<Comentario>>(service.listAll(), HttpStatus.OK);
		
		
	}
}
