package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

/**
 * 학생 정보를 수정하는 서비스. 등록된 학생일 때만 수정하고, 없으면 안내 문구를 출력한다.
 */
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
	
	/** 해당 학번의 학생이 있는지 확인한다. */
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
		
	}
	
}
