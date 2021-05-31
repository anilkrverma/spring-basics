package com.anil.spring.springbasics.looselycoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBasicsApplication.class, args);

		//MyBinarySearch binarySearch = new MyBinarySearch(new QuickSort());
		MyBinarySearch binarySearch = new MyBinarySearch(new BubbleSort()); // Passing algo dynamically while creating object.
		int n = binarySearch.binarySearch(new int[] {1, 5, 3}, 3);
		System.out.println("Number found ->" + n);
	}

}
