package com.office.ex;

public class AddCal implements ICal {
	
	@Override
	public void doCal(int n1, int n2) {
		System.out.println("ADD Result : " + (n1 + n2));
		
	}

}
