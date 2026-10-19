package com.office.dw.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.office.dw.member.Student;

/**
 * 학생 정보를 학번(sNum)을 키로 하는 Map 에 저장하고 꺼내는 DAO.
 */
public class StudentDao {

	private Map<String, Student> studentDB = new HashMap<String, Student>();

	/** 학생 정보를 새로 저장한다. 같은 학번이 있으면 덮어쓴다. */
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}

	/** 학번으로 학생 정보를 조회한다. 없으면 null 을 돌려준다. */
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}

	/** 같은 학번의 학생 정보를 새 값으로 바꾼다. */
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}

	/** 학번에 해당하는 학생 정보를 삭제한다. */
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}

	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
	
}
