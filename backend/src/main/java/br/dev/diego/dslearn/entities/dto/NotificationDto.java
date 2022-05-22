package br.dev.diego.dslearn.entities.dto;

import br.dev.diego.dslearn.entities.Notification;

import java.io.Serializable;
import java.time.Instant;

public class NotificationDto implements Serializable {

    private Long id;
    private String text;
    private Instant moment;
    private boolean read = false;
    private String route;
    private Long userId;

    public NotificationDto() {
    }

    public NotificationDto(Long id, String text, Instant moment, boolean read, String route, Long userId) {
        this.id = id;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
        this.userId = userId;
    }

    public NotificationDto(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Instant getMoment() {
        return moment;
    }

    public boolean isRead() {
        return read;
    }

    public String getRoute() {
        return route;
    }

    public Long getUserId() {
        return userId;
    }
}
