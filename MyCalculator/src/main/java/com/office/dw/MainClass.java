package com.office.dw;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 스프링 설정 파일(applicationContext.xml)을 읽어 객체들을 만든다
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
		calAssembler.assemble();
		
		// 사용이 끝난 스프링 컨테이너를 닫는다
		ctx.close();
		
	}

}
