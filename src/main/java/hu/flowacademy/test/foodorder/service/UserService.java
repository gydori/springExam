package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.model.ValidationException;
import hu.flowacademy.test.foodorder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        if(user.getUsername() == null || user.getFullname() == null || user.getAddress() == null){
            throw new ValidationException("missing data");
        }else{
            userRepository.save(user);
            return user;
        }
    }

    public User findOneUser(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

    public User updateUser(User user){
        if(user.getUsername() == null || user.getFullname() == null || user.getAddress() == null){
            throw new ValidationException("missing data");
        }else {
            User modify = userRepository.findByUsername(user.getUsername());
            modify.setFullname(user.getFullname());
            modify.setAddress(user.getAddress());
            return modify;
        }
    }
}
