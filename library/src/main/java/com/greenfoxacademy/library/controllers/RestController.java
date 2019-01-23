package com.greenfoxacademy.library.controllers;

import com.greenfoxacademy.library.models.Book;
import com.greenfoxacademy.library.models.User;
import com.greenfoxacademy.library.repositories.BookRepository;
import com.greenfoxacademy.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  private BookRepository bookRepository;
  private UserRepository userRepository;

  @Autowired
  public RestController(BookRepository bookRepository, UserRepository userRepository) {
    this.bookRepository = bookRepository;
    this.userRepository = userRepository;
  }

  @GetMapping("/books")
  public List<Book> books(){
    return (List<Book>) bookRepository.findAll();
  }

  @GetMapping("/users")
  public List<User> users(){
    return (List<User>) userRepository.findAll();
  }
}
