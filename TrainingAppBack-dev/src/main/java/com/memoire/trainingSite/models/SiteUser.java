package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Entity
public  class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long user_id;
    @Column(name ="Username")
    private String username;
    @Column(name ="Password" )
    private String user_password;
    @Column(name = "JoinDate")
    private LocalDateTime user_join_date;
    @Column(name = "Status")
    private UserStatus user_status;
    @Column(name ="PhoneNumber")
    private String user_phone_number;

    @OneToMany(mappedBy = "id_notification.user")
    private List<Notification> notifications = new ArrayList<>();

    @OneToMany(mappedBy = "siteUser")
    private List<Alert> alerts = new ArrayList<>() ;
}
