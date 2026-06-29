package lk.jiat.ejb;

import jakarta.ejb.Stateless;
import lk.jiat.core.dto.UserDTO;
import lk.jiat.core.service.UserService;

import java.util.List;

@Stateless
public class UserSessionBean implements UserService {
    @Override
    public UserDTO getUserById(Long id) {
        System.out.println("getUserByIdUserDto");
        return null;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        System.out.println("addUser");
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        System.out.println("updateUser");
    }

    @Override
    public void deleteUser(Long id) {
        System.out.println("deleteUser");
    }

    @Override
    public List<UserDTO> getUsers() {
        System.out.println("getUsers");
        return List.of();
    }
}
