package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Profile {
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Id
    @Column(name="profileId")
    private long Profile_id;
    @Column(name="Intro")
    private String Profile_intro;
    @Column(name="UpdateDate")
    private long Profile_last_update_date;

}
