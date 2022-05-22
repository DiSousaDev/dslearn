package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
