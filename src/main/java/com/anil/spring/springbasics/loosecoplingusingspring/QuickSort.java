package com.anil.spring.springbasics.loosecoplingusingspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {

    public int[] sort(int[] numbers){
        System.out.println("Quick sort called.");
        //Logic to quick sort algo

        return numbers;
    }
}
