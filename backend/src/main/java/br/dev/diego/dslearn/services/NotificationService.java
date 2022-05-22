package br.dev.diego.dslearn.services;

import br.dev.diego.dslearn.entities.User;
import br.dev.diego.dslearn.entities.dto.NotificationDto;
import br.dev.diego.dslearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDto> notificationForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();
        return repository.findByUser(user, pageable).map(NotificationDto::new);
    }

}
