package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
