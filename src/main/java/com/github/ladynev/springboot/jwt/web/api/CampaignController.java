package com.github.ladynev.springboot.jwt.web.api;

import com.github.ladynev.springboot.jwt.domain.Campaign;
import com.github.ladynev.springboot.jwt.service.CampaignService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Campaign resource.
 *
 * @author V.Ladynev
 */
@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ADVERTISER')")
    public Collection<Campaign> getCampaigns() {
        return campaignService.getAllCampaigns();
    }

}
