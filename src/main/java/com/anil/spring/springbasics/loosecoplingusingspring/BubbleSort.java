package com.anil.spring.springbasics.loosecoplingusingspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //this annotation makes this class as bean

public class BubbleSort implements SortAlgorithm {

    public int[] sort(int[] numbers){
        System.out.println("Bubble sort called.");
        //Logic to bubble sort algo

        return numbers;
    }
}
