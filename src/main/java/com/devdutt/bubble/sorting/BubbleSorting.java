package com.devdutt.bubble.sorting;
/*Time and space complexibility:-
worst time complexity:- O(N2) :- It happens when we have a reverse sorted array, as in that case, we will have to make all the passes.
best time complexity:- O(n) :-It happens when we have an already sorted array, as in that case, we will stop the procedure after a single pass.
*/

import java.util.Arrays;

public class BubbleSorting {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            System.out.println("Pass: " + i);
            int temp = 0;
            System.out.println("Internal Sapping :");
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }//if
                System.out.println(Arrays.toString(arr));
            }//inner-for
            if (flag == 0) {
                break;
            }
        }//outer-for
        System.out.println("Sorted Array:- " + Arrays.toString(arr));
    }//method

    public static void main(String[] args) {
        int[] arr = {15, 16, 6, 8, 5};
        int[] arr1 = {16, 14, 5, 6, 8};
        System.out.println("Input:- " + Arrays.toString(arr1));
        bubbleSort(arr1);
    }//main
}//class
