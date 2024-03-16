package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class ApplicantProfile extends  Profile{
    @OneToMany
    private List<Degree> degrees ;
    @OneToMany
    private List<Project> projects ;
    private String Current_level;
}
