package br.com.blog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Blog(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "site")
	private String site;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	
}
