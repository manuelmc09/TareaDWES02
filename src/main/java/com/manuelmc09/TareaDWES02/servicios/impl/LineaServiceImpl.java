package com.manuelmc09.TareaDWES02.servicios.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.modelo.Linea;
import com.manuelmc09.TareaDWES02.modelo.Usuario;
import com.manuelmc09.TareaDWES02.repositorios.LineaRepository;
import com.manuelmc09.TareaDWES02.servicios.LineaService;

@Service
public class LineaServiceImpl implements LineaService {
	@Autowired
	private LineaRepository repo;

	@Override
	public Linea crearLinea(Linea l) {
		return repo.save(l);
	}

	@Override
	public ArrayList<Linea> mostrarlineas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Linea> mostrarLineasDeUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Linea> buscarLineasPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Linea existeLinea(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
