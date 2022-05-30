package com.manuelmc09.TareaDWES02.servicios;

import java.util.ArrayList;

import com.manuelmc09.TareaDWES02.modelo.Parada;

public interface ParadaService {

	public Parada nuevaParada(Parada p);

	public void eliminarParada(Parada p);

	public boolean modificarParada(Parada p);

	public Parada findById(Long id);

	public ArrayList<Parada> mostrarParadas();

	public ArrayList<Parada> buscarParadasPorNombre(String nombre);

	public Parada existeParada(String nombre);

}
