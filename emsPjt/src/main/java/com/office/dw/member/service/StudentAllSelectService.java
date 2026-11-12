package com.office.dw.member.service;

import java.util.Map;

import com.office.dw.member.Student;
import com.office.dw.member.dao.StudentDao;

/** 저장된 학생 정보 전체를 조회하는 서비스. */
public class StudentAllSelectService {

	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
		
	}
	
	// all select
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
		
	}
	
}
