package com.greenfoxacademy.todo_rest_api.services;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationUserService {

    List<ApplicationUser> findAll();

    ApplicationUser save(ApplicationUser user);
}
