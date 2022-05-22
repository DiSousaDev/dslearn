package br.dev.diego.dslearn.entities.dto;

import br.dev.diego.dslearn.entities.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

public class UserDto {

    private Long id;

    @NotBlank(message = "Campo obrigatório.")
    private String name;

    @Email(message = "E-mail inválido.")
    private String email;

    private final Set<RoleDto> roles = new HashSet<>();

    public UserDto() {
    }

    public UserDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDto(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDto(role.getId(), role.getAuthority())));
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<RoleDto> getRoles() {
        return roles;
    }
}
