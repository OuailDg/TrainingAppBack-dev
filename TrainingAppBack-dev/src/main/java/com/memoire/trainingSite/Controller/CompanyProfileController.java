package com.memoire.trainingSite.Controller;

import com.memoire.trainingSite.Services.ApplicantProfileService;
import com.memoire.trainingSite.Services.CompanyProfileService;
import com.memoire.trainingSite.models.ApplicantProfile;
import com.memoire.trainingSite.models.CompanyProfile;
import com.memoire.trainingSite.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/CompanyProfile")
    public class CompanyProfileController {
        private CompanyProfileService companyProfileService  ;
        @Autowired
        public CompanyProfileController(CompanyProfileService companyProfileService) { this.companyProfileService = companyProfileService; }
        @PutMapping("/{id}")
        public CompanyProfile updateSize(@PathVariable Long id, @RequestBody CompanyProfile companyProfile) {
            return companyProfileService.updatSize(id, companyProfile);
        }
}
