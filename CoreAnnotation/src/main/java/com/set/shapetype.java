package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.set.Shape;

public class shapetype {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext("Config.class");
		//Shape s=ctx.getBean("shape",Shape.class);
		Shape s = ctx.getBean("shape",Shape.class);
//		s.getShapeType();
		s.drawShape();
	}
}
