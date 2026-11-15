package com.office.dw.member.service;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

/**
 * 학생을 등록하는 서비스. 같은 학번이 없을 때만 등록하고, 이미 있으면 안내 문구를 출력한다.
 */
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
