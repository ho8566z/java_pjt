package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

/**
 * 학번으로 학생 한 명을 조회하는 서비스. 없으면 안내 문구를 출력하고 null 을 반환한다.
 */
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
	
	/** 해당 학번의 학생이 있는지 확인한다. */
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
		
	}
	
}
