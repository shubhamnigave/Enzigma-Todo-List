package com.tms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.pojos.Task;
import com.tms.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
@Autowired
private TaskService taskService;
@GetMapping
public ResponseEntity<?>getAllTasks(){
	return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());
}
	@PostMapping
	public ResponseEntity<?>addTask(@RequestBody Task task){
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.addTask(task));
}

	@PutMapping("/{id}")
	public ResponseEntity<?>updateTask(@PathVariable Long id ,@RequestBody Task task){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.updateTask(id,task));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteTask(@PathVariable Long id, @RequestBody Task task){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.deleteTask(id,task));
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getTaskById(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.getTaskById(id));
	}
}
