package com.jspiders.taskapi.services.impl;

import com.jspiders.taskapi.data.users.AppUser;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.services.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AppUserServiceImpl implements AppUserService {


    @Override
    public ResponseEntity<String> createUser(CreateUserRequest createUserRequest) {
        System.out.println("this is AppUserServiceImpl createUser()");

        //logics
       // ResponseEntity<String> userCreated = ResponseEntity.ok("User Created");
        return ResponseEntity.status(HttpStatus.CREATED).body("user created");
    }

    @Override
    public ResponseEntity<String> updateUser() {
        System.out.println("this is AppUserServiceImpl updateUser()");
        return ResponseEntity.status(HttpStatus.OK).body("user updated");
    }

    @Override
    public ResponseEntity<String> deleteUser(String email, String mobile, String password) {
        System.out.println("this is AppUserServiceImpl deleteUser()");
        return ResponseEntity.status(HttpStatus.OK).body("user deleted");
    }

    @Override
    public ResponseEntity<List<AppUser>> getAllUsers() {
        System.out.println("this is AppUserServiceImpl getAllUsers()");
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @Override
    public ResponseEntity<List<AppUser>> getUserByID(Long id) {
        System.out.println("this is AppUserServiceImpl getUserByID()");
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
