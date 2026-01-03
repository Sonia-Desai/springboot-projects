package com.jspiders.taskapi.services;
//interface tells about the features
//By default all the methods are public of interface

import com.jspiders.taskapi.data.users.AppUser;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AppUserService {

    ResponseEntity<String> createUser(CreateUserRequest createUserRequest);
    ResponseEntity<String> updateUser ();
    ResponseEntity<String> deleteUser (String email, String mobile , String password);

    ResponseEntity<List<AppUser>> getAllUsers();

    ResponseEntity<List<AppUser>> getUserByID(Long id);

}
