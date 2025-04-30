package com.tms.service;

import java.util.List;

import com.tms.pojos.Task;

public interface TaskService {

	List<Task> getAllTasks();

	String  addTask(Task task);

	String updateTask(Long id, Task task);

	String deleteTask(Long id, Task task);

	Task getTaskById(Long id);  

	
	
	}

	


