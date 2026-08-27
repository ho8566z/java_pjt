package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

public class StudentDeleteService {

	private StudentDao studentDao;
	
	public StudentDeleteService(StudentDao studentDao) {
		this.studentDao = studentDao;
		
	}
	
	// delete
	public void delete(String sNum) {
		if (verify(sNum)) {
			studentDao.delete(sNum);
			
		} else {
			System.out.println("Student information available!!");
			
		}
		
	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
				
	}
	
}
