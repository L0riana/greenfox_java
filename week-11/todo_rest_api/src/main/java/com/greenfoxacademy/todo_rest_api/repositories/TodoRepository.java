package com.greenfoxacademy.todo_rest_api.repositories;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAll();

    Todo save(Todo todo);

    Todo findByTitle(String title);
}
