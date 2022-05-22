package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
