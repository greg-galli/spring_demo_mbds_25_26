package fr.miage.mbds.demo.mapper;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.dto.UserResponseDTO;
import fr.miage.mbds.demo.dto.UserUpdateDTO;
import fr.miage.mbds.demo.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
//    public User userToUserUpdateDTO(User user);
//    public User userToUserCreateDTO(User user);
    public UserResponseDTO userToUserResponseDTO(User user);
    public User userCreateDTOToUser(UserCreateDTO userCreateDTO);
    public User userUpdateDTOToUser(UserUpdateDTO userUpdateDTO);
    public List<UserResponseDTO> userListToUserResponseDTOList(List<User> userList);
}
