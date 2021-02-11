package com.scrumboard.backend.service;

import java.util.List;

import com.scrumboard.backend.entity.Task;
import com.scrumboard.backend.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        taskRepository.save(task);
        return task;
    }
}
