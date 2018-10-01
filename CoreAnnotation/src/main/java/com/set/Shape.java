package com.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("shape")
public class Shape {
	@Value(value="circle")
	String shapeType;
	public void drawShape(){
		System.out.println(shapeType+ " is drawn");
	}
	public String getShapeType() {
		return shapeType;
	}
	@Autowired
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	
	
}
