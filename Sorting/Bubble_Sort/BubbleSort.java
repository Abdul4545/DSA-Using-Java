package Sorting.Bubble_Sort;

import java.util.Arrays;

// in the first pass the largest element goes to the end
// in the 2nd pass the 2nd largest element goes to its corrct position and so on ...

public class BubbleSort {

    static void bubbleSort(int arr[]) {

        for(int i = 0; i < arr.length-1; i++) {
            boolean flag = false; // has any swapping happenend
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(flag == false) { // has any swap happened
                return;
            }
        }
    }

    static void bubbleSort1(int arr[]) {
        // run the steps n-1 times
        for(int i = 0; i < arr.length-1; i++) {

            // for each step, max item will come at the last respective index

            boolean flag = false;
            for(int j = 1; j < arr.length - i; j++) {
                // compare and swap
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }

            if(!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,7,3,2,9,6};
        bubbleSort1(arr);

        System.out.println(Arrays.toString(arr));
        
    }
}
