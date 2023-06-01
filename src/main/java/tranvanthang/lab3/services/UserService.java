package tranvanthang.lab3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tranvanthang.lab3.entity.User;
import tranvanthang.lab3.repository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}