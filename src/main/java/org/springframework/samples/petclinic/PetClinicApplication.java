package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 * User: in329dei
 * Date: 15-8-13
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableAutoConfiguration
@ImportResource(value = {"classpath:/spring/business-config.xml", "classpath:/spring/tools-config.xml", "classpath:/spring/mvc-core-config.xml"})
@ComponentScan(basePackages = {"org.springframework.samples.petclinic.repository.springdatajpa"})
public class PetClinicApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
}
