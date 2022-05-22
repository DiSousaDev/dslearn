package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
