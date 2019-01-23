package com.greenfoxacademy.todo_rest_api.controllers;

import com.greenfoxacademy.todo_rest_api.models.JsonResponse;
import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

  private TodoService todoService;

  @Autowired
  public TodoRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping(value = {"/todo/add"})
  public ResponseEntity addTodo(@RequestBody(required = false) Todo newTodo) {
    if (newTodo != null) {
      todoService.save(newTodo);
      return new ResponseEntity(new JsonResponse(newTodo.getTitle() + " is added to the todolist"), HttpStatus.OK);
    } else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping(value = {"/todo/list"})
  public ResponseEntity listTodos() {
    if (todoService.findAll().size() != 0) {
      return new ResponseEntity(new JsonResponse("Ok", todoService.findAll()), HttpStatus.OK);
    } else {
      return new ResponseEntity(new JsonResponse("No todos for today"), HttpStatus.OK);
    }
  }
}
