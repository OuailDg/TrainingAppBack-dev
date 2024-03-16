package com.memoire.trainingSite.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memoire.trainingSite.models.TrainingPosition;

public interface TrainingPositionRepo extends JpaRepository< TrainingPosition , Long> {
    // You can add custom query methods here if needed
}