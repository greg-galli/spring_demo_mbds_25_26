package fr.miage.mbds.demo.mapper;

import fr.miage.mbds.demo.dto.UserCreateDTO;
import fr.miage.mbds.demo.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public User userToUserUpdateDTO(User user);
    public User userToUserCreateDTO(User user);
    public User userToUserResponseDTO(User user);
    public UserCreateDTO userCreateDTOToUser(UserCreateDTO userCreateDTO);
    public User userUpdateDTOToUser(UserCreateDTO userUpdateDTO);
}
