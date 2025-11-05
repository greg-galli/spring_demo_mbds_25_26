package fr.miage.mbds.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserCreateDTO {
    private String nom;
    private String prenom;
    private String email;
    private Date dob;
}
