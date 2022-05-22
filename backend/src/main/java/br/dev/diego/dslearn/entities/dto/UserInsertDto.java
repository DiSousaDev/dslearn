package br.dev.diego.dslearn.entities.dto;

import br.dev.diego.dslearn.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDto extends UserDto {

    private String password;

    public UserInsertDto() {
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
