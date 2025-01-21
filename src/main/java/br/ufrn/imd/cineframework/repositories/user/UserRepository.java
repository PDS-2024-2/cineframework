package br.ufrn.imd.cineframework.repositories.user;

import java.util.Optional;

import br.ufrn.imd.cineframework.models.user.User;
import br.ufrn.imd.cineframework.repositories.GenericRepository;

public interface UserRepository extends GenericRepository<User> {
	Optional<User> findByUsername(String username);
}
