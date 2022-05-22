package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
