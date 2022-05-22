package br.dev.diego.dslearn.services.exceptions;

public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }

}
