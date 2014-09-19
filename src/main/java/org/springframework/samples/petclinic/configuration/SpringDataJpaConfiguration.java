package org.springframework.samples.petclinic.configuration;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile("spring-data-jpa")
@Configuration
@EnableJpaRepositories("org.springframework.samples.petclinic.repository")
@EntityScan("org.springframework.samples.petclinic.model")
public class SpringDataJpaConfiguration {

}
