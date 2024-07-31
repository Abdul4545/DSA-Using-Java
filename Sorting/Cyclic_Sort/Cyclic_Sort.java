package Sorting.Cyclic_Sort;

import java.util.Arrays;

public class Cyclic_Sort {

    static void cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // swap
            if(arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }

            else {
                i++;
            }
        }
    }


    public static void main(String[] args) {

        int arr[] = {3,2,6,1,5,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        int arr1[] = {6,5,4,3,2,1};
        cyclicSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        int arr2[] = {1,2,3,4};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
    
}
