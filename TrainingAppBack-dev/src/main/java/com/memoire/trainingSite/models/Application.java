package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
@AssociationOverrides({
        @AssociationOverride(name = "id_application.position", joinColumns = @JoinColumn(name ="position_id")),
        @AssociationOverride(name = "id_application.applicant", joinColumns = @JoinColumn(name = "user_id"))
}
)
public class Application {
    @EmbeddedId
    private ApplicationId id_application = new ApplicationId();

    private LocalDateTime application_date;
    private String application_motivation;
    private ApplicationStatus application_status;
}
