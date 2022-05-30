package com.manuelmc09.TareaDWES02.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manuelmc09.TareaDWES02.modelo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public Optional<User> findByUsername(String username);

}
