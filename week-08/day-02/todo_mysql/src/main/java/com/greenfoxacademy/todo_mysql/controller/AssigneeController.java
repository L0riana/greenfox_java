package com.greenfoxacademy.todo_mysql.controller;

import com.greenfoxacademy.todo_mysql.model.Assignee;
import com.greenfoxacademy.todo_mysql.model.Todo;
import com.greenfoxacademy.todo_mysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  private Assignee assignee;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeController(Assignee assignee, AssigneeRepository assigneeRepository) {
    this.assignee = assignee;
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping("/assignees")
  public String assignes(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }

  @GetMapping(value = "/assignees/add")
  public String addAssignees(Model model) {
    model.addAttribute("newAssignee", assignee);
    return "addassignee";
  }

  @PostMapping(value = "/assignees/add")
  public String addedAssignees(@ModelAttribute Assignee newAssignee) {
    assigneeRepository.save(newAssignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/assignees/{assigneeId}/delete")
  public String deleteAssignee(@PathVariable Long assigneeId) {
    assigneeRepository.deleteById(assigneeId);
    return "redirect:/todo/assignees";
  }

  @GetMapping(value = "/assignees/{assigneeId}/edit")
  public String editAssignee(@PathVariable Long assigneeId, Model model) {
    model.addAttribute("assignee", assigneeRepository.findById(assigneeId).get());
    return "editassignee";
  }

  @PostMapping(value = "/assignees/{assigneeId}/edit")
  public String editedAssignee(@ModelAttribute Assignee editedAssignee) {
    assigneeRepository.save(editedAssignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping(value = "/todo/assignees/{assigneeId}")
  public String seeTodos(@PathVariable(name = "assigneeId") Long assigneeId, Model model) {
    model.addAttribute("assignee", assigneeRepository.findById(assigneeId).get());
    return "assigneetodolist";
  }
}
