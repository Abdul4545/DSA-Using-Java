package Sorting.Quick_Sort;

import java.util.Arrays;

public class QuickSort1 {

    public static void sort(int[] arr, int low, int high) {
        if(low > high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } 
        }

        // now the pivot is at correct index, sort two halves now

        sort(arr, low, end);
        sort(arr, start, high);

    }

    public static void main(String[] args) {

        int arr[] = {2,5,3,7,1,8,6};

        sort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

        int arr1[] = {1,2,3,4,4,5,6};
        sort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        
        
    }

}
