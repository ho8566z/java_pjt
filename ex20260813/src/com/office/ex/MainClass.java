package com.office.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 상속(Inheritance) ==  인간세계의 '상속'과 동일하다.
		 * ParentsClass가 ChildClass한테 상속(속성, 기능)할 수 았다.
		 * 
		 * -1 코드 재사용
			부모 클래스의 공통적인 속성과 기능을 자식 클래스가 사용할 수 있습니다.
			중복 코드를 줄일 수 있습니다.
		 * -2 기능 확장 및 재정의
			자식 클래스에서 새로운 기능을 추가할 수 있습니다.
			부모의 메서드를 오버라이딩(Overriding)하여 자식에게 맞게 변경할 수도 있습니다.
		 * -3 다형성
			부모 클래스 타입으로 자식 클래스 객체를 다룰 수 있습니다.
			이를 통해 하나의 부모 타입으로 여러 자식 객체를 일관되게 처리할 수 있습니다.
		 * 
		 * 1번째 사진참조 <- 이미지 만들기-1
		 * 
		 * 
		 * 이미지 만들기-2
		 * class GrandParentClass {
			    void grandParentMethod() {
			        System.out.println("GrandParent 기능");
			    }
			}
			
			class ParentClass extends GrandParentClass {
			    void parentMethod() {
			        System.out.println("Parent 기능");
			    }
			}
			
			class ChildClass extends ParentClass {
			    void childMethod() {
			        System.out.println("Child 기능");
			    }
			}
			
			데이터타입
			GrandParentClass => GrandParentClass
			ParentClass => GrandParentClass, ParentClass
			ChildClass => GrandParentClass, ParentClass, ChildClass
		 */
		
		
		ChildClass childClass = new ChildClass();
		childClass.print();
		
		ParentClass[] parentClasses = {childClass};
		
	}

}
