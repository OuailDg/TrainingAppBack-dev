package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@AssociationOverrides({
        @AssociationOverride(name = "id_notification.position", joinColumns = @JoinColumn(name ="position_id")),
        @AssociationOverride(name = "id_notification.user", joinColumns = @JoinColumn(name = "user_id"))
}
)
public class Notification {

    @EmbeddedId
    private NotificationId id_notification = new NotificationId() ;

    private LocalDateTime notif_creation_date ;
    private Boolean notif_read_flag ;
    private String notif_title ;
    private String notif_content ;
}
