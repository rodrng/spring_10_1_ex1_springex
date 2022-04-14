package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student =  ctx.getBean("student", Student.class);
		Worker worker = ctx.getBean("worker", Worker.class);
		
		student.getStudentInfo();
		worker.getWorkerInfo();
		
		ctx.close();
		
	}

}