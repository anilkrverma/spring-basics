package com.anil.spring.springbasics.tightlycoupled;

public class MyBinarySearch {

    public int binarySearch(int[] numbers, int numToSearch){
        //Sort the numbers

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(numbers);

        // Or

        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);

        //Above code is tightly coupled with either of the algo to be used, we can not manage using sort algo dynamically.


        // Login to search

        //Return the number found

        return 5; //returning any hypothetical number
    }
}
