package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
//@ImportResource(value = {"classpath:/spring/business-config.xml", "classpath:/spring/tools-config.xml", "classpath:/spring/mvc-core-config.xml"})
//@ComponentScan(basePackages = {"org.springframework.samples.petclinic.repository.springdatajpa"})
public class PetClinicApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
}
