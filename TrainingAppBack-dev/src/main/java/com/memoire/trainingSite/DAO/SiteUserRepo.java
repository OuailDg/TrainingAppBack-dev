package com.memoire.trainingSite.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.memoire.trainingSite.models.SiteUser;

public interface SiteUserRepo extends JpaRepository< SiteUser , Long> {
    // You can add custom query methods here if needed
}