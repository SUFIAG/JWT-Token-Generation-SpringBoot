package com.github.ladynev.springboot.jwt.config;

import com.github.ladynev.springboot.jwt.service.CampaignService;
import com.github.ladynev.springboot.jwt.service.ReportService;
import com.github.ladynev.springboot.jwt.service.UserService;
import com.github.ladynev.springboot.jwt.service.impl.CampaignServiceImpl;
import com.github.ladynev.springboot.jwt.service.impl.ReportServiceImpl;
import com.github.ladynev.springboot.jwt.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author V.Ladynev
 */
@Configuration
public class ServiceConfiguration {

    @Bean
    public CampaignService campaignService() {
        return new CampaignServiceImpl();
    }

    @Bean
    public ReportService reportService() {
        return new ReportServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}
