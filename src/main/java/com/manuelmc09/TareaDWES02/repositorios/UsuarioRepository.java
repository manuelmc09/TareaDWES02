package com.manuelmc09.TareaDWES02.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.manuelmc09.TareaDWES02.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
