package com.manuelmc09.TareaDWES02.validaciones;

import com.manuelmc09.TareaDWES02.modelo.Usuario;

public class Validaciones {

	public static boolean validarUsuario(Usuario u) {
		boolean valido = false;
		if ((u.getNombre().length() <= 100) && (u.getEdad() > 0)) {
			return true;
		}
		return false;
	}
}
