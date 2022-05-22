package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
