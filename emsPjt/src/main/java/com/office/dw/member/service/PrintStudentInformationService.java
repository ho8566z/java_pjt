package com.office.dw.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.office.dw.member.Student;

public class PrintStudentInformationService {

	private StudentAllSelectService allSelectService;
	
	public PrintStudentInformationService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
		
	}
	
	// print
	public void printStudentInfo() {
		Map<String, Student> allStudnet =
				allSelectService.allSelect();
		
		Set<String> keys = allStudnet.keySet();
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("START -------------------------------------");
		while (iterator.hasNext()) {
			String key = iterator.next();
			
			Student student = allStudnet.get(key);
			System.out.print("sNum: " + student.getsNum() + "\t");
			System.out.print("|sId: " + student.getsId() + "\t");
			System.out.print("|sPw: " + student.getsPw() + "\t");
			System.out.print("|sName: " + student.getsName() + "\t");
			System.out.print("|sAge: " + student.getsAge() + "\t");
			System.out.print("|sGender: " + student.getsGender() + "\t");
			System.out.println("|sMajor: " + student.getsMajor() + "\t");
			
		}
		
		System.out.println("END -------------------------------------");
		
	}
	
}









