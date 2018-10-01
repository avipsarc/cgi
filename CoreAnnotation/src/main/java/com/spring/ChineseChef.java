package com.spring;

import org.springframework.stereotype.Component;

@Component("chinesechef")
public class ChineseChef implements InternationalChef{
	@Override
	public void makeFood(){
		System.out.println("Woktos Noodles");
	}
	
}