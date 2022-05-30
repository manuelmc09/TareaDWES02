package com.manuelmc09.TareaDWES02.servicios;

import java.util.List;

import com.manuelmc09.TareaDWES02.modelo.Bono;

public interface BonoService {

	public Bono saveBono(Bono bono);

	public List<Bono> getAllBono();

	public Bono getBonoById(Long id);

	public boolean modificarBono(Bono bono);

	public void deleteBonoById(Long id);

	public void updateBono(Bono bono);

}
