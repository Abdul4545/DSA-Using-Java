import java.util.Scanner;

public class ArrayIntermediate4 {

    // print array / array traversal
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    // return the prefix sum/returning sum in the same array without creating a new array
    static int[] prefixSumArray(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            arr[i] =  arr[i-1] + arr[i];
        }
        return arr;
    }
    

    // suffix sum array
    static int[] suffixSumArray(int[] arr) {
        int n = arr.length;
        for(int i = n-2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i+1];
        }
        return arr;
    }

    // Check if we can partition the array into two subarrays with equal sum.
    // Formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array

    static int arrayElementSum(int[] arr) {
        int totalSum = 0;
        for(int i = 0; i <arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int sum = arrayElementSum(arr);

        int prefSum = 0;
        for(int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = sum - prefSum;
            if(suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6};
        // prefixSumArray(arr);
        // printArray(arr);


        // Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included)
        int[] prefSum = prefixSumArray(arr);
        System.out.print("Enter how many times you want to run the query : ");
        int q = sc.nextInt();

        while(q-- > 0) {
            System.out.print("Enter start of range you want to print the prefix sum array : ");
            int left = sc.nextInt();
            int right = sc.nextInt();
            int ans = 0;
 
            ans = prefSum[right] - prefSum[left-2];
            System.out.println("Sum is : " + ans);
        }


        //subarray Check
        // int[] arr1 = {5,3,2,6,3,1};
        // boolean answer = equalSumPartition(arr1);
        // System.out.println(answer);

        // int[] arr2 = {1,3,2,4,5};
        // boolean answer1 = equalSumPartition(arr2);
        // System.out.println(answer1);

        // int[] arr3 = {1,1,1,1,1,1};
        // boolean answer2 = equalSumPartition(arr3);
        // System.out.println(answer2);

        // int[] arr4 = {1,2,3,4,5};
        // suffixSumArray(arr4);
        // printArray(arr4); 

        sc.close();
    }
}



