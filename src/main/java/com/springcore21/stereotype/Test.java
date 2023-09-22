package com.springcore21.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore21/stereotype/stereoconfig.xml ");
		
		Student as = con.getBean("as",Student.class);
		System.out.println(as);
	}

}
