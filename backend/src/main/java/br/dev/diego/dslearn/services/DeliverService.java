package br.dev.diego.dslearn.services;

import br.dev.diego.dslearn.entities.Deliver;
import br.dev.diego.dslearn.entities.dto.DeliverRevisionDto;
import br.dev.diego.dslearn.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDto dto) {
        Deliver deliver = repository.getById(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        repository.save(deliver);
    }

}
