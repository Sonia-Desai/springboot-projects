package com.jspiders.taskapi.controllers;

import com.jspiders.taskapi.data.users.AppUser;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    AppUserService appUserService;
    @Autowired
   public UserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping
    public ResponseEntity<String> addUser(@RequestBody CreateUserRequest createUserRequest) {
        System.out.println("this is UserController addUser()");
        ResponseEntity<String> response = appUserService.createUser(createUserRequest);
        return response;
    }
    @PutMapping
    public ResponseEntity<String> updateUser(){
        System.out.println("this is UserController UpdateUser()");
        ResponseEntity<String> response = appUserService.updateUser();
        return response;

    }
    @DeleteMapping
    public ResponseEntity<String> deleteUser(String email, String mobile, String password){
        System.out.println("this is UserController deleteUser()");
        ResponseEntity<String> response = appUserService.deleteUser(email, mobile, password);
        return response;
    }
    @GetMapping
    public ResponseEntity<List<AppUser>> getAllUsers(){
        System.out.println("this is UserController getAllUsers()");
        ResponseEntity<List<AppUser>> response = appUserService.getAllUsers();
        return response;
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<AppUser>> getUserByID(Long id){
        System.out.println("this is UserController getUserByID()");
        ResponseEntity<List<AppUser>> response = appUserService.getUserByID(id);
        return response;
    }
}
