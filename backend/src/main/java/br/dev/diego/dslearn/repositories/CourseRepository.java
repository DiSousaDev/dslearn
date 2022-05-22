package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
