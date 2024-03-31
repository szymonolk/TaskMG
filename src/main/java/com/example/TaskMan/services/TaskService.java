package com.example.TaskMan.services;

import com.example.TaskMan.Repositories.TaskRepository;
import com.example.TaskMan.models.TaskModel;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public ResponseEntity<TaskModel> createNewTask(TaskModel taskModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskRepository.save(taskModel));
    }

    public ResponseEntity<TaskModel> deactivateTask(TaskModel taskModel){
        taskModel.setActive(false);
        return ResponseEntity.status(HttpStatus.OK).body(taskRepository.save(taskModel));
    }
}
