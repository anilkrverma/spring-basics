package com.anil.spring.springbasics.loosecoplingusingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);

		MyBinarySearch binarySearch = applicationContext.getBean(MyBinarySearch.class);
		int n = binarySearch.binarySearch(new int[] {1, 5, 3}, 3);
		System.out.println("Number found ->" + n);
	}

}
