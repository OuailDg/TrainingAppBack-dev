package com.memoire.trainingSite.Services;

import com.memoire.trainingSite.DAO.CompanyProfileRepo;
import com.memoire.trainingSite.DAO.ProfileRepo;
import com.memoire.trainingSite.models.ApplicantProfile;
import com.memoire.trainingSite.models.CompanyProfile;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyProfileService extends ProfileService{
    private CompanyProfileRepo companyProfileRepo ;
    @Autowired
    public CompanyProfileService(ProfileRepo profileRepo) {
        super(profileRepo);
    }

    //UPDATE EMPLOYEES NUMEBER
    public CompanyProfile updatSize(Long id, CompanyProfile companyProfile) {
        if (companyProfileRepo.existsById(id)) {
            return companyProfileRepo.save(companyProfile);
        } else {
            throw new IllegalArgumentException( id + " does not exist");
        }
    }
}
