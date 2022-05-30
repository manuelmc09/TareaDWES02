package com.manuelmc09.TareaDWES02.servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.manuelmc09.TareaDWES02.modelo.Usuario;
import com.manuelmc09.TareaDWES02.modelo.Viaje;

public interface ViajeService {

	public Viaje crearViaje(Viaje v);

	public void eliminarViaje(Viaje v);

	public boolean modificarViaje(Viaje v);

	public void verDetallesViaje(Viaje v);

	public Viaje findById(Long id);

	public ArrayList<Viaje> mostrarViajes();

	public ArrayList<Viaje> mostrarViajesPorFecha(LocalDateTime fecha);

	public ArrayList<Viaje> mostrarViajesDeUsuarioEntreFechas(Usuario u, LocalDate fechaini, LocalDate fechafin);

}
