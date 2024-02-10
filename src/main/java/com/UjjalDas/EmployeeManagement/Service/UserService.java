package com.UjjalDas.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UjjalDas.EmployeeManagement.Entity.User;
import com.UjjalDas.EmployeeManagement.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}

