package br.com.blog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nomeB")
	private String nomeB;
	
	@Column(name = "comentarioB")
	private String comentarioB;

	public String getNomeB() {
		return nomeB;
	}

	public void setNomeB(String nomeB) {
		this.nomeB = nomeB;
	}

	public String getComentarioB() {
		return comentarioB;
	}

	public void setComentarioB(String comentarioB) {
		this.comentarioB = comentarioB;
	}
	
}
