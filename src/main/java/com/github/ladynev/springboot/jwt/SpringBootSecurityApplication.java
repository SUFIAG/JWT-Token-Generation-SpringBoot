package com.github.ladynev.springboot.jwt;

import com.github.ladynev.springboot.jwt.config.AuthorizationServerConfiguration;
import com.github.ladynev.springboot.jwt.config.RestApiConfiguration;
import com.github.ladynev.springboot.jwt.config.SecurityConfiguration;
import com.github.ladynev.springboot.jwt.config.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Entry point to the application.
 *
 * @author V.Ladynev
 */
@SpringBootApplication
@Import({
        SecurityConfiguration.class,
        AuthorizationServerConfiguration.class,
        RestApiConfiguration.class,
        ServiceConfiguration.class
})
public class SpringBootSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityApplication.class, args);
    }

}
