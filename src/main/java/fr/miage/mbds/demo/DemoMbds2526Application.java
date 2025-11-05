package fr.miage.mbds.demo;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.model.User;
import fr.miage.mbds.demo.service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoMbds2526Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoMbds2526Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserServiceImpl userService) {
        return args -> {
            UserCreateDTO user = UserCreateDTO.builder()
                    .nom("Bob")
                    .prenom("Dylan")
                    .email("bob.dylan@gmail.com")
                    .dob(new Date())
                    .build();
            userService.saveAndFlush(user);
        };
    }
}
