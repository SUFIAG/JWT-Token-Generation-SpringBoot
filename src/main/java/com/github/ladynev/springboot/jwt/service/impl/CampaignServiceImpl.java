package com.github.ladynev.springboot.jwt.service.impl;

import com.github.ladynev.springboot.jwt.domain.Campaign;
import com.github.ladynev.springboot.jwt.service.CampaignService;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author V.Ladynev
 */
public class CampaignServiceImpl implements CampaignService {

    public Collection<Campaign> getAllCampaigns() {
        return Arrays.asList(
                new Campaign("The First Campaign"),
                new Campaign("The Second Campaign")
        );
    }

}