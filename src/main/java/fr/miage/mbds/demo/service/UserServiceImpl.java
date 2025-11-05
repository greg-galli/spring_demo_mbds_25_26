package fr.miage.mbds.demo.service;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.dto.UserResponseDTO;
import fr.miage.mbds.demo.dto.UserUpdateDTO;
import fr.miage.mbds.demo.mapper.UserMapper;
import fr.miage.mbds.demo.model.User;
import fr.miage.mbds.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserResponseDTO> findAll(){
        return userMapper.userListToUserResponseDTOList(userRepository.findAll());
    }

    public UserResponseDTO findById(Long id){
        User user = this.userRepository.findById(id).orElse(null);
        return userMapper.userToUserResponseDTO(user);
    }

    public UserResponseDTO save(UserCreateDTO userCreateDTO){
        User user = userMapper.userCreateDTOToUser(userCreateDTO);
        user = this.userRepository.save(user);
        return userMapper.userToUserResponseDTO(user);
    }

    public UserResponseDTO saveAndFlush(UserCreateDTO userCreateDTO){
        User user = userMapper.userCreateDTOToUser(userCreateDTO);
        user = this.userRepository.save(user);
        return userMapper.userToUserResponseDTO(user);
    }

    public UserResponseDTO update(UserUpdateDTO userUpdateDTO)
    {
        User user = userMapper.userUpdateDTOToUser(userUpdateDTO);
        user = this.userRepository.save(user);
        return userMapper.userToUserResponseDTO(user);
    }
}
