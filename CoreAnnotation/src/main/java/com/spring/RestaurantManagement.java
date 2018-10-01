package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantManagement{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		InternationalChef chef=ctx.getBean("chinesechef",InternationalChef.class);
		chef.makeFood();
	}
}