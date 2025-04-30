package com.tms.pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long taskId;
	@Column(nullable=false)
	private String taskName;
	@Column(name="assigned_to",nullable=false)
	private String assignedTo;
	@Column(name="due_date")
	private LocalDate dueDate;
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Task(String taskName, String assignedTo, LocalDate dueDate, Status status) {
		super();
		this.taskName = taskName;
		this.assignedTo = assignedTo;
		this.dueDate = dueDate;
		this.status = status;
	}
	

	
}
