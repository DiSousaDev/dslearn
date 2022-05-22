package br.dev.diego.dslearn.controllers;

import br.dev.diego.dslearn.entities.dto.NotificationDto;
import br.dev.diego.dslearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDto>> notificationForCurrentUser(Pageable pageable) {
        Page<NotificationDto> page = service.notificationForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }

}
