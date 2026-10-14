package com.office.dw;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.office.dw.member.Student;
import com.office.dw.member.service.EMSInformationService;
import com.office.dw.member.service.PrintStudentInformationService;
import com.office.dw.member.service.StudentRegisterService;

public class MainClass {

	public static void main(String[] args) {
		
		// 스프링 컨테이너 생성 : applicationContext.xml 의 빈 정의를 읽어 객체를 만든다
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// 샘플 데이터
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] sNums = initSampleData.getsNums();
		String[] sIds = initSampleData.getsIds();
		String[] sPws = initSampleData.getsPws();
		String[] sNames = initSampleData.getsNames();
		int[] sAges = initSampleData.getsAges();
		char[] sGenders = initSampleData.getsGenders();
		String[] sMajors = initSampleData.getsMajors();
		
		// 데이터베이스에 샘플 데이터 등록
		StudentRegisterService studentRegisterService =
				ctx.getBean("studentRegisterService", StudentRegisterService.class);
		for (int i = 0; i < sNums.length; i++) {
			studentRegisterService.register(new Student(
					sNums[i], 
					sIds[i], 
					sPws[i], 
					sNames[i], 
					sAges[i], 
					sGenders[i], 
					sMajors[i]));
		}
		
		// 학생 리스트
		PrintStudentInformationService printStudentInformationService =
				ctx.getBean("printStudentInformationService", PrintStudentInformationService.class);
		printStudentInformationService.printStudentInfo();
		
		// 학생 등록
		studentRegisterService.register(new Student("hbs006", "deer", "p0006", "melissa", 26, 'W', "Music"));
		
		// 학생 리스트
		printStudentInformationService.printStudentInfo();
		
		// 시스템 정보
		EMSInformationService emsInformationService =
				ctx.getBean("eMSInformationService", EMSInformationService.class);
		emsInformationService.printEMSInformation();
		
		ctx.close();
		
	}
	
}
