package com.memoire.trainingSite.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class NotificationId implements Serializable{

        @ManyToOne
        private TrainingPosition position;

        @ManyToOne
        private SiteUser user;


}
