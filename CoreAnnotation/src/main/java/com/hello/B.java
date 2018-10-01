package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("B")
class B{
	A a;
	@Autowired
	void setA(A a){
		this.a=a;
		System.out.println("HI");
	}
	/*public void hello(){
		System.out.println("HI");
	}*/
}