package com.office.ex.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoolingSystem {
	
	private boolean power;				// 전원(외부 접근 불가)
	private int targetTemperature;		// 희망 온도(외부 접근 불가)
	private String dateOfManufacture;	// 제조일(외부 접근 불가)
	private String color;				// 색상(외부 접근 불가)
	
	public CoolingSystem(String color) {
		
		power = false;
		targetTemperature = 18;
		dateOfManufacture = getSystemDateTime();			// 현재시간
		
		this.color = color;
		
	}
	
	//------------------------------------------------------------
	
	// 기능(메서드)
	// 에어컨의 전체 정보를 출력하는 메서드
	
	public void printSystemInformation() {
		
		System.out.println("=========== SystemInformation ===========");
		System.out.println("Power : " + isPower());
		System.out.println("TargetTemperature : " + getTargetTemperature());
		System.out.println("DateOfManufacture : " + getDateOfManufacture());
		System.out.println("Color : " + getColor());
		System.out.println("=========================================");
		
	}
	
	//------------------------------------------------------------
	
//	// name convention
//	
//	// 조회한다 : get(getter)
//	// 접근체한자(public) 반환데이터타입 get+속성(변수)명
//	public int getTargetTemperature() {
//		return this.targetTemperature;
//	}
//	
//	// 설정한다 : set(setter)
//	// 접근체한자(public) 반환데이터타입x set+속성(변수)명
//	public void setTargetTemperature(int targetTemperature) {
//		this.targetTemperature = targetTemperature;
//	}
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public int getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(int targetTemperature) {
		
		if (!power) power = true;
		
		if (targetTemperature < 18) {
			targetTemperature = 18;
			
		} else if (targetTemperature > 30) {
			targetTemperature = 30;
		}
		
		this.targetTemperature = targetTemperature;
	}	
	

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

//	public void setDateOfManufacture(String dateOfManufacture) {
//		this.dateOfManufacture = dateOfManufacture;
//	}

	public String getColor() {
		return color;
	}

//	public void setColor(String color) {
//		this.color = color;
//	}

	//------------------------------------------------------------
	
	// 현재 시스템 날짜, 시간 구하기 메서드
	private String getSystemDateTime() {
		
		LocalDateTime now = LocalDateTime.now();	// 현재 시스템의 날짜와 시간 구하기
		String dateTime = 
				now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				// 날짜와 시간 현식을 맞춤
		
		return dateTime;
		
		// 3번째 사진 참조 : 이미지 만들기
		
	}
	
}
