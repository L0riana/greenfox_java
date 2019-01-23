package com.greenfoxacademy.todo_mysql.repository;

import com.greenfoxacademy.todo_mysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();

  List<Todo> findByDone(boolean bool);

  Optional<Todo> findById(Long id);

  void deleteById(Long id);

  @Query("select c from Todo c where c.title like %:text%")
  List<Todo> findTodoByTitle(@Param("text") String text);

}
