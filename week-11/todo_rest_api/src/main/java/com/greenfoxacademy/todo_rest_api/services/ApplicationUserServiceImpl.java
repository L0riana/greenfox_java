package com.greenfoxacademy.todo_rest_api.services;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import com.greenfoxacademy.todo_rest_api.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {

    private ApplicationUserRepository userRepository;

    @Autowired
    public ApplicationUserServiceImpl(ApplicationUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<ApplicationUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public ApplicationUser save(ApplicationUser user) {
        return userRepository.save(user);
    }
}
