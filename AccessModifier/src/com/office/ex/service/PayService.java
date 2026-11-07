package com.office.ex.service;

import com.office.ex.worker.Chajang;
import com.office.ex.worker.Daeri;
import com.office.ex.worker.Gwajang;

/**
 * 대리, 과장, 차장의 급여 지급을 처리하는 서비스.
 * 직급별 Worker 객체를 생성해 두고 pay() 로 한 번에 지급한다.
 */
public class PayService {
	
	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang = new Chajang();
		
	}
	
	/**
	 * 해당 월의 급여를 직급별(대리, 과장, 차장)로 지급한다.
	 * 대리 급여액은 변경 권한이 있는 CEO 로 먼저 조정한다.
	 */
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
