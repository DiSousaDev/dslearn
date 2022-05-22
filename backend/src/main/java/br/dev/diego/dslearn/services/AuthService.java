package br.dev.diego.dslearn.services;

import br.dev.diego.dslearn.entities.User;
import br.dev.diego.dslearn.repositories.UserRepository;
import br.dev.diego.dslearn.services.exceptions.DataNotFoundException;
import br.dev.diego.dslearn.services.exceptions.ForbiddenException;
import br.dev.diego.dslearn.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static br.dev.diego.dslearn.util.DsLearnConstants.ROLE_ADMIN;


@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username).orElseThrow(() -> new DataNotFoundException("Usuário não encontrado email: " + username + " entity: " + AuthService.class.getName()));
        } catch (Exception e) {
            throw new UnauthorizedException("Invalid User");
        }
    }

    @Transactional(readOnly = true)
    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();
        if(!user.getId().equals(userId) && !user.hasHole(ROLE_ADMIN)) {
            throw new ForbiddenException("Access denied");
        }
    }

}
