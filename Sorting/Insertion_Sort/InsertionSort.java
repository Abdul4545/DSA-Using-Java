package Sorting.Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int arr[]) {
        
        int n = arr.length;

        // we assume that 1st element at index 0 is sorted
        for(int i = 1; i < n; i++) {

            int j = i;

            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    

    static void insertionSort1(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            // arr.length-1 = N-2
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {4,7,5,2,9,8,1};
        insertionSort1(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
