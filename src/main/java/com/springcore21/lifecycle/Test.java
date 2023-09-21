package com.springcore21.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore21/lifecycle/lifeconfig.xml");
         Pepsi s1=(Pepsi) context.getBean("s1");
         System.out.println(s1);
         context.registerShutdownHook();
         
         System.out.println("++++++++++++++++++++++++++");
         Sprite s2=(Sprite) context.getBean("s2");
         System.out.println(s2);
	}

}
