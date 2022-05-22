package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
