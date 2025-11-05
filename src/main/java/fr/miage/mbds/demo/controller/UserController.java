package fr.miage.mbds.demo.controller;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.dto.UserResponseDTO;
import fr.miage.mbds.demo.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserResponseDTO> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserResponseDTO findById(@PathVariable Long id) {
        UserResponseDTO user = userService.findById(id);
        if (user == null) {
            throw new EntityNotFoundException("User not found with id: " + id);
        }
        return user;
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody UserCreateDTO user) {
        return userService.save(user);
    }

}
