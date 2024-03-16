package com.memoire.trainingSite.Controller;

import com.memoire.trainingSite.Services.ApplicantProfileService;
import com.memoire.trainingSite.Services.ProfileService;
import com.memoire.trainingSite.models.ApplicantProfile;
import com.memoire.trainingSite.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ApplicantProfile")
public class ApplicantProfileController {
    private ApplicantProfileService applicantProfileService ;
    @Autowired
    public ApplicantProfileController(ApplicantProfileService applicantProfileService) { this.applicantProfileService = applicantProfileService; }
    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable Long id, @RequestBody ApplicantProfile applicantProfile) {
        return applicantProfileService.updateProfile(id, applicantProfile);
    }
}
