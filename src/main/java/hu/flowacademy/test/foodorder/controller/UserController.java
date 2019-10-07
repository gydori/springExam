package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.repository.UserRepository;
import hu.flowacademy.test.foodorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    public User createUser(User user){
        return userService.createUser(user);
    }

    public User findOneUser(String username) {
        return userService.findOneUser(username);
    }

    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    public User updateUser(User user){
        return userService.updateUser(user);
    }
}
