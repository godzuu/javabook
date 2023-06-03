package tranvanthang.lab3.services;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tranvanthang.lab3.entity.User;
import tranvanthang.lab3.repository.IRoleRepository;
import tranvanthang.lab3.repository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;
    public void save(@Valid User user){
        userRepository.save(user);
        Long userId=userRepository.getUserIdByUsername(user.getUsername());
        Long roleId=roleRepository.getRoleIdByName("USER");
        if(roleId != 0 && userId != 0){
            userRepository.addRoleToUser(userId,roleId);
        }
    }
}
