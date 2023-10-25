package com.github.ladynev.springboot.jwt.config;

import com.github.ladynev.springboot.jwt.service.CampaignService;
import com.github.ladynev.springboot.jwt.service.ReportService;
import com.github.ladynev.springboot.jwt.service.UserService;
import com.github.ladynev.springboot.jwt.web.api.CampaignController;
import com.github.ladynev.springboot.jwt.web.api.ReportController;
import com.github.ladynev.springboot.jwt.web.api.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author V.Ladynev
 */
@Configuration
public class RestApiConfiguration {

    @Bean
    public CampaignController campaignController(CampaignService service) {
        return new CampaignController(service);
    }

    @Bean
    public ReportController reportController(ReportService service) {
        return new ReportController(service);
    }

    @Bean
    public UserController userController(UserService service) {
        return new UserController(service);
    }

}
