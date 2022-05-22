package br.dev.diego.dslearn.repositories;

import br.dev.diego.dslearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
