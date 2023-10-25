package com.github.ladynev.springboot.jwt.service;

import com.github.ladynev.springboot.jwt.domain.Campaign;

import java.util.Collection;

/**
 * @author V.Ladynev
 */
public interface CampaignService {

    Collection<Campaign> getAllCampaigns();

}