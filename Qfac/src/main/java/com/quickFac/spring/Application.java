package com.quickFac.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.quickFac.Forms.MenuLayout;
import com.vaadin.flow.spring.annotation.EnableVaadin;

/**
 * The entry point of the Spring Boot application.
 * @EnableVaadin("com.quickFac")
 */

@EntityScan("com.quickFac.Entities")
@EnableJpaRepositories("com.quickFac.Repository")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	return application.sources(Application.class);
    }
}
