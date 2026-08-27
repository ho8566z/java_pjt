package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

public class StudentSelectService {

	private StudentDao studentDao;
	
	public StudentSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	// select
	public Student select(String sNum) {
		if (verify(sNum)) {
			return studentDao.select(sNum);
			
		} else {
			System.out.println("Student information is available!!");
			return null;
			
		}

	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
		
	}
	
}
