package com.jspiders.taskapi.data;

import lombok.Data;

@Data
public class AppUser {
    private  Long userId;
    private String name ;
    private String email;
    private String password;
    private String mobile;
}
