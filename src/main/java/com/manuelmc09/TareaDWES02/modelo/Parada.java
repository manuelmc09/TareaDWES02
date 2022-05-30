package com.manuelmc09.TareaDWES02.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@NamedQueries({ @NamedQuery(name = "Parada.findAll", query = "SELECT p FROM Parada p"),
		@NamedQuery(name = "Parada.findById", query = "SELECT p FROM Parada p WHERE p.id= :id"),
		@NamedQuery(name = "Parada.findByNombre", query = "SELECT p FROM Parada p WHERE p.nombre= :nombre"), })
@Table(name = "paradas")
public class Parada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Pattern(regexp = "/[A-Za-z\s]{1,30}/")
	@Column(nullable = false, unique = true, length = 30)
	private String nombre;
	@ManyToMany(mappedBy = "paradas")
	private Set<Linea> lineas = new HashSet<Linea>();

	public Parada() {

	}

	public Parada(int id, @NotNull @Pattern(regexp = "/[A-Za-z ]{1,30}/") String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Parada(int id, @NotNull String nombre, Set<Linea> lineas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lineas = lineas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Linea> getLineas() {
		return lineas;
	}

	public void setLineas(Set<Linea> lineas) {
		this.lineas = lineas;
	}

	@Override
	public String toString() {
		return "Parada [id=" + id + ", nombre=" + nombre + ", lineas=" + lineas + "]";
	}

}
