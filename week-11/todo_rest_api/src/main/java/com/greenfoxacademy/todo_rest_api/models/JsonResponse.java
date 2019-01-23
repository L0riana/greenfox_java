package com.greenfoxacademy.todo_rest_api.models;

import java.util.List;

public class JsonResponse {

  private String result;
  private List<Todo> listTodos;

  public JsonResponse() {
  }

  public JsonResponse(String result, List<Todo> listTodos) {
    this.result = result;
    this.listTodos = listTodos;
  }

  public JsonResponse(String result) {
  }

  public String getStatus() {
    return result;
  }

  public void setStatus(String status) {
    this.result = status;
  }

  public List<Todo> getListTodos() {
    return listTodos;
  }

  public void setTodoList(List<Todo> todoList) {
    this.listTodos = todoList;
  }
}
