package com.jspiders.taskapi.data;

import lombok.Data;

@Data
public class Task {
    private String taskId;
    private String title;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;
}
