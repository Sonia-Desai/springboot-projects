package com.jspiders.taskapi.data;

import lombok.Data;

@Data
public class UpdateTaskRequest {
    private String taskId;
    private String title;
    private String description;
    private String status;

}
