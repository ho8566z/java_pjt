package com.office.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ChildResturant 
				extends FatherRestaurant
				implements IFatherRestaurant {
	
	static final int FATHER = 1;
	static final int CHILD = 2;

//	@Override
	public void makeBokkeumbap(int family) {
		
//		ArrayList<String> arrayList = new ArrayList<String>();
		List<String> arrayList = new ArrayList<String>();
		
//		Vector<String> vector = new Vector<String>();
		List<String> vector = new Vector<String>();
		
		arrayList.add("");
		vector.add("");
		
		// List<String>으로 데이터 타입 통합
		
		ArrayList<List<String>> list = new ArrayList<List<String>>();
		list.add(arrayList);
		list.add(vector);
		

//		super.makeBokkeumbap();
		
		switch (family) {
		case FATHER:
			super.makeBokkeumbap();
			
			break;
			
		case CHILD:
			System.out.println("[ChildResturant] makeBokkeumbap");
			
			break;
		}
		
	}
	

	@Override
	public void makeTangsuyuk() {
		// TODO Auto-generated method stub
		
	}

	/*
	@Override	// 없어도 정의됨
	// 오버라이드(Override)
	// 상위 클래스의 기능을 하위 클래스에서 기능을 수정/추가/삭세해 재정의하는 것
	public void makeBokkeumbap() {
		System.out.println("[ChildResturant] makeBokkeumbap");
		
	}
	*/
	
	// this는 해당 인스턴스에서 가리키지만, super는 하위클래스에서 상위클래스를 가리킨다.
	
	

}
