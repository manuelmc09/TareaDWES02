package com.manuelmc09.TareaDWES02.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.manuelmc09.TareaDWES02.servicios.impl.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService uds;
	

	@Autowired
	private BCryptPasswordEncoder encoder;

	//Creamos el encriptador de contraseñas
	//El numero 4 representa que tan fuerte queremos la encriptacion.
	//Se puede en un rango entre 4 y 31. 
	//Si no ponemos un numero el programa utilizara uno aleatoriamente cada vez
	//que iniciemos la aplicacion, por lo cual tlas contrasenas encriptadas no funcionaran bien
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(4);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(uds).passwordEncoder(encoder);
		auth.inMemoryAuthentication().withUser("administrador").password(encoder.encode("DWES_final1"))
				.authorities("Admin");
	}
	
	//Registra el service para usuarios y el encriptador de contraseña
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
 
        // Setting Service to find User in the database.
        // And Setting PassswordEncoder
        auth.userDetailsService(uds).passwordEncoder(passwordEncoder());     
    }


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.
		authorizeHttpRequests()
		.antMatchers("/", "/nuevousuario").permitAll()
		.antMatchers("/").authenticated()	//faltan cosas por añadir
		.antMatchers("").hasAuthority("Admin")	//faltan cosas por añadir

				.anyRequest().authenticated()

				.and()
				.formLogin()
					.loginPage("/login")
					.permitAll()

				.and()
				.formLogin()
					.defaultSuccessUrl("/", true)

				.and()
				.logout()
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

				.and()
				.exceptionHandling()
					.accessDeniedPage("/accessDenied");

	}
}
