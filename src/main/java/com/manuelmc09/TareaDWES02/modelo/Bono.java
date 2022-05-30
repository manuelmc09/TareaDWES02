package com.manuelmc09.TareaDWES02.modelo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bonos")
public class Bono {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private char categoria;
	@Column(precision = 8, scale = 2, nullable = false)
	private float saldo = 0.0f;
	@OneToOne(mappedBy = "bono")
	private Usuario usuario;

	public Bono() {

	}

	public Bono(int id, char categoria, float saldo) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.saldo = saldo;
	}

	public Bono(int id, char categoria, float saldo, Usuario usuario) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.saldo = saldo;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, id, saldo, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bono other = (Bono) obj;
		return categoria == other.categoria && id == other.id
				&& Float.floatToIntBits(saldo) == Float.floatToIntBits(other.saldo)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Bono [id=" + id + ", categoria=" + categoria + ", saldo=" + saldo + ", usuario=" + usuario + "]";
	}
	
	

}
