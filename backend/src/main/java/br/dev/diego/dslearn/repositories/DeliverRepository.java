package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
