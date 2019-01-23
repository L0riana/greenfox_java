package com.greenfoxacademy.todo_mysql;

import com.greenfoxacademy.todo_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public TodoMysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {

    SpringApplication.run(TodoMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("Start the day", false, false));
//    todoRepository.save(new Todo("Finish H2 workshop1", true, false));
//    todoRepository.save(new Todo("Finish JPA workshop2", false, true));
//    todoRepository.save(new Todo("Create a CRUD project", false, true));
//    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
