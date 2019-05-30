package com.lucia.listingtodos.controllers;

import com.lucia.listingtodos.models.Todo;
import com.lucia.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    TodoRepository todoRepository;

    private List<Todo> fuckingList = new ArrayList<>();

    @GetMapping({"/", "/todo"})
    public String list(Model model) {
        model.addAttribute("todoRepository", todoRepository.findAll());
        return "todolist";
    }
    @GetMapping("/create")
    public String goToCreate() {
        return "/create";
    }

    @PostMapping("/create")
    public String create(@RequestParam String title, @RequestParam(value = "isUrgent", defaultValue = "false") boolean urgent, @RequestParam(value = "isDone", defaultValue = "false") boolean done) {
        this.todoRepository.save(new Todo(title, urgent, done));
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String deleteToDo(@PathVariable("id") long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/edit")
    public String editToDo(@PathVariable("id") long id, Model model) {
        model.addAttribute("todoTitle", todoRepository.findById(id).get().getTitle());
        model.addAttribute("todoForEdit", todoRepository.findById(id));
        return "edit";
    }
    @PostMapping("/{id}/edit")
    public String editToDo(@ModelAttribute Todo newTodo, @RequestParam String title, @PathVariable("id") long id){
        newTodo.setTitle(title);
        newTodo.setId(id);
        todoRepository.save(newTodo);
        return "redirect:/";
    }

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
        todoRepository.save(new Todo("Start the day!", false, false));
        todoRepository.save(new Todo("Finish the fucking H2 workshop1", true, false));
        todoRepository.save(new Todo("Finish the JPA workshop2", false, false));
        todoRepository.save(new Todo("Create a CRUD project", false, false));
    }

    public TodoRepository getTodoRepository() {
        return todoRepository;
    }

    public void setTodoRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getFuckingList() {
        return fuckingList;
    }

    public void setFuckingList(List<Todo> fuckingList) {
        this.fuckingList = fuckingList;
    }
}
