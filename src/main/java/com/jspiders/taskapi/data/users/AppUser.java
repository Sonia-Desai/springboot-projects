package com.jspiders.taskapi.data.users;

import lombok.Data;

@Data
public class AppUser {
    private  Long userId;
    private String name ;
    private String email;
    private String password;
    private String mobile;
    private boolean isActive;

}
