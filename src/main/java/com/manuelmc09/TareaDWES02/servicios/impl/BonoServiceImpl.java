package com.manuelmc09.TareaDWES02.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.modelo.Bono;
import com.manuelmc09.TareaDWES02.repositorios.BonoRepository;
import com.manuelmc09.TareaDWES02.repositorios.UsuarioRepository;
import com.manuelmc09.TareaDWES02.servicios.BonoService;

@Service
public class BonoServiceImpl implements BonoService {
	@Autowired
	private BonoRepository bonorepo;
	@Autowired
	private UsuarioRepository usuariorepo;

	@Override
	public Bono saveBono(Bono bono) {
		
		return bonorepo.save(bono);
	}

	@Override
	public List<Bono> getAllBono() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bono getBonoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificarBono(Bono bono) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteBonoById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBono(Bono bono) {
		// TODO Auto-generated method stub

	}

}
