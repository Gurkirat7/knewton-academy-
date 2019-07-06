package com.knewton.academy.service;

public interface AssignmentService {
	public abstract void createAssignment(Assignment assignment);
	public abstract void updateAssignment(Integer assignmentId, Assignment assignment);
	public abstract void deleteAssignment(Integer assignmentId);
}
