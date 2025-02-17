package com.rajeev.simpleWebApp.auth.repo;

import com.rajeev.simpleWebApp.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {


    User findByEmail(String email);
}
