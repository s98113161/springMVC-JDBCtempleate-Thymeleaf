package com.kang.springdemo.dao;

import java.util.List;

import com.kang.springdemo.model.Student;

public interface StudentDAO {
	public void update(Student student);

	public void insert(Student student);

	public void delete(int studentId);

	public Student findById(int studentId);

	public List<Student> list();
}
