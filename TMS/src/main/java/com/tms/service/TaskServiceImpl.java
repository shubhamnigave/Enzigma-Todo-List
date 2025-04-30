package com.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.dao.TaskDao;
import com.tms.pojos.Task;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao taskDao;

	
	@Override
	public List<Task> getAllTasks() {
		return taskDao.findAll();
	}

	
	@Override
	public String addTask(Task task) {
		taskDao.save(task);
		return "Task Added SuccessFully";
	}

	@Override
	public String updateTask(Long id, Task task) {
	
		if(taskDao.existsById(id)) {
			task.setTaskId(id);
			taskDao.save(task);
			return "Task Updated SuccessFully";
		}
		return "Update Failed";
	}


	@Override
	public String deleteTask(Long id,Task task) {
		if(taskDao.existsById(id)) {
			taskDao.deleteById(id);
			return "Deleted SuccessFully";
		}
		return "Delete Failed";
	}
	
	@Override
	public Task getTaskById(Long id) {
		// TODO Auto-generated method stub
		return taskDao.findById(id).orElseThrow();
	}





	


	
	

}
