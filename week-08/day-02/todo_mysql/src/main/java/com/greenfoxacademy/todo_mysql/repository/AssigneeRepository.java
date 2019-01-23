package com.greenfoxacademy.todo_mysql.repository;

import com.greenfoxacademy.todo_mysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  Optional<Assignee> findById(Long assigneeId);

  void deleteById(Long assigneeId);
}
