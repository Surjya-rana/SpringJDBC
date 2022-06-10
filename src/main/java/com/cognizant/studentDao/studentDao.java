package com.cognizant.studentDao;

import java.util.List;

import com.cognizant.entity.student;

public interface studentDao {
	public int insert(student student);
	public int update(student student);
	public int delete(int id);
	public student getStudent(int studentId);
	public List<student> getAllStudent();
}
