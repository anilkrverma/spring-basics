package com.anil.spring.springbasics.loosecoplingusingspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBinarySearch {

    @Autowired // This annotation mark it as dependencies which Spring handles automatically.
    private SortAlgorithm sortAlgorithm;

    //Code still works if we remove below line as the dependency injection is done through Setter injection when
    // constructor is not found.

//    public MyBinarySearch(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    public int binarySearch(int[] numbers, int numToSearch){
        //Sort the numbers

////        BubbleSort bubbleSort = new BubbleSort();
////        bubbleSort.bubbleSort(numbers);
//
//        // Or
//
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(numbers);
//
//        //Above code is tightly coupled with either of the algo to be used, we can not manage using sort algo dynamically.

        //Lets make it loosely coupled by using SortAlgorithm interface.

        sortAlgorithm.sort(numbers);

        // Login to search

        //Return the number found

        return 5; //returning any hypothetical number
    }
}
