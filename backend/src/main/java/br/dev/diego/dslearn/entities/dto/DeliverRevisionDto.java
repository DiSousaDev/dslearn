package br.dev.diego.dslearn.entities.dto;

import br.dev.diego.dslearn.entities.enums.DeliverStatus;

public class DeliverRevisionDto {

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    public DeliverRevisionDto() {
    }

    public DeliverRevisionDto(DeliverStatus status, String feedback, Integer correctCount) {
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public String getFeedback() {
        return feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }
}
