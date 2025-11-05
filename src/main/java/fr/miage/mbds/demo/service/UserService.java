package fr.miage.mbds.demo.service;

import fr.miage.mbds.demo.model.User;
import fr.miage.mbds.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public User findById(Long id){
        return this.userRepository.findById(id).orElse(null);
    }

    public User save(User user){
        return this.userRepository.save(user);
    }

    public User saveAndFlush(User user){
        return this.userRepository.saveAndFlush(user);
    }
}
