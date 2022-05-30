package com.manuelmc09.TareaDWES02.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int edad;
	@NotNull
	@Size(max = 100)
	@Column(nullable = false)
	private String nombre;
	@OneToOne()
	@JoinColumn(name = "idbono", unique = true, nullable = false)
	private Bono bono;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Viaje> viajes = new HashSet<Viaje>();

	public Usuario() {

	}

	public Usuario(int id, int edad, @NotNull @Size(max = 100) String nombre) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}

	public Usuario(int id, int edad, @NotNull @Size(max = 100) String nombre, Bono bono, Set<Viaje> viajes) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.bono = bono;
		this.viajes = viajes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bono getBono() {
		return bono;
	}

	public void setBono(Bono bono) {
		this.bono = bono;
	}

	public Set<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Set<Viaje> viajes) {
		this.viajes = viajes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bono, edad, id, nombre, viajes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(bono, other.bono) && edad == other.edad && id == other.id
				&& Objects.equals(nombre, other.nombre) && Objects.equals(viajes, other.viajes);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", bono=" + bono + "]";
	}

}
