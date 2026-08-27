package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

public class StudentModifyService {

	private StudentDao studentDao;
	
	public StudentModifyService(StudentDao studentDao) {
		this.studentDao = studentDao;
		
	}
	
	// modify
	public void modify(Student student) {
		if (verify(student.getsNum())) {
			studentDao.update(student);	
			
		} else {
			System.out.println("Student information is available!!");
			
		}

	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
		
	}
	
}
