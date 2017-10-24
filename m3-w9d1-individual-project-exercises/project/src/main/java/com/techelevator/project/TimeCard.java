package com.techelevator.project;

import java.time.LocalDateTime;

public class TimeCard {
	
	private Long id;
	private String username;
	private String project;
	private LocalDateTime start;
	private LocalDateTime end;
	private String notes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public String getNote() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	

}

