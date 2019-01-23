package com.greenfoxacademy.todo_rest_api.models;

import javax.persistence.*;

@Entity
@Table(name="todos")
public class Todo {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;
  private String title;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
