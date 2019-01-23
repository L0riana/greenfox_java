package com.greenfoxacademy.list.repository;

import com.greenfoxacademy.list.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{
}
