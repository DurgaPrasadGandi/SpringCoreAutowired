package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.interfaces.Pen;
@Component(value="writer")
public class Writer {
	 @Autowired
	private Pen pen;
	
	public Writer() {
		super();
	}

	public void write(){
		pen.write();
	}

}
