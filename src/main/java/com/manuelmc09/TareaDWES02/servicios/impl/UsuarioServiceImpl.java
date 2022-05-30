package com.manuelmc09.TareaDWES02.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.modelo.Bono;
import com.manuelmc09.TareaDWES02.modelo.Usuario;
import com.manuelmc09.TareaDWES02.repositorios.BonoRepository;
import com.manuelmc09.TareaDWES02.repositorios.UsuarioRepository;
import com.manuelmc09.TareaDWES02.servicios.UsuarioService;
import com.manuelmc09.TareaDWES02.validaciones.Validaciones;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuariorepo;
	@Autowired
	private BonoRepository bonorepo;

	@Override
	public Usuario saveUsuario(Usuario u) {
		Bono nuevo = new Bono();
		nuevo.setCategoria('A');
		nuevo.setSaldo(0.0f);
		if (bonorepo.save(nuevo) != null)
			u.setBono(nuevo);
		else
			return null;
		boolean valido = Validaciones.validarUsuario(u);
		if (valido)
			return usuariorepo.save(u);
		else
			return null;
	}

	@Override
	public List<Usuario> getAllUsuario() {
		return usuariorepo.findAll();
	}

	@Override
	public List<Usuario> getUsuariosByNombre(String nombre) {
		List<Usuario> todos = usuariorepo.findAll();

		return todos;
	}

	@Override
	public Usuario getUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUsuarioById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUsuario(Usuario u) {
		// TODO Auto-generated method stub

	}

}
