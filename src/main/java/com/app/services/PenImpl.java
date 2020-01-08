package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.interfaces.Ink;
import com.app.interfaces.Pen;

@Component
public class PenImpl implements Pen {
	@Autowired
	@Qualifier("blackInk")
	private Ink ink;

	public PenImpl() {
		super();
	}

	public void write() {
		ink.getBrandName();
		ink.getColor();

	}

}
