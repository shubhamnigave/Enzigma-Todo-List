 package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.pojos.Task;

public interface TaskDao extends JpaRepository<Task, Long> {

}
