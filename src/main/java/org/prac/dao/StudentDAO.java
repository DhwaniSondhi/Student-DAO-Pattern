package org.prac.dao;

import java.util.List;

import org.prac.models.Student;

public interface StudentDAO {

	public List<Student> getAllStudents();
	public Student getStudent(String id);
	public boolean addStudent(Student student);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(String id);
}
