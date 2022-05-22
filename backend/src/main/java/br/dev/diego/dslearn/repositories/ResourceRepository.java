package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
