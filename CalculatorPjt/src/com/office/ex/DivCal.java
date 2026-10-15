package com.office.ex;

public class DivCal implements ICal {

	@Override
	public void doCal(int n1, int n2) {
		System.out.println("DIV Result : " + (n1 / (float) n2));
		
	}
	
}
