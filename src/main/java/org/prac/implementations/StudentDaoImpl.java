package org.prac.implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.prac.dao.StudentDAO;
import org.prac.models.Student;

public class StudentDaoImpl implements StudentDAO{
	
	private HashMap<String, Student> students;
	
	public StudentDaoImpl() {
		this.students=new HashMap<String, Student>();
	}
	public StudentDaoImpl(HashMap<String, Student> students) {
		this.students=students;
	}

	@Override
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(this.students.values());
	}

	@Override
	public Student getStudent(String id) {
		return this.students.get(id);
	}

	@Override
	public boolean addStudent(Student student) {
		if(this.students.get(student.getId())!=null) {
			return false;
		}
		this.students.put(student.getId(), student);
		return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		if(this.students.get(student.getId())==null) {
			return false;
		}
		this.students.put(student.getId(), student);
		return true;
	}

	@Override
	public boolean deleteStudent(String id) {
		if(this.students.get(id)==null) {
			return false;
		}
		this.students.remove(id);
		return true;
	}
}
