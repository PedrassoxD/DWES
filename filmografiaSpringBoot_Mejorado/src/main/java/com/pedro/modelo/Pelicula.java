/**
 * 
 */
package com.pedro.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pedro
 *
 */
@Entity
@Table
public class Pelicula implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String director;

	private String titulo;
	
	private String fecha;
	
	private String foto;

	public Pelicula(int id, String director, String titulo, String fecha, String foto) {
		
		this.id = id;
		this.director = director;
		this.titulo = titulo;
		this.fecha = fecha;
		this.foto = foto;

	}

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
