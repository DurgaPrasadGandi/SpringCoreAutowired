package com.app.services;

import org.springframework.stereotype.Component;

import com.app.interfaces.Ink;
@Component("blackInk")
public class BlankInk implements Ink {

	public void getBrandName() {
		// TODO Auto-generated method stub
		System.out.println("BlankInk BrandName");
	}

	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("BlankInk Color");
		
	}

}
