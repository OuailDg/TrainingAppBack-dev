package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;


@Entity
@Data
public class Company extends SiteUser {
    @Column(name = "CompanyName")
    private  String CompanyName;
}
