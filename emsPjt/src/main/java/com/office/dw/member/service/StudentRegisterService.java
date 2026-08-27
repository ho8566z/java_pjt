package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

public class StudentRegisterService {

	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	// register
	public void register(Student student) {
		if (verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already registered!!");
		}

	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
		
	}
	
}
