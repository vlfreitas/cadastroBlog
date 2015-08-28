package br.com.blog.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "blog")
public class Blog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "site")
	private String site;
	
	@Transient
	@OneToMany(mappedBy = "blog", targetEntity = Comentario.class, fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Comentario> comentarios;
	
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}

	
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

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
