package com.kaustubh.spring.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	public void create() {
		System.out.println("Created");
	}

}
