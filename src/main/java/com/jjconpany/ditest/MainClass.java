package com.jjconpany.ditest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class); //콘테이너 생성

		Student stu1 = ctx.getBean("student1", Student.class);
		System.out.println(stu1.getName()); // 홍길동
		
	}

}
