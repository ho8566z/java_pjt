package com.office.dw.member.service;

import com.office.dw.member.dao.StudentDao;

/** 학번으로 학생 정보를 삭제하는 서비스. */
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
	
	// 삭제하기 전에 해당 학번의 학생이 있는지 확인한다
	private boolean verify(String sNum) {
		return studentDao.select(sNum) != null;
				
	}
	
}
