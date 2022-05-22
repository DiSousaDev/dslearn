package br.dev.diego.dslearn.controllers;

import br.dev.diego.dslearn.entities.dto.DeliverRevisionDto;
import br.dev.diego.dslearn.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {

    @Autowired
    DeliverService service;

    @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
    @PutMapping("/{id}")
    public ResponseEntity<Void> saveResivion(@PathVariable Long id, @RequestBody DeliverRevisionDto dto) {
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }

}
