package com.office.ex.service;

import com.office.ex.worker.Chajang;
import com.office.ex.worker.Daeri;
import com.office.ex.worker.Gwajang;

public class PayService {
	
	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang = new Chajang();
		
	}
	
	public void pay(int month) {
		
//		daeri.money = 1100000;
		// 급여액 변경할 수 있는 권한 CEO
		daeri.setMoney(1100000, "CEO");
		
		daeri.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월, 급여 지급완료");
	}

}
