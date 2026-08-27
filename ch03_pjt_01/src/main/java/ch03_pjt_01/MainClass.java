package ch03_pjt_01;

import org.springframework.context.support.GenericXmlApplicationContext;

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
