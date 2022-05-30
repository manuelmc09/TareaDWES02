package com.manuelmc09.TareaDWES02.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@NamedQueries({ @NamedQuery(name = "Linea.findAll", query = "SELECT l FROM Linea l"),
		@NamedQuery(name = "Linea.findById", query = "SELECT l FROM Linea l WHERE l.id= :id"),
		@NamedQuery(name = "Linea.findByNombre", query = "SELECT l FROM Linea l WHERE l.nombre= :nombre"), })
@Table(name = "lineas")
public class Linea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Pattern(regexp = "/[A-Za-z\s]{1,30}/")
	@Column(nullable = false, unique = true, length = 30)
	private String nombre;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "lineasparada", joinColumns = { @JoinColumn(name = "idlinea") }, inverseJoinColumns = {
			@JoinColumn(name = "idparada") })
	private Set<Parada> paradas = new HashSet<Parada>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "viajelineas", joinColumns = { @JoinColumn(name = "idlinea") }, inverseJoinColumns = {
			@JoinColumn(name = "idviaje") })
	private Set<Viaje> viajes = new HashSet<Viaje>();

	public Linea() {

	}

	public Linea(int id, @NotNull String nombre, Set<Parada> paradas, Set<Viaje> viajes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.paradas = paradas;
		this.viajes = viajes;
	}

	public Linea(int id, @NotNull @Pattern(regexp = "/[A-Za-z ]{1,30}/") String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public Set<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(Set<Parada> paradas) {
		this.paradas = paradas;
	}

	public Set<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Set<Viaje> viajes) {
		this.viajes = viajes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, paradas, viajes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		return id == other.id && Objects.equals(nombre, other.nombre) && Objects.equals(paradas, other.paradas)
				&& Objects.equals(viajes, other.viajes);
	}

	@Override
	public String toString() {
		return "Linea [id=" + id + ", nombre=" + nombre + ", paradas=" + paradas + "]";
	}

}
