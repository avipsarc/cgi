package com.spring;

import org.springframework.stereotype.Component;

@Component("italianchef")

public class IndianChef implements InternationalChef{
	@Override
	public void makeFood(){
		System.out.println("Tangdi Kabab");
	}
	
}