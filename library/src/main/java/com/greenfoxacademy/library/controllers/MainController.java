package com.greenfoxacademy.library.controllers;

import com.greenfoxacademy.library.models.Book;
import com.greenfoxacademy.library.models.User;
import com.greenfoxacademy.library.repositories.BookRepository;
import com.greenfoxacademy.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {

  private UserRepository userRepository;
  private BookRepository bookRepository;

  @Autowired
  public MainController(UserRepository userRepository, BookRepository bookRepository) {
    this.userRepository = userRepository;
    this.bookRepository = bookRepository;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute("users", userRepository.findAll());
    model.addAttribute("books", bookRepository.findAll());
    model.addAttribute("user", new User());
    model.addAttribute("book", new Book());
    return "index";
  }

  @PostMapping("/")
  public String indexPage(@ModelAttribute User user, @RequestParam Integer id){
    Book book = bookRepository.findById(id).get();
    book.setBorrowedBy(user);
    User oneUser = userRepository.findById(user.getId()).get();
    ArrayList<Book> books = (ArrayList<Book>) oneUser.getBorrowedBooks();
    books.add(bookRepository.findById(id).get());
    user.setBorrowedBooks(books);
    userRepository.save(user);
    bookRepository.save(book);
    return "redirect:/";
  }

  @GetMapping("/books/add")
  public String books(Model model) {
    model.addAttribute("newBook", new Book());
    return "addbook";
  }

  @PostMapping("/books/add")
  public String books(@ModelAttribute Book newBook) {
    bookRepository.save(newBook);
    return "redirect:/";
  }

  @GetMapping("/users/add")
  public String users(Model model) {
    model.addAttribute("newUser", new User());
    return "adduser";
  }

  @PostMapping("/users/add")
  public String users(@ModelAttribute User newUser) {
    userRepository.save(newUser);
    return "redirect:/";
  }
}
