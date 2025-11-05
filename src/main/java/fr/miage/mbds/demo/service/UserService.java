package fr.miage.mbds.demo.service;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.dto.UserResponseDTO;
import fr.miage.mbds.demo.dto.UserUpdateDTO;
import fr.miage.mbds.demo.model.User;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> findAll();
    UserResponseDTO findById(Long id);
    UserResponseDTO save(UserCreateDTO user);
    UserResponseDTO update(UserUpdateDTO user);
    UserResponseDTO saveAndFlush(UserCreateDTO user);
}
