package com.manuelmc09.TareaDWES02.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.manuelmc09.TareaDWES02.MyUserDetails;
import com.manuelmc09.TareaDWES02.modelo.Role;
import com.manuelmc09.TareaDWES02.modelo.User;
import com.manuelmc09.TareaDWES02.repositorios.UserRepository;


@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Busca el usuario con el repositorio y si no existe lanza una exception
		User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
		//Mapear nuestra lista de Roles con la de spring security 
		List grantList=new ArrayList();
		 for (Role roles: user.getRoles()) {
			 
		 }

		return new MyUserDetails(user);
	}

	/*@Override
	public Integer saveUser(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		boolean enabled = user.isEnabled();
		String encodedPasswod = bCryptPasswordEncoder.encode(password);
		user.setPassword(encodedPasswod);
		user.setUsername(username);
		user.setEnabled(enabled);
		user = userRepository.save(user);
		return (int) user.getId();
	}*/

}
