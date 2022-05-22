package br.dev.diego.dslearn.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationExceptionDetails extends StandardError {

    private final List<CustomFieldError> customFieldErrors = new ArrayList<>();

    public List<CustomFieldError> getErrors() {
        return customFieldErrors;
    }

    public void addError(String fieldName, String fieldMessage) {
        customFieldErrors.add(new CustomFieldError(fieldName, fieldMessage));
    }

}
