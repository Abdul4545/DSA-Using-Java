package Sorting.Merge_Sort;

import java.util.Arrays;


// complexity : O(N*log(N))
public class MergeSort1 {

    static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // new array object is being created and passed in recursion
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0; // pointing on 1st index of first
        int j = 0; // pointing on 1st index of second
        int k = 0; // pointing on 1st index of mix

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }

            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }





    static void mergeSortInPlace(int arr[], int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        // new array object is being created and passed in recursion
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end-start];

        int i = start; // pointing on 1st index of first
        int j = mid; // pointing on 1st index of second
        int k = 0; // pointing on 1st index of mix

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }

            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }


    public static void main(String[] args) {

        // int arr[] = {2, 1, -12, 67, 43, 98, 56, -98};
        // arr = mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        int arr[] = {2, 1, -12, 67, 43, 98, 56, -98};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

}
