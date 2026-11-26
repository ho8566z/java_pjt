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
	
	/** 전원, 희망 온도, 제조일, 색상을 한 번에 콘솔에 출력한다. */
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
	
	/** 전원이 켜져 있는지 돌려준다. */
	public boolean isPower() {
		return power;
	}

	/** 전원을 켜거나 끈다. */
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	/** 현재 설정된 희망 온도를 돌려준다. */
	public int getTargetTemperature() {
		return targetTemperature;
	}

	/**
	 * 희망 온도를 설정한다. 전원이 꺼져 있으면 함께 켠다.
	 * 허용 범위는 18~30도이며, 범위를 벗어난 값은 가장 가까운 한계값으로 보정한다.
	 *
	 * @param targetTemperature 설정할 희망 온도
	 */
	public void setTargetTemperature(int targetTemperature) {
		
		if (!power) power = true;
		
		// 18 미만이면 18, 30 초과면 30 으로 보정
		this.targetTemperature = Math.max(18, Math.min(30, targetTemperature));
	}	
	

	/** 객체를 만든 시점의 제조일 문자열을 돌려준다. */
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

//	public void setDateOfManufacture(String dateOfManufacture) {
//		this.dateOfManufacture = dateOfManufacture;
//	}

	/** 색상을 돌려준다. */
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
