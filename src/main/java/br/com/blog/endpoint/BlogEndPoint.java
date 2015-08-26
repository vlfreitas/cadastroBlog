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

import br.com.blog.model.Blog;
import br.com.blog.service.BlogService;

@RestController
@RequestMapping("/ed/blog")
public class BlogEndPoint {

	@Autowired
		private BlogService service;
		
		@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> save(@RequestBody Blog blog){
			
			service.save(blog);
			
			return new ResponseEntity<Blog>(HttpStatus.OK);
		}
		
		@RequestMapping(value="" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?>list(){
			
			return new ResponseEntity<List<Blog>>(service.listAll(), HttpStatus.OK);
			
			
		}

}
