package com.memoire.trainingSite.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memoire.trainingSite.models.Project;

public interface ProjectRepo extends JpaRepository< Project , Long> {
    // You can add custom query methods here if needed
}