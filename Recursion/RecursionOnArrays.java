package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionOnArrays {

    // print array elements
    static void printArray(int arr[], int index) {
        
        if(index  == arr.length) {
            return;
        }

        System.out.println(arr[index]);
        printArray(arr, index+1);
    }


    // max element in array
    static int maxInArray(int arr[], int index) {

        if(index == arr.length - 1) {
            return arr[index];
        }

        int smallAns = maxInArray(arr, index+1);

        return Math.max(arr[index], smallAns);

    }


    // Sum of array elements
    static int arraySum(int arr[], int index) {
    
        if(index == arr.length) {
            return 0;
        }

        return arraySum(arr, index + 1) + arr[index];
    }


    static int lenearSearch(int arr[], int target, int index) {
        
        // base work
        if(index == arr.length) {
            return -1;
        }

        // self work
        if(arr[index] == target) {
            return index;
        }

        // recursive work
        return lenearSearch(arr, target, index + 1);
        
    }


    static ArrayList <Integer> findAllIndices(int arr[], int target, int index) {

        ArrayList <Integer> ans = new ArrayList<>(); // empty ArrayList 

        if(index == arr.length) {
            return ans; 
        }

        // self work
        if(arr[index] == target) {  // it will add element of 0 index also if it matches as we are passing 0 index
            ans.add(index);
        }

        // it will return elements after 0th index
        ArrayList <Integer> smallAns = findAllIndices(arr, target, index + 1);
        
        ans.addAll(smallAns);

        return ans;
    }



    static ArrayList <Integer> findAllIndices(int arr[], int target, int index, ArrayList<Integer> list) {

        if(index == arr.length) {
            return list; 
        }

        // self work
        if(arr[index] == target) {  
            list.add(index);
        }

        return findAllIndices(arr, target, index + 1 , list);  
    }


    static boolean isSorted(int arr[], int index) {
        if(index == arr.length-1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index+1);

    }


    static int rotatedBinarySearch(int arr[], int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid-1);
            }

            else {
                return rotatedBinarySearch(arr, target, mid+1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]) {
            return rotatedBinarySearch(arr, target, mid+1, end);
        }

        return rotatedBinarySearch(arr, target, start, mid-1);
    }


    public static void main(String[] args) {
        int[] arr = {12, 2, 5, 1, 6, 2, 8, 9};
        // int[] arr1 = {9};
        // int[] arr2 = {1,2,3,4,5};
        // int[] arr3 = {};

        
        // printArray(arr, 0);

        // System.out.println(maxInArray(arr, 0));
        // System.out.println(maxInArray(arr1, 0));

        // System.out.println(arraySum(arr2, 0));
        // System.out.println(arraySum(arr1, 0));
        // System.out.println(arraySum(arr, 4));
        // System.out.println(arraySum(arr3, 0));


        // System.out.println(lenearSearch(arr, 1, 0));

        // ArrayList <Integer> ans = findAllIndices(arr, 2, 0);
        // for(Integer i : ans) {
        //     System.out.print(i + " ");
        // }
        

        System.out.println(findAllIndices(arr, 2, 0, new ArrayList<>()));


        int arr1[] = {1,2,3,4,5,9, 21};
        System.out.println(isSorted(arr1, 0));

        int arr2[] = {1,2,3,34,5,9, 21};
        System.out.println(isSorted(arr2, 0));
        Arrays.sort(arr2);

        // search in sorted rotated array

        int arr3[] = {4,5,6,7,8,1,2};
        System.out.println(rotatedBinarySearch(arr3, 2, 0, arr3.length-1));

        System.out.println(rotatedBinarySearch(arr3, 4, 0, arr3.length-1));


    }
}

