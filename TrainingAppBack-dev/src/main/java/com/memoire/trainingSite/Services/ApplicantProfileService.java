package com.memoire.trainingSite.Services;

import com.memoire.trainingSite.DAO.ApplicantProfileRepo;
import com.memoire.trainingSite.DAO.ApplicantRepo;
import com.memoire.trainingSite.DAO.ProfileRepo;
import com.memoire.trainingSite.models.ApplicantProfile;
import com.memoire.trainingSite.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicantProfileService extends ProfileService{
    private ApplicantProfileRepo applicantProfileRepo ;
    @Autowired
    public ApplicantProfileService(ProfileRepo profileRepo) {  super(profileRepo);}

    //UPDATE PROFILE LEVEL
    public ApplicantProfile updateLevel(Long id, ApplicantProfile applicantProfile) {
        if (applicantProfileRepo.existsById(id)) {
            return applicantProfileRepo.save(applicantProfile);
        } else {
            throw new IllegalArgumentException( id + " does not exist");
        }
    }
}
