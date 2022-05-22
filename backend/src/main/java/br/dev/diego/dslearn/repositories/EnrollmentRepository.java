package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Enrollment;
import br.dev.diego.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
