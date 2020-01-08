package com.app.services;

import org.springframework.stereotype.Component;

import com.app.interfaces.Ink;
@Component("blueInk")
public class BlueInk implements Ink{
	public void getBrandName() {
		// TODO Auto-generated method stub
		System.out.println("BlueInk BrandName");
	}

	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("BlueInk Color");
		
	}

}
