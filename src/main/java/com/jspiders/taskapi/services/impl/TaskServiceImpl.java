package com.jspiders.taskapi.services.impl;

import com.jspiders.taskapi.data.tasks.Task;
import com.jspiders.taskapi.data.tasks.UpdateTaskRequest;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public ResponseEntity<String> createTask(CreateUserRequest createUserRequest) {
        return null;
    }

    @Override
    public ResponseEntity<List<Task>> getAllTasks() {
        return null;
    }

    @Override
    public ResponseEntity<Task> getTaskById(String taskId) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateTask(UpdateTaskRequest updateTaskRequest) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteTaskById(Long taskId) {
        return null;
    }
}
