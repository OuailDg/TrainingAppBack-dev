package com.memoire.trainingSite.Services;

import com.memoire.trainingSite.DAO.SiteUserRepo;
import com.memoire.trainingSite.models.SiteUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiteUserService {
    private SiteUserRepo siteUserRepo ;
    @Autowired
    public SiteUserService(SiteUserRepo siteUserRepo){
        this.siteUserRepo = siteUserRepo ;
    }

    public SiteUser createUser(SiteUser siteUser) {
        return siteUserRepo.save(siteUser);
    }


    public List<SiteUser> getAll() {
        return siteUserRepo.findAll() ;
    }

    public Optional<SiteUser> getById(Long id) {
        return siteUserRepo.findById(id) ;
    }

    public SiteUser updateUser(Long id, SiteUser siteUser) {
        // Ensure the user exists before updating
        if (siteUserRepo.existsById(id)) {
            siteUser.setUser_id(id); // Set the ID of the user to update
            return siteUserRepo.save(siteUser);
        } else {
            throw new IllegalArgumentException("User with ID " + id + " does not exist");
        }
    }

    public void deleteUser(Long id) {
        // Check if the user exists before deleting
        if (siteUserRepo.existsById(id)) {
            siteUserRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("User with ID " + id + " does not exist");
        }
    }
}
