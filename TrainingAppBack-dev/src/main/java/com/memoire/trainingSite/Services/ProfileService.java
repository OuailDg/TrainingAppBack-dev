package com.memoire.trainingSite.Services;

import com.memoire.trainingSite.DAO.ProfileRepo;
import com.memoire.trainingSite.DAO.SiteUserRepo;
import com.memoire.trainingSite.models.Profile;
import com.memoire.trainingSite.models.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    private ProfileRepo profileRepo ;
    @Autowired
    public ProfileService(ProfileRepo profileRepo){
        this.profileRepo = profileRepo ;
    }

    // CREATE NEW PROFILE
    public Profile createProfile(Profile profile){ return  profileRepo.save(profile);}
    //GET ALL PROFILES
    public List<Profile> getAll() {
        return profileRepo.findAll() ;
    }
    //FIND PROFILE BY ID
    public Optional<Profile> getById(Long id) {
        return profileRepo.findById(id) ;
    }
    //UPDATE PROFILE
    public Profile updateProfile(Long id, Profile profile) {
        if (profileRepo.existsById(id)) {
            return profileRepo.save(profile);
        } else {
            throw new IllegalArgumentException( id + " does not exist");
        }
    }
    //DELETE PROFILE
    public void deleteProfile(Long id) {
        if (profileRepo.existsById(id)) {
            profileRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException(id + " does not exist");
        }
    }
}
