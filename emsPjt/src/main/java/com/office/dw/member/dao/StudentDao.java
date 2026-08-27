package com.office.dw.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.office.dw.member.Student;

public class StudentDao {

	private Map<String, Student> studentDB = new HashMap<String, Student>();
	
	// create
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	// read
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	// update
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	// delete
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}

	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
	
}
