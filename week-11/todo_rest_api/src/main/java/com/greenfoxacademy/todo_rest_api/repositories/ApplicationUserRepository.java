package com.greenfoxacademy.todo_rest_api.repositories;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {

  List<ApplicationUser> findAll();

  ApplicationUser findByUsername(String username);

  ApplicationUser save(ApplicationUser user);
}
