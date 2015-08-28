package br.com.blog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;

	@Column(name = "coment")
	private String comentario;
	
	@ManyToOne
	@JoinColumn(name = "idBlog")
	private Blog blog;
	
	
	
	public Blog getBlog() {
		return blog;
	}
	
	public Blog setBlog(Blog blog){
		return this.blog = blog;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
