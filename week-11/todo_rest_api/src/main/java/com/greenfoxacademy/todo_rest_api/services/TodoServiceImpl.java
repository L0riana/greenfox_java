package com.greenfoxacademy.todo_rest_api.services;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findByTitle(String title) {
        return todoRepository.findByTitle(title);
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }
}
