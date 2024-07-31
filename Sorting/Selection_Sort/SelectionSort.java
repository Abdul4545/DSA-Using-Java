package Sorting.Selection_Sort;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {

            int minIndex = i;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

    static void selectionSort1(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            
            // find the max element in the remaining array and swap with correct index

            int lastIndex = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

    }


    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int arr[] = {5,4,8,7,9,2};
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
 