package com.office.example;

public class OurStudent {
	
	// 속성
//	int grade;					// 학년
//	int classNo;				// 반번호
//	int studentNo;				// 개인번호
//	String studentName;			// 학생이름
//	boolean absence;			// 휴학구분
	
	// 컴플레인 이후, 수정
	int grade = 1;				// 학년
	int classNo;				// 반번호
	int studentNo;				// 개인번호
	String studentName;			// 학생이름
	boolean absence = false;	// 휴학구분

	
	//생성자
//	public OurStudent() {		// 디폴트 생성자
//		
//	}
	
	
	// 생성자 오버로딩 ==> 절대로 필수인 속성 초기화를 놓치는 오류를 피할 수 있다.
	// 초기의 모든 객체를 초기화하는 버전
	public OurStudent(
			int grade,
			int classNo,
			int studentNo,
			String studentName,
			boolean absence) {		// 디폴트 생성자
		
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	
	// 컴플레인 이후, 수정해서 객체 3개를 초기화하는 버전
	public OurStudent(
			int classNo,
			int studentNo,
			String studentName) {		// 디폴트 생성자
		
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	// 컴플레인 이후, 수정해서 객체 4개를 초기화하는 버전
	public OurStudent(
			int grade,
			int classNo,
			int studentNo,
			String studentName) {		// 디폴트 생성자
		
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	
	// 메서드
	public void printInfo() {
		System.out.println("Grade : " + grade);
		System.out.println("ClassNo : " + classNo);
		System.out.println("StudentNo : " + studentNo);
		System.out.println("StudentName : " + studentName);
		System.out.println("Absence : " + absence);
	}
	
}
