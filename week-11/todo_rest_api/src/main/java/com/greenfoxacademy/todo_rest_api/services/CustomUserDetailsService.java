package com.greenfoxacademy.todo_rest_api.services;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import com.greenfoxacademy.todo_rest_api.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

  private ApplicationUserRepository applicationUserRepository;

  @Autowired
  public CustomUserDetailsService(ApplicationUserRepository applicationUserRepository) {
    this.applicationUserRepository = applicationUserRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser applicationUser = loadApplicationUserByUsername(username);
    return new User(applicationUser.getUsername(), applicationUser.getPassword(),
            AuthorityUtils.createAuthorityList("ROLE_USER"));
  }

  public ApplicationUser loadApplicationUserByUsername(String username) {
    if (username != null) {
      ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
      return new ApplicationUser(applicationUser.getUsername(), applicationUser.getPassword());
    } else {
      return null;
    }
  }
}
