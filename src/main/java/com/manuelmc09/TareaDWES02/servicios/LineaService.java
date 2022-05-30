package com.manuelmc09.TareaDWES02.servicios;

import java.util.ArrayList;

import com.manuelmc09.TareaDWES02.modelo.Linea;
import com.manuelmc09.TareaDWES02.modelo.Usuario;

public interface LineaService {

	public Linea crearLinea(Linea l);

	public ArrayList<Linea> mostrarlineas();

	public ArrayList<Linea> mostrarLineasDeUsuario(Usuario u);

	public ArrayList<Linea> buscarLineasPorNombre(String nombre);
	
	public Linea existeLinea(String nombre);

}
