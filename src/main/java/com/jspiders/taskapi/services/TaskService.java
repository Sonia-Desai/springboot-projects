package com.jspiders.taskapi.services;

import com.jspiders.taskapi.data.CreateUserRequest;
import com.jspiders.taskapi.data.Task;
import com.jspiders.taskapi.data.UpdateTaskRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskService {

    ResponseEntity<String> createTask (CreateUserRequest createUserRequest); //  here pass the request object

    ResponseEntity<List<Task>> getAllTasks();

    ResponseEntity<Task>  getTaskById(String taskId);

    ResponseEntity<String> updateTask (UpdateTaskRequest updateTaskRequest);

    ResponseEntity<String> deleteTaskById(Long taskId);
}
