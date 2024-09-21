package com.rajeev.simpleWebApp.auth.service;

import com.rajeev.simpleWebApp.auth.dto.LoginDTO;
import com.rajeev.simpleWebApp.auth.model.User;
import com.rajeev.simpleWebApp.auth.repo.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User createUser(User request){
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        userRepo.save(user);
        return user;
    }

    public String loginUser(LoginDTO request) {
        User user = userRepo.findByEmail(request.getEmail());

        // Check if user exists
        if (user == null) {
            return "User not found";
        }

        // Check if password matches using equals()
        if (!request.getPassword().equals(user.getPassword())) {
            return "Wrong password";
        }

        return "Login Success!!";
    }


}
