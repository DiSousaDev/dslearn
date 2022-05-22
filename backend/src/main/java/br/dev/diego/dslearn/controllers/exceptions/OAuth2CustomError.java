package br.dev.diego.dslearn.controllers.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class OAuth2CustomError {

    private Instant timeStamp;
    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public OAuth2CustomError() {
    }

    public OAuth2CustomError(Instant timeStamp, String error, String errorDescription) {
        this.timeStamp = timeStamp;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
