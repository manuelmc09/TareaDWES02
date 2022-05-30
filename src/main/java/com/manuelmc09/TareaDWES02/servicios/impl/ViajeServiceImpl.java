package com.manuelmc09.TareaDWES02.servicios.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.modelo.Usuario;
import com.manuelmc09.TareaDWES02.modelo.Viaje;
import com.manuelmc09.TareaDWES02.repositorios.ViajeRepository;
import com.manuelmc09.TareaDWES02.servicios.ViajeService;

@Service
public class ViajeServiceImpl implements ViajeService {

	@Autowired
	private ViajeRepository repo;

	@Override
	public Viaje crearViaje(Viaje v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarViaje(Viaje v) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean modificarViaje(Viaje v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verDetallesViaje(Viaje v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Viaje findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Viaje> mostrarViajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Viaje> mostrarViajesPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Viaje> mostrarViajesDeUsuarioEntreFechas(Usuario u, LocalDate fechaini, LocalDate fechafin) {
		// TODO Auto-generated method stub
		return null;
	}

}
