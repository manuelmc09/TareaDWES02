package com.manuelmc09.TareaDWES02.servicios;

import java.util.List;

import com.manuelmc09.TareaDWES02.modelo.Bono;
import com.manuelmc09.TareaDWES02.modelo.Usuario;

public interface UsuarioService {
	public Usuario saveUsuario(Usuario u);

	public List<Usuario> getAllUsuario();
	
	public List<Usuario> getUsuariosByNombre(String nombre);

	public Usuario getUsuarioById(Long id);

	public boolean modificarUsuario(Usuario u);

	public void deleteUsuarioById(Long id);

	public void updateUsuario(Usuario u);


}
