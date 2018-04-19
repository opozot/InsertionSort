package com.insertionSort;

import java.util.Arrays;
import static com.insertionSort.InsertionSort.insertionSort;

public class Main {
    public static void main(String[] arr) {
        int[] arr1 = {3, 8, 5, 4, 1, 9, -2};

        insertionSort( arr1 );

        System.out.println( Arrays.toString( arr1 ) );
    }
}
