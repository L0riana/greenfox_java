package com.greenfoxacademy.library.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private Integer id;
  private String name;

  @OneToMany(mappedBy = "borrowedBy")
  private List<Book> borrowedBooks;

  public User() {
  }

  public User(String name, List<Book> borrowedBooks) {
    this.name = name;
    this.borrowedBooks = borrowedBooks;
  }

  public User(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(List<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }
}
