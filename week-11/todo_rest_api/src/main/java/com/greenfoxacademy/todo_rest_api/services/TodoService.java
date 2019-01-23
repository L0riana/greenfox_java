package com.greenfoxacademy.todo_rest_api.services;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    List<Todo> findAll();

    Todo findByTitle(String title);

    Todo save(Todo todo);
}
