package com.manuelmc09.TareaDWES02.servicios.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.modelo.Parada;
import com.manuelmc09.TareaDWES02.repositorios.ParadaRepository;
import com.manuelmc09.TareaDWES02.servicios.ParadaService;

@Service
public class ParadaServiceImpl implements ParadaService {
	
	@Autowired
	private ParadaRepository repo;
	
	@Override
	public Parada nuevaParada(Parada p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarParada(Parada p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean modificarParada(Parada p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Parada findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Parada> mostrarParadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Parada> buscarParadasPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parada existeParada(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
