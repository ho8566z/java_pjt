package ch03_pjt_01;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 스프링 컨테이너에서 TransportationWalk 빈을 꺼내 이동하는 시작점.
 * applicationContext.xml 에 등록된 객체를 직접 new 하지 않고 받아 쓴다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationWalk = 
				ctx.getBean("transportationWalk", TransportationWalk.class);
		
		transportationWalk.move();
		
	}

}
