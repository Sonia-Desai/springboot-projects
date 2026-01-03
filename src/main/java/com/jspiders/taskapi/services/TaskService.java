package com.jspiders.taskapi.services;

import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.data.tasks.Task;
import com.jspiders.taskapi.data.tasks.UpdateTaskRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {

    ResponseEntity<String> createTask (CreateUserRequest createUserRequest); //  here pass the request object

    ResponseEntity<List<Task>> getAllTasks();

    ResponseEntity<Task>  getTaskById(String taskId);

    ResponseEntity<String> updateTask (UpdateTaskRequest updateTaskRequest);

    ResponseEntity<String> deleteTaskById(Long taskId);
}
