package com.app.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.SpringConfig;
import com.app.services.Writer;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
Writer writer=(Writer)ac.getBean("writer");
writer.write();
	}

}
