package br.dev.diego.dslearn.services.validation;

import br.dev.diego.dslearn.controllers.exceptions.CustomFieldError;
import br.dev.diego.dslearn.entities.User;
import br.dev.diego.dslearn.entities.dto.UserInsertDto;
import br.dev.diego.dslearn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserInsertDto> {

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserInsertValid ann) {
        ConstraintValidator.super.initialize(ann);
    }

    @Override
    public boolean isValid(UserInsertDto dto, ConstraintValidatorContext context) {

        List<CustomFieldError> list = new ArrayList<>();

        Optional<User> user = repository.findByEmail(dto.getEmail());
        if(user.isPresent()) {
            list.add(new CustomFieldError("email", "Email already in use."));
        }


        for (CustomFieldError cfe : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(cfe.getFieldMessage()).addPropertyNode(cfe.getFieldName()).addConstraintViolation();
        }

        return list.isEmpty();
    }
}
