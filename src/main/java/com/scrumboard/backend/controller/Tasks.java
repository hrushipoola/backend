package com.scrumboard.backend.controller;

import java.util.List;
import java.util.Optional;

import com.scrumboard.backend.entity.Task;
import com.scrumboard.backend.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Tasks {

    @Autowired
    TaskService taskService;

    @GetMapping(path="/task", produces = "application/json")
    private List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping(path="/task/")
    private ResponseEntity<Task> saveTask(@RequestBody Task task){
        Task t = taskService.saveTask(task);
        return ResponseEntity.ok(t);
    }


}
