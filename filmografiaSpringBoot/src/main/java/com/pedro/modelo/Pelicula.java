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
	
	private String director;
	
	@Id
	private String titulo;
	
	private String fecha;

	public Pelicula(String director, String titulo, String fecha) {
		
		this.director = director;
		this.titulo = titulo;
		this.fecha = fecha;

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

}
